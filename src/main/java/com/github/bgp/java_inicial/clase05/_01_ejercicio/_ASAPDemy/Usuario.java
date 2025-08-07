package com.github.bgp.java_inicial.clase05._01_ejercicio._ASAPDemy;

public class Usuario {

	private int id;
	private String nombre;
	private String mail;
	private boolean esBecado;
	
	public Usuario(int id, String nombre, String mail, boolean esBecado) {
		this.id = id;
		this.nombre = nombre;
		this.mail = mail;
		this.esBecado = esBecado;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public boolean isEsBecado() {
		return esBecado;
	}

	public void setEsBecado(boolean esBecado) {
		this.esBecado = esBecado;
	}

	public boolean mismoId(int idUsuario) {
    	return this.id == idUsuario;
    }
	
}
