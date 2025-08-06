package com.github.bgp.java_inicial.clase05._01_ejercicio._ASAPDemy;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private int id;
    private String titulo;
    private double precio;
    private double estrellas;
    private List<Usuario> usuarios;
    private Usuario autor;
    private List<Leccion> lecciones;


    public Curso(int id, String titulo, double precio, double estrellas, Usuario autor) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.estrellas = estrellas;
        this.autor = autor;
        this.usuarios = new ArrayList<>();
        this.lecciones = new ArrayList<>();
    }

    public Curso() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(double estrellas) {
        this.estrellas = estrellas;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public List<Leccion> getLecciones() {
        return lecciones;
    }

    public void setLecciones(ArrayList<Leccion> lecciones) {
        this.lecciones = lecciones;
    }
}
