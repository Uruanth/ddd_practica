package co.com.sofka.tejido.values;

import java.io.Serializable;
import java.util.Objects;

public class DatosCliente  implements Serializable {

    private final String nombre;
    private final String contacto;
    private final String cedula;

    public DatosCliente(String nombre, String contacto, String cedula) {
        this.nombre = Objects.requireNonNull(nombre);
        this.contacto = Objects.requireNonNull(contacto);;
        this.cedula = Objects.requireNonNull(cedula);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DatosCliente that = (DatosCliente) o;

        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (contacto != null ? !contacto.equals(that.contacto) : that.contacto != null) return false;
        return cedula != null ? cedula.equals(that.cedula) : that.cedula == null;
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (contacto != null ? contacto.hashCode() : 0);
        result = 31 * result + (cedula != null ? cedula.hashCode() : 0);
        return result;
    }
}
