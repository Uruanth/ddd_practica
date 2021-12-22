package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.QAId;

public class GenerarPruebasDeCalidad extends Command {
    private final QAId id;
    private final String tipoPrueba;
    private final String resultado;
    private final String detalles;

    public QAId getId() {
        return id;
    }

    public String getTipoPrueba() {
        return tipoPrueba;
    }

    public String getResultado() {
        return resultado;
    }

    public String getDetalles() {
        return detalles;
    }

    public GenerarPruebasDeCalidad(QAId id, String tipoPrueba, String resultado, String detalles) {
        this.id = id;
        this.tipoPrueba = tipoPrueba;
        this.resultado = resultado;
        this.detalles = detalles;
    }
}
