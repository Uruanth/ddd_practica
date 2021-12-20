package co.com.sofka.tejido.values;

import co.com.sofka.generico.Id;

public class DiseñoId extends Id {

    private DiseñoId(String value) {
        super(value);
    }

    public DiseñoId(){}

    public static DiseñoId of(String value) {
        return new DiseñoId(value);
    }

}
