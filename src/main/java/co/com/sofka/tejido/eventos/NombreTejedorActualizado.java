package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;

public class NombreTejedorActualizado extends DomainEvent {
    private final String nombreTejedor;

    public String getNombreTejedor() {
        return nombreTejedor;
    }

    public NombreTejedorActualizado(String nombreTejedor) {
        super("sofka.produccion.nombreTejedorActualizado");
        this.nombreTejedor = nombreTejedor;
    }
}
