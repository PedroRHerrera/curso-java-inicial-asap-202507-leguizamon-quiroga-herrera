package com.github.bgp.java_inicial.clase07._01_ejercicio._EstadisticasExamenesDeConducir;

public abstract class Examen implements Evaluable {

	private String fecha;
	private Persona persona;
	private Vehiculo vehiculo;
	
	public Examen(String fecha, Persona persona, Vehiculo vehiculo) {
		this.fecha = fecha;
		this.vehiculo = vehiculo;
		this.persona = persona;
	}
	
	public boolean compararCilindrada(int valor) {
		return this.vehiculo.compararCilindrada(valor);
	}
	
	public abstract boolean evaluar();
	
}
