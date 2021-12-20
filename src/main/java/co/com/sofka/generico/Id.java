package co.com.sofka.generico;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public abstract class Id implements Serializable {

    private final String value;

    public Id() {
        this(UUID.randomUUID().toString());
    }

    public Id(String value){
        this.value = Objects.requireNonNull(value);
        if(value.isEmpty()) {
            throw new IllegalArgumentException("El valor esta en blanco");
        }
    }

    public String getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Id id = (Id) obj;
        return Objects.equals(value, id.value);
    }
}
