package co.com.sofka.tejido.values;

import co.com.sofka.domain.generic.ValueObject;


public class Costos implements ValueObject<Double> {

    private final Double costos;

    public Costos(Double costos) {
        this.costos = costos;
    }


    public Costos sumarValor(Double valor){
        return new Costos(this.costos + valor);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Costos costos1 = (Costos) o;

        return costos != null ? costos.equals(costos1.costos) : costos1.costos == null;
    }

    @Override
    public int hashCode() {
        return costos != null ? costos.hashCode() : 0;
    }

    @Override
    public Double value() {
        return costos;
    }
}
