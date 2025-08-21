package com.github.bgp.java_inicial.clase08._01_ejercicio._Integrador;

import com.github.sanchezih.util.Fecha;

public class TransferenciaBancaria extends MetodoDePago {
    private final double PORC_RECARGO = 0.05;
    private final int DIAS_RECARGO_ADICIONAL = 10;
    private final double RECARGO_EXTRA = PORC_RECARGO * 2;
    private String cbu;

    public TransferenciaBancaria(Fecha fecha, String cbu) {
        super(fecha);
        this.cbu = cbu;
    }

    @Override
    public double calcularPrecio(double precio) {
        return pasaronMasDias() ? precio + (precio * (RECARGO_EXTRA)) : precio + (precio * PORC_RECARGO);
    }

    private boolean pasaronMasDias() {
        return super.diasTranscurridos() > DIAS_RECARGO_ADICIONAL;
    }
}
