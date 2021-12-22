package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;

public class ClienteActualizado extends DomainEvent {
    private final String nombre;
    private final String contacto;
    private final String cedula;

    public ClienteActualizado(String nombre, String contacto, String cedula) {
        super("sofka.diseño.clienteCreado");
        this.nombre = nombre;
        this.contacto = contacto;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public String getCedula() {
        return cedula;
    }
}
