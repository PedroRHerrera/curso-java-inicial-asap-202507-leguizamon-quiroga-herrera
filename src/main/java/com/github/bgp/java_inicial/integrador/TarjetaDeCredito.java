package com.github.bgp.java_inicial.integrador;

public class TarjetaDeCredito extends MetodoDePago {

    private final double PORC_RECARGO_POR_CUOTA = 0.15;
    private int cuotas;

    public TarjetaDeCredito(int cuotas) {
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
