package com.github.bgp.java_inicial.clase05._01_ejercicio._ASAPDemy;

import java.util.List;

public class AsapDemy {
    private List<Categoria> categorias;
    private List<Usuario> usuarios;

    public AsapDemy(List<Usuario> usuarios, List<Categoria> categorias) {
        this.usuarios = usuarios;
        this.categorias = categorias;
    }

    // ----------------------------------------------------------------------------
    
    // USUARIO_INEX
    private Usuario buscarUsuario(int idUsuario) {
    	Usuario usuario = null;
		int i = 0;
		while(i < this.usuarios.size() && usuario == null) {
	
			if(this.usuarios.get(i).mismoId(idUsuario)) {
				usuario = this.usuarios.get(i);
			}
			i++;
		}
		return usuario;
	}
    
    // ----------------------------------------------------------------------------
    
    private Curso buscarCurso(int idCurso) {
    	Curso curso = null;
    	int i = 0;
    	
    	while(i < this.categorias.size() && curso == null) {
    		curso = this.categorias.get(i).buscarCurso(idCurso);
    		i++;
    	}
    	
    	return curso;
    }
    
    // ----------------------------------------------------------------------------
    
    public void suscribirseACurso(int idUsuario, int idCurso) {
    	RespuestaSuscripcion respuesta = RespuestaSuscripcion.SUSCRIPTO_OK;
    	Curso curso = this.buscarCurso(idCurso);
    	Usuario usuario = this.buscarUsuario(idUsuario);
    	if (curso != null) {
    		if (usuario != null) {
    			respuesta = curso.suscribirUsuario(usuario);
    			respuesta.mostrarMensaje();
    		} else {
    			respuesta = RespuestaSuscripcion.USUARIO_INEX;
    			respuesta.mostrarMensaje();
    		}
    	} else {
    		respuesta = RespuestaSuscripcion.CURSO_INEX;
    		respuesta.mostrarMensaje();
    	}
    }
}
