package co.com.sofka.tejido.values;

import co.com.sofka.domain.generic.Identity;

public class DiseñoId extends Identity {

    private DiseñoId(String value) {
        super(value);
    }

    public DiseñoId(){}

    public static DiseñoId of(String value) {
        return new DiseñoId(value);
    }

}
