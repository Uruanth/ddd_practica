package co.com.sofka.tejido;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.tejido.eventos.*;

import java.util.stream.Collectors;

public class PedidoChange extends EventChange {
    public PedidoChange(Pedido pedido) {
        apply((PedidoCreado event) -> {
            pedido.disenhoId = event.getDisenhoId();
            pedido.produccionId = event.getProduccionId();
            pedido.factura = event.getFactura();
            pedido.feedback = event.getFeedback();
        });

        apply((FacturaCreada event) -> {
            pedido.factura = new Factura(
                    event.getFacturaId(),
                    event.getDatosCliente()
            );
        });

        apply((FeedbackAgregado event) -> {
            pedido.feedback.add(new Feedback(
                    event.getFeedbackId(),
                    event.getComentarios()
            ));
        });

        apply((ProduccionAsociada event) -> {
            pedido.produccionId = event.getProduccionId();
        });

        apply((ProductoAgregado event) -> {
            pedido.factura.agregarProducto(
                    event.getCosto(),
                    event.getNombre(),
                    event.getCaracteristicas());
        });

        apply((FacturaActualizada event) -> {
            pedido.factura.actualizarCliente(
                    event.getNombre(),
                    event.getContacto(),
                    event.getCedula()
            );
        });

        apply((DisenhoAsignado event)->{
            pedido.disenhoId = event.getDisenhoId();
        });

        apply((FeedbacksCalificados event) -> {
            pedido.feedback = event.getFeedback();
            var feedsPositivos = pedido.feedback.stream()
                    .filter(feed -> feed.comentarios().value().TipoComentario() == true)
                    .collect(Collectors.toSet())
                    .size();

            var balance = pedido.feedback.size() - feedsPositivos;
            if (balance < 0) System.out.println("Balance negativo");
            System.out.println("Balance Positivo");
        });

        apply((PedidoCancelado event)->{
            System.out.println("El pedido codigo "+event.getPedidoId()+" fue cancelado");
        });
    }
}
