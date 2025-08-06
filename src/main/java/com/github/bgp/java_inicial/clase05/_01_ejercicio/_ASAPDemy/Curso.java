package com.github.bgp.java_inicial.clase05._01_ejercicio._ASAPDemy;

public class Curso {

    private int id;
    private String titulo;
    private double precio;
    private double estrellas;
    private Usuarios[] usuarios;
    private Usuario autor;
    private Leccion[] lecciones;


    public Curso(int id, String titulo, double precio, double estrellas) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.estrellas = estrellas;
        this.usuarios = usuarios;
        this.autor = autor;
        this.lecciones = lecciones;
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

    public Usuarios[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios[] usuarios) {
        this.usuarios = usuarios;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public Leccion[] getLecciones() {
        return lecciones;
    }

    public void setLecciones(Leccion[] lecciones) {
        this.lecciones = lecciones;
    }
}
