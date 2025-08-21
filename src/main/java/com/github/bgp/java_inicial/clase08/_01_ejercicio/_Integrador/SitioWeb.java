package com.github.bgp.java_inicial.clase08._01_ejercicio._Integrador;

import java.util.ArrayList;
import java.util.List;

public class SitioWeb {
    private List<CarritoDeCompra> carritos;

    public SitioWeb() {
        this.carritos = new ArrayList<>();
    }

    public String idDelCarritoMasCaro() {
        String id = "";
        double precioMax = 0;
        double precio;

        for (CarritoDeCompra carritoDeCompra : carritos) {
            precio = carritoDeCompra.calcularPrecio();
            if (precio > precioMax) {
                precioMax = precio;
                id = carritoDeCompra.getId();
            }
        }

        return id;
    }

    public double nroCuotasPromedio() {
        double promedio = 0;
        int contadorPagosConTarjeta = 0;
        int acumulador = 0;

        for (CarritoDeCompra carritoDeCompra : carritos) {
            if (carritoDeCompra.esTarjetaDeCredito()) {
                acumulador += carritoDeCompra.getCuotasTarjeta();
                contadorPagosConTarjeta++;
            }
        }

        if (acumulador > 0) {
            promedio = (double) acumulador / contadorPagosConTarjeta;
        }

        return promedio;
    }

    public void agregarCarritoVendido(CarritoDeCompra carrito) {
        this.carritos.add(carrito);
    }

    public void mostrarPreciosDeCarritosVendidos() {
        for (int i = 0; i < carritos.size(); i++) {
            System.out.println("Carrito 00" + (i + 1) + ": $" + carritos.get(i).calcularPrecio());
        }
    }
}
