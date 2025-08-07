package com.github.bgp.java_inicial.clase05._01_ejercicio._ASAPDemy;

public enum RespuestaSuscripcion {
	CURSO_INEX("El curso no existe."), 
	USUARIO_INEX("El usuario no existe."), 
	YA_SUSCRIPTO("El usuario ya estaba suscripto en el curso."), 
	ES_AUTOR("El usuario que intenta suscribirse es el autor del curso."), 
	MAX_BECADOS("El usuario es becado y el curso ya cuenta con el máximo de becados posible."), 
	SUSCRIPTO_OK("El usuario se suscribió exitosamente al curso. Debe guardarse en la lista de suscriptos.");
	
	private final String mensaje;
	
	private RespuestaSuscripcion(String mensaje) {
		this.mensaje = mensaje;
	}
	
    // ----------------------------------------------------------------------------

	public void mostrarMensaje() {
		System.out.println(mensaje);
	}
}
