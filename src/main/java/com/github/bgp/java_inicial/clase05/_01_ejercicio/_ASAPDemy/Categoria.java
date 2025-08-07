package com.github.bgp.java_inicial.clase05._01_ejercicio._ASAPDemy;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	private int id;
	private String nombre;
	private List<Curso> cursos;
	
	
	public Categoria(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.cursos = new ArrayList<>();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
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
	
	public Curso buscarCurso(int idCurso) {
		Curso curso = null;
		int i = 0;
		while(i < this.cursos.size() && curso == null) {
	
			if(this.cursos.get(i).mismoId(idCurso)) {
				curso = this.cursos.get(i);
			}
			i++;
		}
		return curso;
	}
	
	
}
