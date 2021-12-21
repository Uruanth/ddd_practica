package co.com.sofka.tejido;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.tejido.values.*;

import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Pedido extends AggregateEvent<PedidoId> {

    private DiseñoId diseñoId;
    private ProduccionId produccionId;
    private Factura factura;
    private Set<Feedback> feedback;

    public Pedido(PedidoId pedidoId, DiseñoId diseñoId, ProduccionId produccionId, Factura factura, Set<Feedback> feedback) {
        super(pedidoId);
        this.diseñoId = diseñoId;
        this.produccionId = produccionId;
        this.factura = factura;
        this.feedback = feedback;
    }

    public void generarFactura(DatosCliente datosCliente) {
        var facturaId = new FacturaId();
        Objects.requireNonNull(datosCliente, "datosCliente no puede ser nulo");
        this.factura = new Factura(facturaId, datosCliente);
        //TODO: Evento factura creada
    }

    public void agregarFeedbacks(String detalles, boolean tipoComentario) {
        var feedbackId = new FeedbackId();
        Objects.requireNonNull(feedbackId, "feedbackId no puede ser nulo");
        Objects.requireNonNull(tipoComentario, "tipoComentario no puede ser nulo");
        var comentarios = new Comentarios(detalles, tipoComentario);
        this.feedback.add(new Feedback(feedbackId, comentarios));
        //TODO: Evento feedback agregado
    }

    public void asignarProduccion(ProduccionId produccionId) {
        Objects.requireNonNull(produccionId, "La identificación de la producción no puede ser null");
        this.produccionId = produccionId;
        //TODO: Evento de producción asociada
    }

    public void agregarProducto(Double costo, String nombre, String caracteristicas) {
        Objects.requireNonNull(costo, "El costo no puede ser null");
        Objects.requireNonNull(nombre, "El nombre del producto no puede ser nulo");
        Objects.requireNonNull(caracteristicas, "Las caracteristicas no pueden ser nulas");
        this.factura.agregarProducto(costo, nombre, caracteristicas);
        //TODO: Evento de producto agregado

    }

    public void actualizarFactura(String nombre, String contacto, String cedula) {
        Objects.requireNonNull(nombre, "El nombre del factura no puede ser nulo");
        Objects.requireNonNull(contacto, "El contacto no puede ser nulo");
        Objects.requireNonNull(cedula, "La cedula no puede ser nula");
        this.factura.actualizarCliente(nombre, contacto, cedula);
        //TODO; evento factura actualizada
    }

    public void asignarDiseño(DiseñoId diseñoId) {
        Objects.requireNonNull(diseñoId, "El DiseñoId no puede ser nulo");
        this.diseñoId = diseñoId;
        //TODO: Diseño asignado

    }

    public void calificarFeedbacks() {
        var feedsPositivos = this.feedback.stream()
                .filter(feed -> feed.comentarios().value().TipoComentario() == true)
                .collect(Collectors.toSet())
                .size();

        var balance = this.feedback.size() - feedsPositivos;
        if (balance < 0) System.out.println("Balance negativo");
        System.out.println("Balance Positivo");
        //Todo: Evento de feedbacks calificados

    }

    public void cancelarPedido(PedidoId pedidoId){
        Objects.requireNonNull(pedidoId, "El pedidoId no puede ser nulo");
        //Todo: Evento pedido cancelado

    }

    public DiseñoId diseñoId() {
        return diseñoId;
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
