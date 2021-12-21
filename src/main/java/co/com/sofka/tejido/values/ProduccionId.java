package co.com.sofka.tejido.values;

import co.com.sofka.generico.Id;

public class ProduccionId extends Id {

    private ProduccionId(String value) {
        super(value);
    }

    public ProduccionId(){}

    public static ProduccionId of(String value) {
        return new ProduccionId(value);
    }
}
