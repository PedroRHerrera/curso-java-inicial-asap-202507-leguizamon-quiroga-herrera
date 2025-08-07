package com.github.bgp.java_inicial.clase05._01_ejercicio._ASAPDemy;

public class Leccion {
    private String nombre;
    private Integer duracion;
    private TipoLeccion tipoLeccion;

    public Leccion() {
    }

    public Leccion(String nombre, Integer duracion, TipoLeccion tipoLeccion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.tipoLeccion = tipoLeccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public TipoLeccion getTipoLeccion() {
        return tipoLeccion;
    }

    public void setTipoLeccion(TipoLeccion tipoLeccion) {
        this.tipoLeccion = tipoLeccion;
    }
}