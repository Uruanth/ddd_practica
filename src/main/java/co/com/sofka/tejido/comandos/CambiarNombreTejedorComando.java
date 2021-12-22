package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.ProductoId;

public class CambiarNombreTejedorComando extends Command {
    private final ProductoId id;
    private final String nombreTejedor;

    public ProductoId getId() {
        return id;
    }

    public String getNombreTejedor() {
        return nombreTejedor;
    }

    public CambiarNombreTejedorComando(ProductoId id, String nombreTejedor) {
        this.id = id;
        this.nombreTejedor = nombreTejedor;
    }
}
