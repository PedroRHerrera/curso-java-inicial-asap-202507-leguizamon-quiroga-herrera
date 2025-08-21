package com.github.bgp.java_inicial.integrador;

import com.github.sanchezih.util.Fecha;


import java.util.List;

public class CarritoDeCompra implements Valuable {

    private Fecha fecha;
    private List<Item> items;
    private String id;
    private MetodoDePago metodoDePago;

    public CarritoDeCompra(Fecha fecha, List<Item> items, String id, MetodoDePago metodoDePago) {
        this.fecha = fecha;
        this.items = items;
        this.id = id;
        this.metodoDePago = metodoDePago;
    }

    @Override
    public double calcularPrecio() {
        double precioFinal = 0;
        for (Item item : items) {
        	precioFinal += item.calcularPrecio();
        }
        
        return  this.metodoDePago.calcularPrecio(precioFinal);
    }
    
    public String getId() {
    	return id;
    }
    
    public boolean esTarjetaDeCredito() {
    	return this.metodoDePago instanceof TarjetaDeCredito;
    }
    
    public int getCuotasTarjeta() {
    	int cuotas = 0;
    	TarjetaDeCredito tarjeta;
    	
    	if (this.esTarjetaDeCredito()) {
    		tarjeta = (TarjetaDeCredito) this.metodoDePago;
    		cuotas = tarjeta.getCantCuotas();
    	}
    	
    	return cuotas;
    }
    
}
