package co.com.sofka.tejido;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.tejido.eventos.*;
import co.com.sofka.tejido.values.*;

import java.util.Objects;

public class Produccion extends AggregateEvent<ProduccionId> {

    protected Prototipo prototipo;
    protected Responsable responsable;
    protected Materiales materiales;
    protected QAId qaId;

    public Produccion(ProduccionId id, Prototipo prototipo, Responsable responsable, Materiales materiales, QAId qaId) {
        super(id);
        subscribe(new ProduccionChange(this));
        appendChange(new ProduccionAgregada(id, prototipo, responsable, materiales, qaId));

    }

    public Produccion(ProduccionId entityId) {
        super(entityId);
        subscribe(new ProduccionChange(this));
    }

    public void asignarResponsable(ResponsableId id, NombreTejedor nombreTejedor, ProductoFinal productoFinal) {
        Objects.requireNonNull(id, "id no puede ser nulo");
        Objects.requireNonNull(nombreTejedor, "nombreTejedor no puede ser nulo");
        Objects.requireNonNull(productoFinal, "Producto final no puede ser nulo");
        appendChange(new ResponsableAsignado(id, nombreTejedor, productoFinal));
    }

    public void asignarPrototipo(String nombre, String caracteristicas, String materiales) {
        Objects.requireNonNull(nombre, "Nombre del prototipo no puede ser nulo");
        Objects.requireNonNull(caracteristicas, "caracteristicas no puede ser nulo");
        Objects.requireNonNull(materiales, "materiales no puede ser nulo");
        appendChange(new PrototipoAsignado(nombre, caracteristicas, materiales));
    }

    public void actualizarResponsable(String nombreTejedor) {
        Objects.requireNonNull(nombreTejedor, "El nombre del tejedor no puede ser nulo");
        appendChange(new NombreTejedorActualizado(nombreTejedor));

    }

    public void asignarMateriales(MaterialesId id, Lana lana) {
        Objects.requireNonNull(id, "id no puede ser nulo");
        Objects.requireNonNull(lana, "lana no puede ser nulo");
        appendChange(new MaterialesAsignados(id, lana));

    }

    public void confirmarPedido() {
        appendChange(new PedidoConfirmado(this.responsable().productoFinal()));
    }

    public void asignarQA(QAId qaId) {
        Objects.requireNonNull(qaId, "El id no puede ser nulo");
        this.qaId = qaId;
        appendChange(new QAAsignado(qaId));
    }

    public Prototipo prototipo() {
        return prototipo;
    }

    public Responsable responsable() {
        return responsable;
    }

    public Materiales materiales() {
        return materiales;
    }

    public QAId qaId() {
        return qaId;
    }
}
