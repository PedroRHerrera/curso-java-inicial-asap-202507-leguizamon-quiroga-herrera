package com.github.bgp.java_inicial.integrador;

import com.github.sanchezih.util.Fecha;


import java.util.List;

public class CarritoDeCompra implements Valuable {

    private Fecha fecha;
    private List<Item> items;
    private String id;
    private MetodoDePago metodoDePago;

    public CarritoDeCompra(Fecha fecha, List<Item> items, String id, MetodoDePago metodoDePago) {
        this.fecha = fecha;
        this.items = items;
        this.id = id;
        this.metodoDePago = metodoDePago;
    }

    @Override
    public double calcularPrecio() {
        double preciofinal = 0;
        for (Item item : items) {
            preciofinal += item.calcularPrecio();
        }
        return  preciofinal;
    }
}
