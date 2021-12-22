package co.com.sofka.tejido;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.tejido.eventos.*;

import java.util.HashSet;

public class QAChange extends EventChange {
    public QAChange(QA qa) {
        apply((QACreado event) -> {
            qa.productos = new HashSet<>();
            qa.qaResponsable = event.getQaResponsable();
        });

        apply((PruebasDeCalidadGeneradas event) -> {
            qa.qaResponsable.generarResultados(
                    event.getTipoPrueba(),
                    event.getResultado(),
                    event.getDetalles()
            );
        });

        apply((QAResponsableAsignado event) -> {
            qa.qaResponsable = new QAResponsable(
                    event.getId(),
                    event.getNombreQA(),
                    event.getResultadosPrueba(),
                    event.getProductoFinal()
            );
        });

        apply((QAResponsableCambiado event)->{
            qa.qaResponsable = new QAResponsable(
                    event.getId(),
                    event.getNombreQA(),
                    event.getResultadosPrueba(),
                    event.getProductoFinal()
            );

        });

        apply((ProductoQAAgregado event)->{
            qa.productos.add(new Producto(
                    event.getId(),
                    event.getNombreTejedor(),
                    event.getPrototipo()
            ));
        });

        apply((TejedorDelProductoCambiado event)->{
            qa.productos.stream()
                    .filter(producto -> producto.identity()
                            .equals(event.getId()))
                    .findFirst()
                    .orElseThrow()
                    .actualizarNombreTejedor(event.getNombreTejedor());
        });

        apply((PrototipoCambiado event)->{
            qa.productos.stream()
                    .filter(producto -> producto.identity()
                            .equals(event.getId()))
                    .findFirst()
                    .orElseThrow()
                    .cambiarPrototipo(event.getNombre(),
                            event.getCaracteristicas(),
                            event.getMateriales());
        });

        apply((NombreQACambiado event)->{
            qa.qaResponsable.actualizarNombre(event.getNombre());
        }); 
    }
}
