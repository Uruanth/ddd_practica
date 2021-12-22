package co.com.sofka.tejido;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.tejido.eventos.ClienteActualizado;
import co.com.sofka.tejido.eventos.DisenhoCreado;
import co.com.sofka.tejido.eventos.SolicitudGenerada;
import co.com.sofka.tejido.values.DisenhoId;

import java.util.Objects;

public class Disenho extends AggregateEvent<DisenhoId> {

    protected SolicitudCliente solicitudCliente;
    protected Cliente cliente;

    public Disenho(DisenhoId disenhoId, SolicitudCliente solicitudCliente, Cliente cliente) {
        super(disenhoId);
        subscribe(new DisenhoChange(this));
        appendChange(new DisenhoCreado(solicitudCliente, cliente));
    }

    public Disenho(DisenhoId id) {
        super(id);
        subscribe(new DisenhoChange(this));

    }
/*
    public void guardarCliente(DatosCliente cliente) {
        var id = new ClienteId();
        Objects.requireNonNull(cliente, "El atributo no puede ser null");
        this.cliente = new Cliente(id, cliente);
        //Evento cliente guardado

    }
*/
    public void modificarCliente(String nombre, String contacto, String cedula) {
        Objects.requireNonNull(nombre, "El atributo no puede ser null");
        Objects.requireNonNull(contacto, "El atributo no puede ser null");
        Objects.requireNonNull(cedula, "El atributo no puede ser null");
        appendChange(new ClienteActualizado(nombre, contacto, cedula));
    }

    public void generarSolicitud(String nombre, String caracteristicas, String materiales, String color, String tamanho, String observacion, String material) {
        Objects.requireNonNull(nombre, "El atributo no puede ser null");
        Objects.requireNonNull(caracteristicas, "El atributo no puede ser null");
        Objects.requireNonNull(materiales, "El atributo no puede ser null");
        Objects.requireNonNull(color, "El atributo no puede ser null");
        Objects.requireNonNull(tamanho, "El atributo no puede ser null");
        Objects.requireNonNull(observacion, "El atributo no puede ser null");
        Objects.requireNonNull(material, "El atributo no puede ser null");

        appendChange(new SolicitudGenerada(nombre, caracteristicas, materiales, color, tamanho, observacion, material));
    }


    public SolicitudCliente solicitudCliente() {
        return solicitudCliente;
    }

    public Cliente cliente() {
        return cliente;
    }
}
