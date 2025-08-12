package com.github.bgp.java_inicial.clase07._01_ejercicio._EstadisticasExamenesDeConducir;

public class Moto extends Vehiculo {
	
	private boolean todosLosEspejos;

	public Moto(String patente, String marca, int cilindrada, boolean todosLosEspejos) {
		super(patente, marca, cilindrada);
		this.todosLosEspejos = todosLosEspejos;
	}

}
