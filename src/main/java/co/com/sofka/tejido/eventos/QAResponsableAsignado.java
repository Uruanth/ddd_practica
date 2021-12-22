package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tejido.values.NombreQA;
import co.com.sofka.tejido.values.ProductoFinal;
import co.com.sofka.tejido.values.QAResponsableId;
import co.com.sofka.tejido.values.ResultadosPrueba;

public class QAResponsableAsignado extends DomainEvent {
    private final QAResponsableId id;
    private final NombreQA nombreQA;
    private final ResultadosPrueba resultadosPrueba;
    private final ProductoFinal productoFinal;

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

    public QAResponsableAsignado(QAResponsableId id, NombreQA nombreQA, ResultadosPrueba resultadosPrueba, ProductoFinal productoFinal) {
        super("sofka.qa.qaResponsableAsignado");
        this.id = id;
        this.nombreQA = nombreQA;
        this.resultadosPrueba = resultadosPrueba;
        this.productoFinal = productoFinal;
    }
}
