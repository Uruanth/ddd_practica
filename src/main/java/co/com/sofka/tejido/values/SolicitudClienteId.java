package co.com.sofka.tejido.values;

import co.com.sofka.domain.generic.Identity;


public class SolicitudClienteId  extends Identity {

    private SolicitudClienteId(String value){
        super(value);
    }

    public SolicitudClienteId(){}

    public static SolicitudClienteId of(String value) {
        return new SolicitudClienteId(value);
    }

}
