package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;

public class PruebasDeCalidadGeneradas extends DomainEvent {
    private final String tipoPrueba;
    private final String resultado;
    private final String detalles;

    public String getTipoPrueba() {
        return tipoPrueba;
    }

    public String getResultado() {
        return resultado;
    }

    public String getDetalles() {
        return detalles;
    }

    public PruebasDeCalidadGeneradas(String tipoPrueba, String resultado, String detalles) {
        super("sofka.qa.pruebasDeCalidadGeneradas");
        this.tipoPrueba = tipoPrueba;
        this.resultado = resultado;
        this.detalles = detalles;
    }
}
