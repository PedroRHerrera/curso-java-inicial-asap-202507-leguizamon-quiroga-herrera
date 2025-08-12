package com.github.bgp.java_inicial.clase06._01_ejercicio._AdministradorDePersonal;

public class EmpleadoComision extends Empleado {
    private int cantidadClientes;
    private final double SALARIO_MINIMO = 20000;
    private final double MONTO_A_COBRAR_X_CLIENTE = 5000;

    public EmpleadoComision(int dni, String nombre, String apellido, int anioIngreso, int cantidadClientes) {
        super(dni, nombre, apellido, anioIngreso);
        this.cantidadClientes = cantidadClientes;
    }
    
    /*------------------------------------------------------------------------------------------*/

    @Override
    public double calcularSalario() {
        double salarioTotal = MONTO_A_COBRAR_X_CLIENTE * cantidadClientes;
        if(salarioTotal < SALARIO_MINIMO) {
            salarioTotal = SALARIO_MINIMO;
        }
        return salarioTotal;
    }
    
    /*------------------------------------------------------------------------------------------*/

    public int getCantidadClientes() {
        return cantidadClientes;
    }
    

    public boolean masClientes(int clientes) {
        return this.cantidadClientes > clientes;
    }
}
