package co.com.sofka.tejido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.io.Serializable;

public class Comentarios  implements ValueObject<Comentarios.Properties> {

    private final String detalles;
    private final boolean TipoComentario;

    public Comentarios(String detalles, boolean tipoComentario) {
        this.detalles = detalles;
        TipoComentario = tipoComentario;
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

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String detalles() {
                return detalles;
            }

            @Override
            public boolean TipoComentario() {
                return TipoComentario;
            }
        };
    }

    public interface Properties {
        String detalles();
        boolean TipoComentario();
    }
}
