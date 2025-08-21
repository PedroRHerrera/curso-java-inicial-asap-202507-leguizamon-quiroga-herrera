package com.github.bgp.java_inicial.integrador;

import com.github.sanchezih.util.Fecha;

public abstract class MetodoDePago {
    private Fecha fecha;
    private Fecha fechaCarrito;

    public MetodoDePago(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setFechaCarrito(Fecha fechaCarrito) {
        this.fechaCarrito = fechaCarrito;
    }

    public long diasTranscurridos() {
        return Fecha.diasTranscurridosEntreFechas(fechaCarrito, this.fecha);
    }

    public abstract double calcularPrecio(double precio);
}