package com.github.bgp.java_inicial.integrador;

public class TransferenciaBancaria extends MetodoDePago {

    private final double PORC_RECARGO = 0.05;
    private final int DIAS_RECARGO_ADICIONAL = 10;
    private String cbu;

    public TransferenciaBancaria(String cbu) {
        this.cbu = cbu;
    }

    @Override
    public double calcularPrecio(double precio) {
        return pasaronMasDias() ? precio + (precio * (PORC_RECARGO * 2)) : precio + (precio * PORC_RECARGO);
    }
    
    private boolean pasaronMasDias() {
    	return super.diasTranscurridos() > DIAS_RECARGO_ADICIONAL;
    }
}
