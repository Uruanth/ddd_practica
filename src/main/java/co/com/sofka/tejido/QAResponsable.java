package co.com.sofka.tejido;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tejido.values.NombreQA;
import co.com.sofka.tejido.values.ProductoFinal;
import co.com.sofka.tejido.values.QAResponsableId;
import co.com.sofka.tejido.values.ResultadosPrueba;

import java.util.Objects;

public class QAResponsable extends Entity<QAResponsableId> {

    private NombreQA nombreQA;
    private ResultadosPrueba resultadosPrueba;
    private ProductoFinal productoFinal;

    public QAResponsable(QAResponsableId id, NombreQA nombreQA, ResultadosPrueba resultadosPrueba, ProductoFinal productoFinal) {
        super(id);
        this.nombreQA = nombreQA;
        this.resultadosPrueba = resultadosPrueba;
        this.productoFinal = productoFinal;
    }


    public void generarResultados(String tipoPrueba, String resultado, String detalles){
        Objects.requireNonNull(tipoPrueba);
        Objects.requireNonNull(resultado);
        Objects.requireNonNull(detalles);
        this.resultadosPrueba = new ResultadosPrueba(tipoPrueba, resultado, detalles);

    }

    public  void  actualizarNombre(String nombre){
        Objects.requireNonNull(nombre, "Nombre no puede ser nulo");
        this.nombreQA = new NombreQA(nombre);
    }

    public NombreQA nombreQA() {
        return nombreQA;
    }

    public ResultadosPrueba resultadosPrueba() {
        return resultadosPrueba;
    }

    public ProductoFinal productoFinal() {
        return productoFinal;
    }
}
