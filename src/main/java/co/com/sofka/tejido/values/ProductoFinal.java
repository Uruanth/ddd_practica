package co.com.sofka.tejido.values;

import java.io.Serializable;

public class ProductoFinal  implements Serializable {
    private final Double costo;
    private final String nombre;
    private final String caracteristicas;

    public ProductoFinal(Double costo, String nombre, String caracteristicas) {
        this.costo = costo;
        this.nombre = nombre;
        this.caracteristicas = caracteristicas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductoFinal that = (ProductoFinal) o;

        if (costo != null ? !costo.equals(that.costo) : that.costo != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        return caracteristicas != null ? caracteristicas.equals(that.caracteristicas) : that.caracteristicas == null;
    }

    @Override
    public int hashCode() {
        int result = costo != null ? costo.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (caracteristicas != null ? caracteristicas.hashCode() : 0);
        return result;
    }

    public Double getCosto() {
        return costo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }
}
