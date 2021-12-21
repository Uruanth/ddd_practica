package co.com.sofka.tejido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CaracteristicasSolicitadas implements ValueObject<CaracteristicasSolicitadas.Properties> {

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

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String color() {
                return color;
            }

            @Override
            public String tamanho() {
                return tamanho;
            }

            @Override
            public String observaciones() {
                return observaciones;
            }

            @Override
            public String material() {
                return material;
            }
        };
    }

    public interface Properties{
        String color();
        String tamanho();
        String observaciones();
        String material();
    }
}
