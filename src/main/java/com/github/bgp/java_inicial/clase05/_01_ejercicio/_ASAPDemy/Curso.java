package com.github.bgp.java_inicial.clase05._01_ejercicio._ASAPDemy;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private int id;
    private String titulo;
    private double precio;
    private double estrellas;
    private Usuario autor;
    private List<Usuario> usuarios;
    private List<Leccion> lecciones;
    private static int MAX_BECADOS = 5;


    public Curso(int id, String titulo, double precio, double estrellas, Usuario autor, List<Usuario> usuarios, List<Leccion> lecciones) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.estrellas = estrellas;
        this.autor = autor;
        this.usuarios = usuarios;
        this.lecciones = lecciones;
    }
    
    // ----------------------------------------------------------------------------
    
    public boolean mismoId(int idCurso) {
    	return this.id == idCurso;
    }
    
    // ----------------------------------------------------------------------------
    
    // YA_SUSCRITO
    private boolean estaSuscrito(int idUsuario) {
    	boolean respuesta = false;
		int i = 0;
		while(i < this.usuarios.size() && !respuesta) {
	
			if(this.usuarios.get(i).mismoId(idUsuario)) {
				respuesta = true;
			}
			i++;
		}
		return respuesta;
	}
    
    // ----------------------------------------------------------------------------
    
    // ES_AUTOR
    private boolean esAutor(int idUsuario) {
    	return this.autor.mismoId(idUsuario);
    }
    
    
    private boolean limiteBecadosAlcanzado() {
    	boolean respuesta = false;
    	int cont = 0;
    	int i = 0;
    	
    	while(i < this.usuarios.size() && !respuesta) {
    		if (this.usuarios.get(i).esBecado()) {
    			cont++;
    		}
    		respuesta = (cont == MAX_BECADOS) ? true : false;
    		i++;
    	}
    	
    	return respuesta;
    }
    
    // ----------------------------------------------------------------------------
    
    public RespuestaSuscripcion suscribirUsuario(Usuario usuario) {
    	RespuestaSuscripcion respuesta = RespuestaSuscripcion.SUSCRIPTO_OK;
    	if(!esAutor(usuario.getId())) {
    		if (!estaSuscrito(usuario.getId())) {
    			if (usuario.esBecado()) {
        			if (!limiteBecadosAlcanzado()) {
        				this.usuarios.add(usuario);
        			} else {
        				respuesta = RespuestaSuscripcion.MAX_BECADOS;
        			}
        		}
    		} else {
    			respuesta = RespuestaSuscripcion.YA_SUSCRIPTO;
    		}
    	} else {
			respuesta = RespuestaSuscripcion.ES_AUTOR;
    	}
    	
    	return respuesta;
    }
    
    
}
