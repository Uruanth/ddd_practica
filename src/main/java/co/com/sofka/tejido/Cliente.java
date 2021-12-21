package co.com.sofka.tejido;

import co.com.sofka.generico.Entity;
import co.com.sofka.tejido.values.ClienteId;
import co.com.sofka.tejido.values.DatosCliente;

import java.util.Objects;

public class Cliente extends Entity<ClienteId> {

    private DatosCliente cliente;

    public Cliente(ClienteId clienteId, DatosCliente cliente) {
        super(clienteId);
        this.cliente = Objects.requireNonNull(cliente);
    }

    public void actualizarCliente(String nombre, String contacto, String cedula) {
        this.cliente = new DatosCliente(nombre, contacto, cedula);
    }

    public DatosCliente datosCliente() {
        return cliente;
    }
}
