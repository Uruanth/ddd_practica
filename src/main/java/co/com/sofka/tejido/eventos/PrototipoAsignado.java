package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;

public class PrototipoAsignado extends DomainEvent {
    private final String nombre;
    private final String caracteristicas;
    private final String materiales;

    public PrototipoAsignado(String nombre, String caracteristicas, String materiales) {
        super("sofka.produccion.prototipoAsignado");
        this.nombre = nombre;
        this.caracteristicas = caracteristicas;
        this.materiales = materiales;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public String getMateriales() {
        return materiales;
    }
}
