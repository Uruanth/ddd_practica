package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.NombreTejedor;
import co.com.sofka.tejido.values.ProduccionId;
import co.com.sofka.tejido.values.ProductoFinal;
import co.com.sofka.tejido.values.ResponsableId;

public class AsignarResponsableComando extends Command {
    private final ProduccionId id;
    private final ResponsableId responsableId;
    private final NombreTejedor nombreTejedor;
    private final ProductoFinal productoFinal;

    public ProduccionId getId() {
        return id;
    }

    public ResponsableId getResponsableId() {
        return responsableId;
    }

    public NombreTejedor getNombreTejedor() {
        return nombreTejedor;
    }

    public ProductoFinal getProductoFinal() {
        return productoFinal;
    }

    public AsignarResponsableComando(ProduccionId id, ResponsableId responsableId, NombreTejedor nombreTejedor, ProductoFinal productoFinal) {
        this.id = id;
        this.responsableId = responsableId;
        this.nombreTejedor = nombreTejedor;
        this.productoFinal = productoFinal;
    }
}
