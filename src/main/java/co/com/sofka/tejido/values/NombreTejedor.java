package co.com.sofka.tejido.values;

import java.io.Serializable;

public class NombreTejedor  implements Serializable {

    private final String name;

    public NombreTejedor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
