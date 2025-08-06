package com.github.bgp.java_inicial.clase05._01_ejercicio._ASAPDemy;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	private String id;
	private String nombre;
	private List<Curso> cursos;
	
	
	public Categoria(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.cursos = new ArrayList<>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public boolean buscarCurso(int idCurso) {
		boolean encontrado = false;
		int i = 0;
		while(i < this.cursos.size() && !encontrado) {
	
			if(this.cursos.get(i).mismoId(idCurso)) {
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}
	
	
}
