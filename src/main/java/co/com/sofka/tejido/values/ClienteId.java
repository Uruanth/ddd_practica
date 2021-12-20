package co.com.sofka.tejido.values;

import co.com.sofka.generico.Id;

public class ClienteId extends Id {

    private ClienteId(String value) {
        super(value);
    }

    public ClienteId(){}


    public static ClienteId of(String value) {
        return new ClienteId(value);
    }

}
