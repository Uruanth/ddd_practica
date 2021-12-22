package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.Materiales;
import co.com.sofka.tejido.Responsable;
import co.com.sofka.tejido.values.ProduccionId;
import co.com.sofka.tejido.values.Prototipo;
import co.com.sofka.tejido.values.QAId;

public class AgregarProduccionComando extends Command {
    private final ProduccionId id;
    private final Prototipo prototipo;
    private final Responsable responsable;
    private final Materiales materiales;
    private final QAId qaId;

    public ProduccionId getId() {
        return id;
    }

    public Prototipo getPrototipo() {
        return prototipo;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public Materiales getMateriales() {
        return materiales;
    }

    public QAId getQaId() {
        return qaId;
    }

    public AgregarProduccionComando(ProduccionId id, Prototipo prototipo, Responsable responsable, Materiales materiales, QAId qaId) {
        this.id = id;
        this.prototipo = prototipo;
        this.responsable = responsable;
        this.materiales = materiales;
        this.qaId = qaId;
    }
}
