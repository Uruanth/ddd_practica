package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.ProduccionId;

public class AsignarPrototipoComando extends Command {
    private final ProduccionId id;
    private final String nombre;
    private final String caracteristicas;
    private final String materiales;

    public ProduccionId getId() {
        return id;
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

    public AsignarPrototipoComando(ProduccionId id, String nombre, String caracteristicas, String materiales) {
        this.id = id;
        this.nombre = nombre;
        this.caracteristicas = caracteristicas;
        this.materiales = materiales;
    }
}
