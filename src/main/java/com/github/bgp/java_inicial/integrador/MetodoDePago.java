package com.github.bgp.java_inicial.integrador;

import com.github.sanchezih.util.Fecha;

import java.time.LocalDate;

public abstract class MetodoDePago{
    private Fecha fecha;

    public long diasTranscurridos() {
        Fecha fechaActual = new Fecha(LocalDate.now().getDayOfMonth(),LocalDate.now().getMonthValue(),LocalDate.now().getYear());
        return Fecha.diasTranscurridosEntreFechas(fechaActual, this.fecha);
    }

    public abstract double calcularPrecio(double precio);

    public Fecha getFecha() {
        return fecha;
    }
}