package co.com.sofka.tejido;

import co.com.sofka.generico.AggregateRoot;
import co.com.sofka.generico.Id;
import co.com.sofka.tejido.values.ClienteId;
import co.com.sofka.tejido.values.DatosCliente;
import co.com.sofka.tejido.values.DiseñoId;

import java.util.Objects;

public class Diseño extends AggregateRoot<DiseñoId> {

    private  SolicitudCliente solicitudCliente;
    private Cliente cliente;

    public Diseño(DiseñoId diseñoId, SolicitudCliente solicitudCliente, Cliente cliente) {
        super(diseñoId);
        this.solicitudCliente = solicitudCliente;
        this.cliente = cliente;
    }

    public Diseño(Id id, SolicitudCliente solicitudClienteId) {
        super(id);
        this.solicitudCliente = solicitudClienteId;
    }

    public void guardarCliente(DatosCliente cliente){
        var id = new ClienteId();
        Objects.requireNonNull(cliente, "El atributo no puede ser null");
        this.cliente = new Cliente(id, cliente);
        //Evento cliente guardado

    }

    public void modificarCliente(String nombre, String contacto, String cedula){
        Objects.requireNonNull(nombre, "El atributo no puede ser null");
        Objects.requireNonNull(contacto, "El atributo no puede ser null");
        Objects.requireNonNull(cedula, "El atributo no puede ser null");
        this.cliente.actualizarCliente(nombre, contacto, cedula);
        //Evento cliente actualizado
    }

    public void generarSolicitud(String nombre, String caracteristicas, String materiales, String color, String tamanho, String observacion, String material){
        Objects.requireNonNull(nombre, "El atributo no puede ser null");
        Objects.requireNonNull(caracteristicas, "El atributo no puede ser null");
        Objects.requireNonNull(materiales, "El atributo no puede ser null");
        Objects.requireNonNull(color, "El atributo no puede ser null");
        Objects.requireNonNull(tamanho, "El atributo no puede ser null");
        Objects.requireNonNull(observacion, "El atributo no puede ser null");
        Objects.requireNonNull(material, "El atributo no puede ser null");
        this.solicitudCliente.actualizarPrototipo(nombre, caracteristicas, materiales);
        this.solicitudCliente.actualizarCaracteristicasSolicitadas(color, tamanho, observacion, material);
        //evento solicitud generada
    }

}
