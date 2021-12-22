package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.ProductoId;
import co.com.sofka.tejido.values.QAId;

public class CambiarPrototipoComando extends Command {
    private final QAId qaId;
    private final ProductoId id;
    private final String nombre;
    private final String caracteristicas;
    private final String materiales;

    public QAId getQaId() {
        return qaId;
    }

    public ProductoId getId() {
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

    public CambiarPrototipoComando(QAId qaId, ProductoId id, String nombre, String caracteristicas, String materiales) {
        this.qaId = qaId;
        this.id = id;
        this.nombre = nombre;
        this.caracteristicas = caracteristicas;
        this.materiales = materiales;
    }
}
