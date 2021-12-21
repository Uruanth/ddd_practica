package co.com.sofka.tejido.values;

import co.com.sofka.generico.Id;

public class SolicitudClienteId  extends Id {

    private SolicitudClienteId(String value){
        super(value);
    }

    public SolicitudClienteId(){}

    public static SolicitudClienteId of(String value) {
        return new SolicitudClienteId(value);
    }

}
