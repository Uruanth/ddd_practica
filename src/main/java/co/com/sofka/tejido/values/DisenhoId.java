package co.com.sofka.tejido.values;

import co.com.sofka.domain.generic.Identity;

public class DisenhoId extends Identity {

    private DisenhoId(String value) {
        super(value);
    }

    public DisenhoId(){}

    public static DisenhoId of(String value) {
        return new DisenhoId(value);
    }

}
