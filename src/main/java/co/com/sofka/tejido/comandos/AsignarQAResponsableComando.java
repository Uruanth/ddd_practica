package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.*;

public class AsignarQAResponsableComando extends Command {
    private final QAId qaId;
    private final QAResponsableId id;
    private final NombreQA nombreQA;
    private final ResultadosPrueba resultadosPrueba;
    private final ProductoFinal productoFinal;

    public QAId getQaId() {
        return qaId;
    }

    public QAResponsableId getId() {
        return id;
    }

    public NombreQA getNombreQA() {
        return nombreQA;
    }

    public ResultadosPrueba getResultadosPrueba() {
        return resultadosPrueba;
    }

    public ProductoFinal getProductoFinal() {
        return productoFinal;
    }

    public AsignarQAResponsableComando(QAId qaId, QAResponsableId id, NombreQA nombreQA, ResultadosPrueba resultadosPrueba, ProductoFinal productoFinal) {
        this.qaId = qaId;
        this.id = id;
        this.nombreQA = nombreQA;
        this.resultadosPrueba = resultadosPrueba;
        this.productoFinal = productoFinal;
    }
}
