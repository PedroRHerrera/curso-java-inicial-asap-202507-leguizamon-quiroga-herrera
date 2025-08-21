package com.github.bgp.java_inicial.integrador;

import com.github.sanchezih.util.Fecha;

public class Efectivo extends MetodoDePago {
    private final double PORC_DESCUENTO = 0.10;
    private final double PORC_DESCUENTO_FINAL = 0.15;
    private boolean consumidorFinal;

    public Efectivo(Fecha fecha, boolean consumidorFinal) {
        super(fecha);
        this.consumidorFinal = consumidorFinal;
    }

    @Override
    public double calcularPrecio(double precio) {
        return consumidorFinal ? precio - (precio * PORC_DESCUENTO_FINAL) : precio - (precio * PORC_DESCUENTO);
    }
}
