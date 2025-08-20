package com.github.bgp.java_inicial.integrador;
import com.github.sanchezih.util.Fecha;

public class TransferenciaBancaria extends MetodoDePago {

    private final double PORC_RECARGO = 0.05;
    private final int DIAS_RECARGO_ADICIONAL = 10;
    private String cbu;

    public TransferenciaBancaria(String cbu) {
        this.cbu = cbu;
    }

    @Override
    public double calcularPrecio(double precio) {
        return 0;
    }

    public int diasTranscurridos() {
        return 0;
    };
}
