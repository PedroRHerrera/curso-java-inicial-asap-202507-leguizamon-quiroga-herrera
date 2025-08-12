package com.github.bgp.java_inicial.clase06._01_ejercicio._AdministradorDePersonal;

public abstract class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Empleado(int dni, String nombre, String apellido, int anioIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }
    
    /*------------------------------------------------------------------------------------------*/

    public int getAnioIngreso() {
    	return this.anioIngreso;
    }

    public double getSalario() {
        return calcularSalario();
    }

    public abstract double calcularSalario();
    
    /*------------------------------------------------------------------------------------------*/

    public void mostrarSalario() {
        System.out.println("Nombre " + this.nombre + " " + this.apellido + "  - Salario: $" + this.getSalario());
    }
    
    public void mostrarEmpleado(){
        System.out.println("Nombre: " + this.nombre + " " + "Apellido: " + this.apellido );
    }
}
