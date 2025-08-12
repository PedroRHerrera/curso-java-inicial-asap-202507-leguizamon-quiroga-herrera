package com.github.bgp.java_inicial.clase07._01_ejercicio._EstadisticasExamenesDeConducir;

public class Circuito implements Evaluable{

	private final int FALTAS_DESAPRUEBA = 2;
	private int tiempoEnSeg;
	private int cantFaltas;
	
	public Circuito(int tiempoEnSeg, int cantFaltas) {
		this.tiempoEnSeg = tiempoEnSeg;
		this.cantFaltas = cantFaltas;
	}

	@Override
	public boolean evaluar() {
		return cantFaltas <= FALTAS_DESAPRUEBA;
	}
	
	public int getTiempo() {
		return this.tiempoEnSeg;
	}
	
}
