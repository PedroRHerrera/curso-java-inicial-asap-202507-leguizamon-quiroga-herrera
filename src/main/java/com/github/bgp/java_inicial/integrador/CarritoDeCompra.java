package com.github.bgp.java_inicial.integrador;

import com.github.sanchezih.util.Fecha;


import java.util.List;

public class CarritoDeCompra implements Valuable {
    private String id;
    private List<Item> items;
    private MetodoDePago metodoDePago;
    private Fecha fecha;

    public CarritoDeCompra(String id, List<Item> items, MetodoDePago metodoDePago, Fecha fecha) {
        this.id = id;
        this.items = items;
        this.metodoDePago = metodoDePago;
        this.fecha = fecha;
        this.metodoDePago.setFechaCarrito(fecha);
    }

    @Override
    public double calcularPrecio() {
        double precioFinal = 0;
        for (Item item : items) {
            precioFinal += item.calcularPrecio();
        }
        return this.metodoDePago.calcularPrecio(precioFinal);
    }

    public String getId() {
        return id;
    }

    public boolean esTarjetaDeCredito() {
        return this.metodoDePago instanceof TarjetaDeCredito;
    }

    public int getCuotasTarjeta() {
        int cuotas = 0;
        TarjetaDeCredito tarjeta;

        if (this.esTarjetaDeCredito()) {
            tarjeta = (TarjetaDeCredito) this.metodoDePago;
            cuotas = tarjeta.getCantCuotas();
        }
        return cuotas;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
