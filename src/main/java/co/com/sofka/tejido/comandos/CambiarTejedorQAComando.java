package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.ProductoId;
import co.com.sofka.tejido.values.QAId;

public class CambiarTejedorQAComando extends Command {
    private final QAId qaId;
    private final ProductoId id;
    private final String nombreTejedor;

    public QAId getQaId() {
        return qaId;
    }

    public ProductoId getId() {
        return id;
    }

    public String getNombreTejedor() {
        return nombreTejedor;
    }

    public CambiarTejedorQAComando(QAId qaId, ProductoId id, String nombreTejedor) {
        this.qaId = qaId;
        this.id = id;
        this.nombreTejedor = nombreTejedor;
    }
}
