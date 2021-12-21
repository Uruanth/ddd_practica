package co.com.sofka.tejido.values;

import java.io.Serializable;

public class Costos implements Serializable {

    private final Double costos;

    public Costos(Double costos) {
        this.costos = costos;
    }


    public Costos sumarValor(Double valor){
        return new Costos(this.costos + valor);
    }

    public Double getCostos() {
        return costos;
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
}
