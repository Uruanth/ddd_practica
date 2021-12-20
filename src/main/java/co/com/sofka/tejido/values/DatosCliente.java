package co.com.sofka.tejido.values;

import java.util.Objects;

public class DatosCliente {

    private final String nombre;
    private final String contacto;
    private final String cedula;

    public DatosCliente(String nombre, String contacto, String cedula) {
        this.nombre = Objects.requireNonNull(nombre);
        this.contacto = Objects.requireNonNull(contacto);;
        this.cedula = Objects.requireNonNull(cedula);
    }
}
