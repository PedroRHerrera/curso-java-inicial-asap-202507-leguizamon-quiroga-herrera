package com.github.bgp.java_inicial.clase08._01_ejercicio._Integrador;

import com.github.sanchezih.util.Fecha;

public class TarjetaDeCredito extends MetodoDePago {

    private final double PORC_RECARGO_POR_CUOTA = 0.15;
    private int cuotas;

    public TarjetaDeCredito(Fecha fecha, int cuotas) {
        super(fecha);
        this.cuotas = cuotas;
    }

    public int getCantCuotas() {
        return cuotas;
    }

    @Override
    public double calcularPrecio(double precio) {
        return precio + (precio * calcularRecargo());
    }

    private double calcularRecargo() {
        return this.cuotas * PORC_RECARGO_POR_CUOTA;
    }
}
