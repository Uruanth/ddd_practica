package co.com.sofka.tejido.values;

import co.com.sofka.generico.Id;

public class MaterialesId extends Id {
    private MaterialesId(String value) {
        super(value);
    }

    public MaterialesId() {}

    public static MaterialesId of(String value) {
        return new MaterialesId(value);
    }

}
