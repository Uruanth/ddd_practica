package co.com.sofka.tejido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreQA  implements ValueObject<String> {

    private final String nombre;

    public NombreQA(String nombre) {
        Objects.requireNonNull(nombre, "nombre no puede ser nulo");
        this.nombre = nombre;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NombreQA nombreQA = (NombreQA) o;

        return nombre != null ? nombre.equals(nombreQA.nombre) : nombreQA.nombre == null;
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode() : 0;
    }

    @Override
    public String value() {
        return nombre;
    }
}
