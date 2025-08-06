package com.github.bgp.java_inicial.clase05._01_ejercicio._ASAPDemy;

import java.util.ArrayList;
import java.util.List;

public class AsapDemy {
    private List<Categoria> categorias;
    private List<Usuario> usuarios;

    public AsapDemy(ArrayList<Categoria> usuarios, ArrayList<Usuario> categorias) {
        this.usuarios = new ArrayList<>();
        this.categorias = new ArrayList<>();
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public void suscribirseACurso(String idUsuario, String idCurso) {
    	
    }
}
