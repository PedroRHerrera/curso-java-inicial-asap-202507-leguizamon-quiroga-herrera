package com.github.bgp.java_inicial.clase07._01_ejercicio._EstadisticasExamenesDeConducir;

public class ExamenDeAuto extends Examen{
	
	private final int SEGUNDOS_DESAPRUEBA = 90;
	private Circuito circuito;

	public ExamenDeAuto(String fecha, Persona persona, Vehiculo vehiculo, Circuito circuito) {
		super(fecha, persona, vehiculo);
		this.circuito = circuito;
	}
	
	public int getTiempo() {
		return this.circuito.getTiempo();
	}

	@Override
	public boolean evaluar() {
		return this.circuito.getTiempo() <= SEGUNDOS_DESAPRUEBA;
	}

}
