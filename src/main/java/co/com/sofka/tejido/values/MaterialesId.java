package co.com.sofka.tejido.values;

import co.com.sofka.domain.generic.Identity;


public class MaterialesId extends Identity {
    private MaterialesId(String value) {
        super(value);
    }

    public MaterialesId() {}

    public static MaterialesId of(String value) {
        return new MaterialesId(value);
    }

}
