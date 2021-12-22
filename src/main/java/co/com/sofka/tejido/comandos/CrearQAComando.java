package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.QAResponsable;
import co.com.sofka.tejido.values.QAId;

public class CrearQAComando extends Command {
    private final QAId id;
    private final QAResponsable qaResponsable;

    public QAId getId() {
        return id;
    }

    public QAResponsable getQaResponsable() {
        return qaResponsable;
    }

    public CrearQAComando(QAId id, QAResponsable qaResponsable) {
        this.id = id;
        this.qaResponsable = qaResponsable;
    }
}
