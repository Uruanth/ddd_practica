package co.com.sofka.tejido;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tejido.values.NombreTejedor;
import co.com.sofka.tejido.values.ProductoId;
import co.com.sofka.tejido.values.Prototipo;

import java.util.Objects;

public class Producto extends Entity<ProductoId> {

    private NombreTejedor nombreTejedor;
    private Prototipo prototipo;

    public Producto(ProductoId id, NombreTejedor nombreTejedor, Prototipo prototipo) {
        super(id);
        this.nombreTejedor = nombreTejedor;
        this.prototipo = prototipo;
    }

    public void cambiarPrototipo(String nombre, String caracteristicas, String materiales){
        Objects.requireNonNull(nombre, "nombre no puede ser nulo");
        Objects.requireNonNull(caracteristicas, "caracteristicas no puede ser nulo");
        Objects.requireNonNull(materiales, "materiales no puede ser nulo");
        this.prototipo = new Prototipo(nombre, caracteristicas, materiales);

    }

    public void actualizarNombreTejedor(String name){
        Objects.requireNonNull(name, "nombre no puede ser nulo");
        this.nombreTejedor = new NombreTejedor(name);
    }

    public NombreTejedor nombreTejedor() {
        return nombreTejedor;
    }

    public Prototipo prototipo() {
        return prototipo;
    }
}
