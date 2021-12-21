package co.com.sofka.tejido.values;

import co.com.sofka.domain.generic.Identity;


public class ProductoId extends Identity {

    private ProductoId(String value) {
        super(value);
    }

    public ProductoId() {
    }

    public static ProductoId fromString(String value) {
        return new ProductoId(value);
    }
}
