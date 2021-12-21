package co.com.sofka.tejido;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.tejido.values.*;

import java.util.Objects;

public class Produccion extends AggregateEvent<ProduccionId> {

    private  Prototipo prototipo;

    private Responsable responsable;
    private Materiales materiales;
    private QAId qaId;

    public Produccion(ProduccionId id, Prototipo prototipo, Responsable responsable, Materiales materiales, QAId qaId) {
        super(id);
        this.prototipo = prototipo;
        this.responsable = responsable;
        this.materiales = materiales;
        this.qaId = qaId;
    }

    public void asignarResponsable(ResponsableId id, NombreTejedor nombreTejedor, ProductoFinal productoFinal){
        Objects.requireNonNull(id, "id no puede ser nulo");
        Objects.requireNonNull(nombreTejedor, "nombreTejedor no puede ser nulo");
        Objects.requireNonNull(productoFinal, "Producto final no puede ser nulo");
        this.responsable = new Responsable(id, nombreTejedor, productoFinal);
        //todo: Evento de tejedorAsignado
    }

    public void asignarPrototipo(String nombre, String caracteristicas, String materiales){
        Objects.requireNonNull(nombre, "Nombre del prototipo no puede ser nulo");
        Objects.requireNonNull(caracteristicas, "caracteristicas no puede ser nulo");
        Objects.requireNonNull(materiales, "materiales no puede ser nulo");
        this.prototipo = new Prototipo(nombre, caracteristicas, materiales);
        //todo: Evento prototipoActualizado
    }

    public void actualizarResponsable(String nombreTejedor){
        Objects.requireNonNull(nombreTejedor, "El nombre del tejedor no puede ser nulo");
        this.responsable.actualizarNombreTejedor(nombreTejedor);
        //Todo: Evento nombreTejedorActualizado

    }

    public void asignarMateriales(MaterialesId id, Lana lana){
        Objects.requireNonNull(id, "id no puede ser nulo");
        Objects.requireNonNull(lana, "lana no puede ser nulo");
        this.materiales = new Materiales(id, lana);
        //todo: evento materialesAsignados

    }

    public void confirmarPedido(){
        //todo: evento de pedidoConfirmado
    }

    public void asignarQA(QAId qaId){
        Objects.requireNonNull(qaId, "El id no puede ser nulo");
        this.qaId = qaId;
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
