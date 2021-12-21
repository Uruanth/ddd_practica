package co.com.sofka.tejido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.io.Serializable;

public class Prototipo  implements ValueObject<Prototipo.Properties> {

    private final String nombre;
    private final String caracteristicas;
    private final String Materiales;


    public Prototipo(String nombre, String caracteristicas, String materiales) {
        this.nombre = nombre;
        this.caracteristicas = caracteristicas;
        Materiales = materiales;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public String getMateriales() {
        return Materiales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Prototipo prototipo = (Prototipo) o;

        if (nombre != null ? !nombre.equals(prototipo.nombre) : prototipo.nombre != null) return false;
        if (caracteristicas != null ? !caracteristicas.equals(prototipo.caracteristicas) : prototipo.caracteristicas != null)
            return false;
        return Materiales != null ? Materiales.equals(prototipo.Materiales) : prototipo.Materiales == null;
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (caracteristicas != null ? caracteristicas.hashCode() : 0);
        result = 31 * result + (Materiales != null ? Materiales.hashCode() : 0);
        return result;
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String caracteristicas() {
                return caracteristicas;
            }

            @Override
            public String Materiales() {
                return Materiales;
            }
        };
    }

    public interface Properties {
        String nombre();
        String caracteristicas();
        String Materiales();
    }
}
