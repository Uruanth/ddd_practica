package co.com.sofka.tejido;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.tejido.eventos.*;
import co.com.sofka.tejido.values.*;

import java.util.Objects;
import java.util.Set;

public class Pedido extends AggregateEvent<PedidoId> {

    protected DisenhoId disenhoId;
    protected ProduccionId produccionId;
    protected Factura factura;
    protected Set<Feedback> feedback;

    public Pedido(PedidoId pedidoId, DisenhoId disenhoId, ProduccionId produccionId, Factura factura, Set<Feedback> feedback) {
        super(pedidoId);
        subscribe(new PedidoChange(this));
        appendChange(new PedidoCreado(disenhoId,produccionId,  factura,  feedback));

    }

    public Pedido(PedidoId entityId) {
        super(entityId);
        subscribe(new PedidoChange(this));
    }

    public void generarFactura(DatosCliente datosCliente) {
        var facturaId = new FacturaId();
        Objects.requireNonNull(datosCliente, "datosCliente no puede ser nulo");
        appendChange(new FacturaCreada(facturaId, datosCliente));
     }

    public void agregarFeedbacks(String detalles, boolean tipoComentario) {
        var feedbackId = new FeedbackId();
        Objects.requireNonNull(feedbackId, "feedbackId no puede ser nulo");
        Objects.requireNonNull(tipoComentario, "tipoComentario no puede ser nulo");
        var comentarios = new Comentarios(detalles, tipoComentario);
        appendChange(new FeedbackAgregado(feedbackId, comentarios));
    }

    public void asignarProduccion(ProduccionId produccionId) {
        Objects.requireNonNull(produccionId, "La identificación de la producción no puede ser null");
        appendChange(new ProduccionAsociada(produccionId));
    }

    public void agregarProducto(Double costo, String nombre, String caracteristicas) {
        Objects.requireNonNull(costo, "El costo no puede ser null");
        Objects.requireNonNull(nombre, "El nombre del producto no puede ser nulo");
        Objects.requireNonNull(caracteristicas, "Las caracteristicas no pueden ser nulas");
        appendChange(new ProductoAgregado(costo, nombre, caracteristicas));

    }

    public void actualizarFactura(String nombre, String contacto, String cedula) {
        Objects.requireNonNull(nombre, "El nombre del factura no puede ser nulo");
        Objects.requireNonNull(contacto, "El contacto no puede ser nulo");
        Objects.requireNonNull(cedula, "La cedula no puede ser nula");
        appendChange(new FacturaActualizada(nombre, contacto, cedula));
    }

    public void asignarDiseño(DisenhoId disenhoId) {
        Objects.requireNonNull(disenhoId, "El DisenhoId no puede ser nulo");
        appendChange(new DisenhoAsignado(disenhoId));

    }

    public void calificarFeedbacks() {
        appendChange(new FeedbacksCalificados(feedback));

    }

    public void cancelarPedido(PedidoId pedidoId){
        Objects.requireNonNull(pedidoId, "El pedidoId no puede ser nulo");
        appendChange(new PedidoCancelado(pedidoId));

    }

    public DisenhoId diseñoId() {
        return disenhoId;
    }

    public ProduccionId produccionId() {
        return produccionId;
    }

    public Factura factura() {
        return factura;
    }

    public Set<Feedback> feedback() {
        return feedback;
    }
}
