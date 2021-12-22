package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.QAId;

public class CambiarNombreQAComando extends Command {
    private final QAId qaId;
    private final String nombre;

    public QAId getQaId() {
        return qaId;
    }

    public String getNombre() {
        return nombre;
    }

    public CambiarNombreQAComando(QAId qaId, String nombre) {
        this.qaId = qaId;
        this.nombre = nombre;
    }
}
