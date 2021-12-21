package co.com.sofka.tejido;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tejido.values.CaracteristicasSolicitadas;
import co.com.sofka.tejido.values.Prototipo;
import co.com.sofka.tejido.values.SolicitudClienteId;

public class SolicitudCliente extends Entity<SolicitudClienteId> {

    private CaracteristicasSolicitadas caracteristicasSolicitadas;
    private Prototipo prototipo;


    public SolicitudCliente(SolicitudClienteId id, CaracteristicasSolicitadas caracteristicasSolicitadas, Prototipo prototipo) {
        super(id);
        this.caracteristicasSolicitadas = caracteristicasSolicitadas;
        this.prototipo = prototipo;
    }

    public void actualizarPrototipo(String nombre, String caracteristicas, String materiales){
        this.prototipo = new Prototipo(nombre, caracteristicas, materiales);
    }

    public void actualizarCaracteristicasSolicitadas(String color, String tamanho, String observacion, String material){
        this.caracteristicasSolicitadas = new CaracteristicasSolicitadas(color, tamanho, observacion, material);
    }


    public CaracteristicasSolicitadas caracteristicasSolicitadas() {
        return caracteristicasSolicitadas;
    }

    public Prototipo prototipo() {
        return prototipo;
    }
}
