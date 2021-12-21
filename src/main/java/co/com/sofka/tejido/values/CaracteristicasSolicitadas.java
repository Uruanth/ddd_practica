package co.com.sofka.tejido.values;

import java.io.Serializable;
import java.util.Objects;

public class CaracteristicasSolicitadas implements Serializable {

    private final String color;
    private final String tamanho;
    private final String observaciones;
    private final String material;


    public CaracteristicasSolicitadas(String color, String tamanho, String observaciones, String material) {
        this.color = Objects.requireNonNull(color);
        this.tamanho = Objects.requireNonNull(tamanho);;
        this.observaciones = Objects.requireNonNull(observaciones);;
        this.material = Objects.requireNonNull(material);;
    }


    public String getColor() {
        return color;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CaracteristicasSolicitadas that = (CaracteristicasSolicitadas) o;

        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        if (tamanho != null ? !tamanho.equals(that.tamanho) : that.tamanho != null) return false;
        if (observaciones != null ? !observaciones.equals(that.observaciones) : that.observaciones != null)
            return false;
        return material != null ? material.equals(that.material) : that.material == null;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + (tamanho != null ? tamanho.hashCode() : 0);
        result = 31 * result + (observaciones != null ? observaciones.hashCode() : 0);
        result = 31 * result + (material != null ? material.hashCode() : 0);
        return result;
    }
}
