package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;

public class FacturaActualizada extends DomainEvent {
    private final String nombre;
    private final String contacto;
    private final String cedula;

    public String getNombre() {
        return nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public String getCedula() {
        return cedula;
    }

    public FacturaActualizada(String nombre, String contacto, String cedula) {
        super("sofka.pedido.facturaActaulizada");
        this.nombre = nombre;
        this.contacto = contacto;
        this.cedula = cedula;
    }
}
