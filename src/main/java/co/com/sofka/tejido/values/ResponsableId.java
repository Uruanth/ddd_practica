package co.com.sofka.tejido.values;

import co.com.sofka.generico.Id;

public class ResponsableId extends Id {
    private ResponsableId(String  value) {
        super(value);
    }

    public ResponsableId() {
    }

    public static ResponsableId of(String value) {
        return new ResponsableId(value);
    }
}
