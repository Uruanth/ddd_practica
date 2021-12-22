package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;

public class SolicitudGenerada extends DomainEvent {
    private final String nombre;
    private final String caracteristicas;
    private final String materiales;
    private final String color;
    private final String tamanho;
    private final String observacion;
    private final String material;

    public SolicitudGenerada(String nombre, String caracteristicas, String materiales, String color, String tamanho, String observacion, String material) {
        super("sofka.diseño.solicitudCreada");
        this.nombre = nombre;
        this.caracteristicas = caracteristicas;
        this.materiales = materiales;
        this.color = color;
        this.tamanho = tamanho;
        this.observacion = observacion;
        this.material = material;
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
}
