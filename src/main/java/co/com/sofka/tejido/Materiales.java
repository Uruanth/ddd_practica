package co.com.sofka.tejido;

import co.com.sofka.generico.Entity;
import co.com.sofka.tejido.values.Lana;
import co.com.sofka.tejido.values.MaterialesId;

import java.util.Objects;

public class Materiales extends Entity<MaterialesId> {

    private Lana lana;

    public Materiales(MaterialesId id, Lana lana) {
        super(id);
        Objects.requireNonNull(lana, "lana no puede ser null");
        this.lana = lana;
    }

    public void verificarDisponibilidad(String referencia){
        //todo: solicitar al responsable verificar en la base de datos la disponibilidad del producto con la refencia

    }

    public Lana lana() {
        return lana;
    }
}
