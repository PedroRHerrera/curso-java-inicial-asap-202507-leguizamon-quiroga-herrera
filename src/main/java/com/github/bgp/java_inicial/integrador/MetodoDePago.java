package com.github.bgp.java_inicial.integrador;

import com.github.sanchezih.util.Fecha;

public abstract class MetodoDePago {
    private Fecha fecha;
    private CarritoDeCompra carrito;

    public MetodoDePago(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setCarrito(CarritoDeCompra carrito) {
        this.carrito = carrito;
    }

    public long diasTranscurridos() {
        return Fecha.diasTranscurridosEntreFechas(carrito.getFecha(), this.fecha );
    }

    public abstract double calcularPrecio(double precio);
}