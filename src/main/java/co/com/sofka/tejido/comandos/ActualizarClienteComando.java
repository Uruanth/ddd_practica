package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.DisenhoId;

public class ActualizarClienteComando extends Command {

    private final String nombre;
    private final String contacto;
    private final String cedula;
    private final DisenhoId id;

    public String getNombre() {
        return nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public String getCedula() {
        return cedula;
    }

    public DisenhoId getId() {
        return id;
    }

    public ActualizarClienteComando(String nombre, String contacto, String cedula, DisenhoId id) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.cedula = cedula;
        this.id = id;
    }
}
