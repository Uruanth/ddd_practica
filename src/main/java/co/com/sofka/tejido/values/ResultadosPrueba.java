package co.com.sofka.tejido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.io.Serializable;
import java.util.Objects;

public class ResultadosPrueba  implements ValueObject<ResultadosPrueba.Properties> {

    private final String tipoPrueba;
    private final String resultado;
    private final String detalles;

    public ResultadosPrueba(String tipoPrueba, String resultado, String detalles) {
        Objects.requireNonNull(tipoPrueba);
        Objects.requireNonNull(resultado);
        Objects.requireNonNull(detalles);
        this.tipoPrueba = tipoPrueba;
        this.resultado = resultado;
        this.detalles = detalles;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResultadosPrueba that = (ResultadosPrueba) o;

        if (tipoPrueba != null ? !tipoPrueba.equals(that.tipoPrueba) : that.tipoPrueba != null) return false;
        if (resultado != null ? !resultado.equals(that.resultado) : that.resultado != null) return false;
        return detalles != null ? detalles.equals(that.detalles) : that.detalles == null;
    }

    @Override
    public int hashCode() {
        int result = tipoPrueba != null ? tipoPrueba.hashCode() : 0;
        result = 31 * result + (resultado != null ? resultado.hashCode() : 0);
        result = 31 * result + (detalles != null ? detalles.hashCode() : 0);
        return result;
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String tipoPrueba() {
                return tipoPrueba;
            }

            @Override
            public String resultado() {
                return resultado;
            }

            @Override
            public String detalles() {
                return detalles;
            }
        };
    }

    public interface Properties {
        String tipoPrueba();
        String resultado();
        String detalles();
    }
}
