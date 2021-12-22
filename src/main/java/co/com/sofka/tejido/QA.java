package co.com.sofka.tejido;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.tejido.eventos.*;
import co.com.sofka.tejido.values.*;

import java.util.Objects;
import java.util.Set;

public class QA extends AggregateEvent<QAId> {

    protected Set<Producto> productos;
    protected QAResponsable qaResponsable;



    public QA(QAId id, QAResponsable qaResponsable) {
        super(id);
        subscribe(new QAChange(this));
        appendChange(new QACreado(id, qaResponsable));
    }

    public QA(QAId entityId) {
        super(entityId);
        subscribe(new QAChange(this));

    }

    public void generarPruebasDeCalidad(String tipoPrueba, String resultado, String detalles) {
        Objects.requireNonNull(tipoPrueba);
        Objects.requireNonNull(resultado);
        Objects.requireNonNull(detalles);
        appendChange(new PruebasDeCalidadGeneradas(tipoPrueba, resultado, detalles));
    }

    public void asginarResponsable(QAResponsableId id, NombreQA nombreQA, ResultadosPrueba resultadosPrueba, ProductoFinal productoFinal) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(nombreQA);
        Objects.requireNonNull(resultadosPrueba);
        Objects.requireNonNull(productoFinal);
        appendChange(new QAResponsableAsignado(id, nombreQA, resultadosPrueba, productoFinal));

    }

    public void cambiarTrabajador(QAResponsableId id, NombreQA nombreQA, ResultadosPrueba resultadosPrueba, ProductoFinal productoFinal) {
        Objects.requireNonNull(id, "El id no puede ser nulo");
        Objects.requireNonNull(nombreQA, "El nombre no puede ser nulo");
        Objects.requireNonNull(productoFinal, "El producto final no puede ser nulo");
        appendChange(new QAResponsableCambiado(id, nombreQA, resultadosPrueba, productoFinal));
    }

    public void agregarProducto(ProductoId id, NombreTejedor nombreTejedor, Prototipo prototipo) {
        Objects.requireNonNull(id, "id no puede ser nulo");
        Objects.requireNonNull(nombreTejedor, "nombre no puede ser nulo");
        Objects.requireNonNull(prototipo, "el prototipo no puede ser nulo");
        appendChange(new ProductoQAAgregado(id, nombreTejedor, prototipo));

    }

    public void cambiarTejedorDelProductoProducto(ProductoId id, String nombreTejedor) {
        Objects.requireNonNull(id, "id no puede ser null");
        Objects.requireNonNull(nombreTejedor, "El nombre del tejedor no puede ser nulo");
        appendChange(new TejedorDelProductoCambiado(id, nombreTejedor));
    }

    public void cambiarPrototipo(ProductoId id, String nombre, String caracteristicas, String materiales) {
        Objects.requireNonNull(nombre, "nombre no puede ser nulo");
        Objects.requireNonNull(caracteristicas, "caracteristicas no puede ser nulo");
        Objects.requireNonNull(materiales, "materiales no puede ser nulo");
        appendChange(new PrototipoCambiado(id, nombre, caracteristicas, materiales));
    }

    public void cambiarNombreQA(String nombre){
        Objects.requireNonNull(nombre, " El nombre no puede ser nulo");
        this.qaResponsable.actualizarNombre(nombre);
        appendChange(new NombreQACambiado(nombre));
    }


}
