package com.github.bgp.java_inicial.clase07._01_ejercicio._EstadisticasExamenesDeConducir;

public class ExamenDeAuto extends Examen{
	
	private final int SEGUNDOS_DESAPRUEBA = 90;
	private Auto auto;
	private Circuito circuito;

	public ExamenDeAuto(String fecha, Persona persona, Auto auto, Circuito circuito) {
		super(fecha, persona);
		this.auto = auto;
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
