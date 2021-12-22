package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.PedidoId;

public class ActualizarFacturaComando extends Command {
    private final PedidoId id;
    private final String nombre;
    private final String contacto;
    private final String cedula;

    public PedidoId getId() {
        return id;
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

    public ActualizarFacturaComando(PedidoId id, String nombre, String contacto, String cedula) {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
        this.cedula = cedula;
    }
}
