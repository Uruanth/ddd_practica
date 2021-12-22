package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.NombreTejedor;
import co.com.sofka.tejido.values.ProductoId;
import co.com.sofka.tejido.values.Prototipo;
import co.com.sofka.tejido.values.QAId;

public class AgregarProductoQAComando extends Command {
    private final QAId qaId;
    private final ProductoId id;
    private final NombreTejedor nombreTejedor;
    private final Prototipo prototipo;

    public QAId getQaId() {
        return qaId;
    }

    public ProductoId getId() {
        return id;
    }

    public NombreTejedor getNombreTejedor() {
        return nombreTejedor;
    }

    public Prototipo getPrototipo() {
        return prototipo;
    }

    public AgregarProductoQAComando(QAId qaId, ProductoId id, NombreTejedor nombreTejedor, Prototipo prototipo) {
        this.qaId = qaId;
        this.id = id;
        this.nombreTejedor = nombreTejedor;
        this.prototipo = prototipo;
    }
}
