package com.github.bgp.java_inicial.clase07._01_ejercicio._EstadisticasExamenesDeConducir;

import java.util.ArrayList;
import java.util.List;

public class ExamenDeMoto extends Examen {
	
	private final int SEGUNDOS_DESAPRUEBA = 120;
	private final int CILINDRADA_LIMITE = 150;
	private Moto moto;
	private List<Circuito> circuitos;
	
	public ExamenDeMoto(String fecha, Persona persona, Moto moto) {
		super(fecha, persona);
		this.moto = moto;
		this.circuitos = new ArrayList<Circuito>();
	}
	
	@Override
	public boolean evaluar() {
		return compararCilindradaMoto(CILINDRADA_LIMITE) ? this.evaluarMayorCC() : this.evaluarMenorCC();
	}
	
	public void agregarCircuito(Circuito c) {
		this.circuitos.add(c);
	}
	
	private boolean evaluarMenorCC() {
		boolean respuesta = true;
		int contDesaprobados = 0;
		int contTiempo = 0;
		int i = 0;
		Circuito circuito;
		
		while(i < this.circuitos.size() && contDesaprobados <= 1 && contTiempo < SEGUNDOS_DESAPRUEBA) {
			
			circuito = circuitos.get(i);
			contDesaprobados = circuito.evaluar() ?  contDesaprobados : contDesaprobados++;
			contTiempo += circuito.getTiempo();
			i++;
			
		}
		
		return respuesta;
	}
	
	private boolean evaluarMayorCC() {
		boolean respuesta = true;
		int i = 0;
		
		while(i < this.circuitos.size() && respuesta) {
			respuesta = this.circuitos.get(i).evaluar();
			i++;
		}
		
		return respuesta;
	}
	
	private boolean compararCilindradaMoto(int valor) {
		return this.moto.compararCilindrada(valor);
	}
	
	
	
	
}
