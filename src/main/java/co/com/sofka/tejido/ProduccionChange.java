package co.com.sofka.tejido;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.tejido.eventos.*;
import co.com.sofka.tejido.values.Prototipo;

public class ProduccionChange extends EventChange {

    public ProduccionChange(Produccion produccion) {
        apply((ProduccionAgregada event) -> {
            produccion.prototipo = event.getPrototipo();
            produccion.responsable = event.getResponsable();
            produccion.materiales = event.getMateriales();
            produccion.qaId = event.getQaId();
        });

        apply((ResponsableAsignado event) -> {
            produccion.responsable = new Responsable(
                    event.getId(),
                    event.getNombreTejedor(),
                    event.getProductoFinal()
            );
        });


        apply((PrototipoAsignado event) -> {
            produccion.prototipo = new Prototipo(
                    event.getNombre(),
                    event.getCaracteristicas(),
                    event.getMateriales()
            );
        });

        apply((NombreTejedorActualizado event) -> {
            produccion.responsable.actualizarNombreTejedor(event.getNombreTejedor());
        });

        apply((MaterialesAsignados event) -> {
            produccion.materiales = new Materiales(
                    event.getId(),
                    event.getLana());
        });


        apply((PedidoConfirmado event) -> {
            System.out.println("el pedido con el producto: " + event.getProductoFinal().value().nombre() + " fue confirmado");
        });

        apply((QAAsignado event) -> {
            produccion.qaId = event.getQaId();
        });

    }
}
