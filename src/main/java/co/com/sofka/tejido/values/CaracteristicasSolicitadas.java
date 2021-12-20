package co.com.sofka.tejido.values;

import java.util.Objects;

public class CaracteristicasSolicitadas {

    private final String color;
    private final String tamanho;
    private final String observaciones;
    private final String material;


    public CaracteristicasSolicitadas(String color, String tamanho, String observaciones, String material) {
        this.color = Objects.requireNonNull(color);
        this.tamanho = Objects.requireNonNull(tamanho);;
        this.observaciones = Objects.requireNonNull(observaciones);;
        this.material = Objects.requireNonNull(material);;
    }
}
