package co.com.sofka.generico;

public abstract class Entity<I extends Id> {

    private final I id;

    public Entity(I id) {
        this.id = id;
    }

    public I getId() {
        return id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entity<?> entity = (Entity<?>) o;

        return id.equals(entity.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
