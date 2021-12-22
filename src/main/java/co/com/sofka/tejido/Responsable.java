package co.com.sofka.tejido;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tejido.values.NombreTejedor;
import co.com.sofka.tejido.values.ProductoFinal;
import co.com.sofka.tejido.values.ResponsableId;

import java.util.Objects;

public class Responsable extends Entity<ResponsableId> {

    private NombreTejedor nombreTejedor;
    private ProductoFinal productoFinal;


    public Responsable(ResponsableId id, NombreTejedor nombreTejedor, ProductoFinal productoFinal) {
        super(id);
        this.nombreTejedor = nombreTejedor;
        this.productoFinal = productoFinal;
    }

    public void generarProductoFinal(Double costo, String nombre, String caracteristicas) {
        Objects.requireNonNull(costo, "costo no puede ser nulo");
        Objects.requireNonNull(nombre, "nombre no puede ser nulo");
        Objects.requireNonNull(caracteristicas, "caracteristicas no puede ser nulo");
        this.productoFinal = new ProductoFinal(costo, nombre, caracteristicas);
        //todo: producto final generado
    }

    public void actualizarNombreTejedor(String nombreTejedor) {
        Objects.requireNonNull(nombreTejedor, "nombreTejedor no puede ser nulo");
        this.nombreTejedor = new NombreTejedor(nombreTejedor);
        //todo: Evento nombreTejedorActualizado
    }

    public NombreTejedor nombreTejedor() {
        return nombreTejedor;
    }

    public ProductoFinal productoFinal() {
        return productoFinal;
    }
}
