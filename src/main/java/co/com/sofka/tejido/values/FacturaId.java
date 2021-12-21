package co.com.sofka.tejido.values;

import co.com.sofka.domain.generic.Identity;


public class FacturaId extends Identity {

    private FacturaId(String value){
        super(value);
    }

    public FacturaId(){}

    public static FacturaId of(String value) {
        return new FacturaId(value);
    }

}
