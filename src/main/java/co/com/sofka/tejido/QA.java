package co.com.sofka.tejido;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.tejido.values.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class QA extends AggregateEvent<QAId> {

    private Set<Producto> productos;
    private QAResponsable qaResponsable;

    public void asginarResponsable(QAResponsableId id, NombreQA nombreQA, ResultadosPrueba resultadosPrueba, ProductoFinal productoFinal) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(nombreQA);
        Objects.requireNonNull(resultadosPrueba);
        Objects.requireNonNull(productoFinal);
        this.qaResponsable = new QAResponsable(id, nombreQA, resultadosPrueba, productoFinal);
        //todo: responsableAsignado

    }

    public QA(QAId id, QAResponsable qaResponsable) {
        super(id);
        this.productos = new HashSet<>();
        this.qaResponsable = qaResponsable;
    }

    public void generarPruebasDeCalidad(String tipoPrueba, String resultado, String detalles) {
        Objects.requireNonNull(tipoPrueba);
        Objects.requireNonNull(resultado);
        Objects.requireNonNull(detalles);
        this.qaResponsable.generarResultados(tipoPrueba, resultado, detalles);
        //todo: Evento resultadosGenerados
    }

    public void cambiarTrabajador(QAResponsableId id, NombreQA nombreQA, ResultadosPrueba resultadosPrueba, ProductoFinal productoFinal) {
        Objects.requireNonNull(id, "El id no puede ser nulo");
        Objects.requireNonNull(nombreQA, "El nombre no puede ser nulo");
        Objects.requireNonNull(productoFinal, "El producto final no puede ser nulo");
        this.qaResponsable = new QAResponsable(id, nombreQA, resultadosPrueba, productoFinal);
        //todo: Evento trabajadorCambiado
    }

    public void agregarProducto(ProductoId id, NombreTejedor nombreTejedor, Prototipo prototipo) {
        Objects.requireNonNull(id, "id no puede ser nulo");
        Objects.requireNonNull(nombreTejedor, "nombre no puede ser nulo");
        Objects.requireNonNull(prototipo, "el prototipo no puede ser nulo");
        productos.add(new Producto(id, nombreTejedor, prototipo));
        //Todo: productoAgregado

    }

    public void cambiarTejedorDelProductoProducto(ProductoId id, String nombreTejedor) {
        this.productos.stream()
                .filter(producto -> producto.identity()
                        .equals(id))
                .findFirst()
                .orElseThrow()
                .actualizarNombreTejedor(nombreTejedor);
    }

    public void cambiarPrototipo(ProduccionId id, String nombre, String caracteristicas, String materiales) {
        Objects.requireNonNull(nombre, "nombre no puede ser nulo");
        Objects.requireNonNull(caracteristicas, "caracteristicas no puede ser nulo");
        Objects.requireNonNull(materiales, "materiales no puede ser nulo");
        this.productos.stream()
                .filter(producto -> producto.identity()
                        .equals(id))
                .findFirst()
                .orElseThrow()
                .cambiarPrototipo(nombre, caracteristicas, materiales);

        //todo: Evento prototipoCambiado
    }

    public void cambiarNombreQA(String nombre){
        Objects.requireNonNull(nombre, " El nombre no puede ser nulo");
        this.qaResponsable.actualizarNombre(nombre);
        //todo: nombraQACambiado
    }


}
