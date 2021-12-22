package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tejido.values.Lana;
import co.com.sofka.tejido.values.MaterialesId;

public class MaterialesAsignados extends DomainEvent {
    private final MaterialesId id;
    private final Lana lana;

    public MaterialesAsignados(MaterialesId id, Lana lana) {
        super("sofka.produccion.materialesAsignados");
        this.id = id;
        this.lana = lana;
    }

    public Lana getLana() {
        return lana;
    }

    public MaterialesId getId() {
        return id;
    }
}
