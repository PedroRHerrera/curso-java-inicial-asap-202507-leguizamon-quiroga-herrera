package com.github.bgp.java_inicial.clase07._01_ejercicio._EstadisticasExamenesDeConducir;

public abstract class Vehiculo {

	private String patente;
	private String marca;
	private int cilindrada;
	
	
	public Vehiculo(String patente, String marca, int cilindrada) {
		this.patente = patente;
		this.marca = marca;
		this.cilindrada = cilindrada;
	}
	
	public boolean compararCilindrada(int valor) {
		return this.cilindrada > valor;
	}
	
}
