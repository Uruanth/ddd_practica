package co.com.sofka.tejido;

import co.com.sofka.generico.Entity;
import co.com.sofka.tejido.values.CaracteristicasSolicitadas;
import co.com.sofka.tejido.values.Prototipo;
import co.com.sofka.tejido.values.SolicitudClienteId;

public class SolicitudCliente extends Entity<SolicitudClienteId> {

    private CaracteristicasSolicitadas caracteristicasSolicitadas;
    private Prototipo prootipo;


    public SolicitudCliente(SolicitudClienteId id, CaracteristicasSolicitadas caracteristicasSolicitadas, Prototipo prootipo) {
        super(id);
        this.caracteristicasSolicitadas = caracteristicasSolicitadas;
        this.prootipo = prootipo;
    }

    public void actualizarPrototipo(String nombre, String caracteristicas, String materiales){
        this.prootipo = new Prototipo(nombre, caracteristicas, materiales);
    }

    public void actualizarCaracteristicasSolicitadas(String color, String tamanho, String observacion, String material){
        this.caracteristicasSolicitadas = new CaracteristicasSolicitadas(color, tamanho, observacion, material);
    }

}
