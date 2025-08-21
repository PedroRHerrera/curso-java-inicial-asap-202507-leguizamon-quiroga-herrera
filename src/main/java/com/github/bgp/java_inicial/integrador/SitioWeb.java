package com.github.bgp.java_inicial.integrador;

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
    
    public double nroDeCuotasPromedio() {
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
    		promedio = acumulador / contadorPagosConTarjeta;
    	}
    	
    	return promedio;
    }
}
