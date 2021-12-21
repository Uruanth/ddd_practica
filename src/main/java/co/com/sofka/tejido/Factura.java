package co.com.sofka.tejido;

import co.com.sofka.generico.Entity;
import co.com.sofka.tejido.values.Costos;
import co.com.sofka.tejido.values.DatosCliente;
import co.com.sofka.tejido.values.FacturaId;
import co.com.sofka.tejido.values.ProductoFinal;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Factura extends Entity<FacturaId> {

    private Set<ProductoFinal> productos;
    private DatosCliente datosCliente;
    private Costos costos;

    public Factura(FacturaId facturaId, DatosCliente datosCliente) {
        super(facturaId);
        Objects.requireNonNull(datosCliente, "datosCliente no puede ser nulo");
        this.productos = new HashSet<>();
        this.datosCliente = datosCliente;
    }


    public void calcularCostos() {
        productos.stream()
                .forEach(productos ->
                        this.costos = this.costos.sumarValor(productos.getCosto()));

    }

    public void agregarProducto(Double costo, String nombre, String caracteristicas) {
        Objects.requireNonNull(costo, "costo no puede ser nulo");
        Objects.requireNonNull(nombre, "nombre no puede ser nulo");
        Objects.requireNonNull(caracteristicas, "caracteristicas no puede ser nulo");
        productos.add(new ProductoFinal(costo, nombre, caracteristicas));
    }


    public void actualizarCliente(String nombre, String contacto, String cedula) {
        this.datosCliente = new DatosCliente(nombre, contacto, cedula);
    }


    public Set<ProductoFinal> productos() {
        return productos;
    }

    public DatosCliente datosCliente() {
        return datosCliente;
    }
}
