package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;

public class NombreQACambiado extends DomainEvent {
    private final String nombre;

    public String getNombre() {
        return nombre;
    }

    public NombreQACambiado(String nombre) {
        super("sofka.qa.nombreQACambiado");
        this.nombre = nombre;
    }
}
