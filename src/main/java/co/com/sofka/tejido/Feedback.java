package co.com.sofka.tejido;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tejido.values.Comentarios;
import co.com.sofka.tejido.values.FeedbackId;

import java.util.Objects;

public class Feedback extends Entity<FeedbackId> {


    private Comentarios comentarios;

    public Feedback(FeedbackId FeedbackId, Comentarios comentarios) {
        super(FeedbackId);
        this.comentarios = Objects.requireNonNull(comentarios, "comentarios no puede ser nulo");
    }

    public void asignarTipo(Boolean tipo){
        Objects.requireNonNull(tipo, "El atributo no puede ser null");
        this.comentarios = new Comentarios(this.comentarios.value().detalles(), tipo);
    }

    public void confirmarComentarios(){
        //Todo: evento comentarios confirmados
    }

    public Comentarios comentarios() {
        return comentarios;
    }
}
