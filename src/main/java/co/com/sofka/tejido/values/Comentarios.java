package co.com.sofka.tejido.values;

import java.io.Serializable;

public class Comentarios  implements Serializable {

    private final String detalles;
    private final boolean TipoComentario;

    public Comentarios(String detalles, boolean tipoComentario) {
        this.detalles = detalles;
        TipoComentario = tipoComentario;
    }

    public String getDetalles() {
        return detalles;
    }

    public boolean isTipoComentario() {
        return TipoComentario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comentarios that = (Comentarios) o;

        if (TipoComentario != that.TipoComentario) return false;
        return detalles != null ? detalles.equals(that.detalles) : that.detalles == null;
    }

    @Override
    public int hashCode() {
        int result = detalles != null ? detalles.hashCode() : 0;
        result = 31 * result + (TipoComentario ? 1 : 0);
        return result;
    }
}
