package co.com.sofka.tejido.values;

import co.com.sofka.domain.generic.Identity;


public class ResponsableId extends Identity {
    private ResponsableId(String  value) {
        super(value);
    }

    public ResponsableId() {
    }

    public static ResponsableId of(String value) {
        return new ResponsableId(value);
    }
}
