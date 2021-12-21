package co.com.sofka.tejido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.io.Serializable;

public class Lana  implements ValueObject<Lana.Properties> {

    private  final String color;
    private  final String largo;
    private  final String referencia;
    private  final String tipo;

    public Lana(String color, String largo, String referencia, String tipo) {
        this.color = color;
        this. largo = largo;
        this. referencia = referencia;
        this. tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lana lana = (Lana) o;

        if (color != null ? !color.equals(lana.color) : lana.color != null) return false;
        if (largo != null ? !largo.equals(lana.largo) : lana.largo != null) return false;
        if (referencia != null ? !referencia.equals(lana.referencia) : lana.referencia != null) return false;
        return tipo != null ? tipo.equals(lana.tipo) : lana.tipo == null;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + (largo != null ? largo.hashCode() : 0);
        result = 31 * result + (referencia != null ? referencia.hashCode() : 0);
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
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
            public String largo() {
                return largo;
            }

            @Override
            public String referencia() {
                return referencia;
            }

            @Override
            public String tipo() {
                return tipo;
            }
        };
    }

    public interface Properties {
        String color();
        String largo();
        String referencia();
        String tipo();
    }
}
