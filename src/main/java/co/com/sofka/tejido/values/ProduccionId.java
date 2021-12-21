package co.com.sofka.tejido.values;

import co.com.sofka.domain.generic.Identity;


public class ProduccionId extends Identity {

    private ProduccionId(String value) {
        super(value);
    }

    public ProduccionId(){}

    public static ProduccionId of(String value) {
        return new ProduccionId(value);
    }
}
