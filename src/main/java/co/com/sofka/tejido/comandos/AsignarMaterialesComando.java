package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.Lana;
import co.com.sofka.tejido.values.MaterialesId;
import co.com.sofka.tejido.values.ProduccionId;

public class AsignarMaterialesComando extends Command {
    private final ProduccionId id;
    private final MaterialesId materialesId;
    private final Lana lana;

    public ProduccionId getId() {
        return id;
    }

    public MaterialesId getMaterialesId() {
        return materialesId;
    }

    public Lana getLana() {
        return lana;
    }

    public AsignarMaterialesComando(ProduccionId id, MaterialesId materialesId, Lana lana) {
        this.id = id;
        this.materialesId = materialesId;
        this.lana = lana;
    }
}
