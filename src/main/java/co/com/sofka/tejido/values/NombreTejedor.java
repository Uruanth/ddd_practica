package co.com.sofka.tejido.values;

import co.com.sofka.domain.generic.ValueObject;


public class NombreTejedor  implements ValueObject<String> {

    private final String name;

    public NombreTejedor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NombreTejedor that = (NombreTejedor) o;

        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String value() {
        return name;
    }
}
