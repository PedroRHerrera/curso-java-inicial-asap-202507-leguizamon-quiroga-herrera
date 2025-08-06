package com.github.bgp.java_inicial.clase05._01_ejercicio._ASAPDemy;

public class AsapDemy {
    private Categoria[] categorias;
    private Usuario[] usuarios;

    public AsapDemy(Usuario[] usuarios, Categoria[] categorias) {
        this.usuarios = usuarios;
        this.categorias = categorias;
    }

    public Categoria[] getCategorias() {
        return categorias;
    }

    public void setCategorias(Categoria[] categorias) {
        this.categorias = categorias;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }
}
