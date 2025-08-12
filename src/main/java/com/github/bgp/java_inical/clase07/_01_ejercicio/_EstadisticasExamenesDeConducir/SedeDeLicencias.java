package com.github.bgp.java_inical.clase07._01_ejercicio._EstadisticasExamenesDeConducir;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class SedeDeLicencias {

	private List<Examen> examenes;
	
	public SedeDeLicencias() {
		this.examenes = new ArrayList<Examen>();
	}
	
	public void agregarExamen(Examen e) {
		this.examenes.add(e);
	}
	
	public String obtenerInforme() {
		Informe i = new Informe(obtenerPorcentajeReprobados(), obtenerPromedioTiempoAutosAprobados());
		Gson gson = new Gson();
        String json = gson.toJson(i);
        
		return json;
	}
	
	private double obtenerPorcentajeReprobados() {
		double porcentaje = 0;
		int contReprobados = 0;
		
		for (Examen examen: examenes) {
			if (!examen.evaluar()) {
				contReprobados++;
			}
			//contReprobados = !examen.evaluar() ? contReprobados++ : contReprobados;
		}
		
		porcentaje = (contReprobados * 100) / this.examenes.size();
		
		return porcentaje;
	}
	
	private double obtenerPromedioTiempoAutosAprobados() {
		double promedio = 0;
		double tiempoTotal = 0;
		int cantExamenAutoAprobados = 0;
		
		for (Examen examen : examenes) {
			
			if (examen instanceof ExamenDeAuto) {
				
				if (examen.evaluar()) {
					
					ExamenDeAuto e = (ExamenDeAuto) examen;
					tiempoTotal += e.getTiempo();
					cantExamenAutoAprobados++;
					
				}
			}
		}
		
		promedio = tiempoTotal / cantExamenAutoAprobados;
		
		return promedio;
	}
	
}
