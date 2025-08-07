package com.github.bgp.java_inicial.clase05._01_ejercicio._ASAPDemy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Creamos 20 usuarios
        Usuario usuario1 = new Usuario(1, "Rodrigo Perez", "rodrigo.perez@email.com", true);
        Usuario usuario2 = new Usuario(2, "Lucía Gómez", "lucia.gomez@email.com", false);
        Usuario usuario3 = new Usuario(3, "Carlos Sánchez", "carlos.sanchez@email.com", true);
        Usuario usuario4 = new Usuario(4, "María Torres", "maria.torres@email.com", false);
        Usuario usuario5 = new Usuario(5, "Javier López", "javier.lopez@email.com", true);
        Usuario usuario6 = new Usuario(6, "Ana Ruiz", "ana.ruiz@email.com", false);
        Usuario usuario7 = new Usuario(7, "Diego Fernández", "diego.fernandez@email.com", true);
        Usuario usuario8 = new Usuario(8, "Sofía Herrera", "sofia.herrera@email.com", false);
        Usuario usuario9 = new Usuario(9, "Manuel Castro", "manuel.castro@email.com", true);
        Usuario usuario10 = new Usuario(10, "Camila Romero", "camila.romero@email.com", false);
        Usuario usuario11 = new Usuario(11, "Gabriel Molina", "gabriel.molina@email.com", true);
        Usuario usuario12 = new Usuario(12, "Valentina Silva", "valentina.silva@email.com", false);
        Usuario usuario13 = new Usuario(13, "Andrés Rojas", "andres.rojas@email.com", true);
        Usuario usuario14 = new Usuario(14, "Martina Vargas", "martina.vargas@email.com", false);
        Usuario usuario15 = new Usuario(15, "Tomás Navarro", "tomas.navarro@email.com", true);
        Usuario usuario16 = new Usuario(16, "Elena Peña", "elena.pena@email.com", false);
        Usuario usuario17 = new Usuario(17, "Mateo Aguirre", "mateo.aguirre@email.com", true);
        Usuario usuario18 = new Usuario(18, "Renata León", "renata.leon@email.com", false);
        Usuario usuario19 = new Usuario(19, "Nicolás Paredes", "nicolas.paredes@email.com", true);
        Usuario usuario20 = new Usuario(20, "Isabela Duarte", "isabela.duarte@email.com", false);

        //Creamos lecciones
        Leccion leccion1 = new Leccion("Fundamentos de POO", 120, TipoLeccion.VIDEO);
        Leccion leccion2 = new Leccion("Algoritmia", 180, TipoLeccion.TEXTO);
        Leccion leccion3 = new Leccion("Estructuras de Datos", 150, TipoLeccion.VIDEO);
        Leccion leccion4 = new Leccion("Introducción a Bases de Datos", 200, TipoLeccion.RECURSO);
        Leccion leccion5 = new Leccion("Programación Funcional", 90, TipoLeccion.VIDEO);
        Leccion leccion6 = new Leccion("Control de Versiones con Git", 75, TipoLeccion.TEXTO);
        Leccion leccion7 = new Leccion("Diseño de Interfaces", 110, TipoLeccion.RECURSO);
        Leccion leccion8 = new Leccion("Testing de Software", 130, TipoLeccion.TEXTO);
        Leccion leccion9 = new Leccion("Principios SOLID", 140, TipoLeccion.VIDEO);
        Leccion leccion10 = new Leccion("Patrones de Diseño", 160, TipoLeccion.RECURSO);

        List<Leccion> leccionesCurso1 = new ArrayList<>();
        leccionesCurso1.add(leccion1);
        leccionesCurso1.add(leccion2);
        leccionesCurso1.add(leccion3);

        List<Leccion> leccionesCurso2 = new ArrayList<>();
        leccionesCurso2.add(leccion4);
        leccionesCurso2.add(leccion5);
        leccionesCurso2.add(leccion6);

        List<Leccion> leccionesCurso3 = new ArrayList<>();
        leccionesCurso3.add(leccion7);
        leccionesCurso3.add(leccion8);
        leccionesCurso3.add(leccion9);
        leccionesCurso3.add(leccion10);


        List<Usuario> usuariosCurso1 = new ArrayList<>();
        usuariosCurso1.add(usuario1);
        usuariosCurso1.add(usuario2);
        usuariosCurso1.add(usuario3);
        usuariosCurso1.add(usuario4);
        usuariosCurso1.add(usuario5);
        usuariosCurso1.add(usuario6);

        List<Usuario> usuariosCurso2 = new ArrayList<>();
        usuariosCurso2.add(usuario7);
        usuariosCurso2.add(usuario8);
        usuariosCurso2.add(usuario9);
        usuariosCurso2.add(usuario10);
        usuariosCurso2.add(usuario11);

        List<Usuario> usuariosCurso3 = new ArrayList<>();
        usuariosCurso2.add(usuario12);
        usuariosCurso3.add(usuario13);
        usuariosCurso3.add(usuario14);
        usuariosCurso3.add(usuario15);
        usuariosCurso3.add(usuario17);

        //Creamos 3 cursos
        Curso curso1 = new Curso(1, "Programacion I", 12000.0, 4.5, usuario16, usuariosCurso1, leccionesCurso1);
        Curso curso2 = new Curso(2, "Programacion II", 12000.0, 4.5, usuario18, usuariosCurso2, leccionesCurso2);
        Curso curso3 = new Curso(3, "Programacion III", 12000.0, 4.5, usuario20, usuariosCurso3, leccionesCurso3);

        //Creamos las categorias
        Categoria categoria1 = new Categoria(1,"Programacion");
        Categoria categoria2 = new Categoria(2,"Laboratorio de programacion");

    }
}
