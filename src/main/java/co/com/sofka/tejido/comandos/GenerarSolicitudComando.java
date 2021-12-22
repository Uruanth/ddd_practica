package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.DisenhoId;

public class GenerarSolicitudComando extends Command {
    private final DisenhoId id;
    private final String nombre;
    private final String caracteristicas;
    private final String materiales;
    private final String color;
    private final String tamanho;
    private final String observacion;
    private final String material;

    public DisenhoId getId() {
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

    public String getColor() {
        return color;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getObservacion() {
        return observacion;
    }

    public String getMaterial() {
        return material;
    }

    public GenerarSolicitudComando(DisenhoId id, String nombre, String caracteristicas, String materiales, String color, String tamanho, String observacion, String material) {
        this.id = id;
        this.nombre = nombre;
        this.caracteristicas = caracteristicas;
        this.materiales = materiales;
        this.color = color;
        this.tamanho = tamanho;
        this.observacion = observacion;
        this.material = material;
    }
}
