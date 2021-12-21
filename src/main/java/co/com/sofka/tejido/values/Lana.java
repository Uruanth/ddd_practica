package co.com.sofka.tejido.values;

import java.io.Serializable;

public class Lana  implements Serializable {

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

    public String getColor() {
        return color;
    }

    public String getLargo() {
        return largo;
    }

    public String getReferencia() {
        return referencia;
    }

    public String getTipo() {
        return tipo;
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
}
