package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.ProduccionId;
import co.com.sofka.tejido.values.QAId;

public class AsignarQAComando extends Command {
    private final ProduccionId id;
    private final QAId qaId;

    public ProduccionId getId() {
        return id;
    }

    public QAId getQaId() {
        return qaId;
    }

    public AsignarQAComando(ProduccionId id, QAId qaId) {
        this.id = id;
        this.qaId = qaId;
    }
}
