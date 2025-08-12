package com.github.bgp.java_inicial.clase06._01_ejercicio._AdministradorDePersonal;

import java.time.LocalDateTime;

public class EmpleadoSalarioFijo extends Empleado {
    private final double SALARIO_BASICO = 40000;
    private final double AD_M2 = 0;
    private final double AD_2_A_5 = 0.05;
    private final double AD_6_A_10 = 0.1;
    private final double AD_MAS_DE_10 = 0.15;

    public EmpleadoSalarioFijo(int dni, String nombre, String apellido, int anioIngreso) {
        super(dni, nombre, apellido, anioIngreso);
    }
    
    /*------------------------------------------------------------------------------------------*/

    @Override
    public double calcularSalario() {
        int anioCalculado = calcularAntiguedad();
        double salario = SALARIO_BASICO;
        if(anioCalculado >= 2 && anioCalculado <= 5) {
            salario += salario * AD_2_A_5;
        } else if (anioCalculado > 5 && anioCalculado <=10) {
            salario += salario * AD_6_A_10;
        } else if(anioCalculado > 10) {
            salario += salario * AD_MAS_DE_10;
        }
        return salario;
    }
    
    /*------------------------------------------------------------------------------------------*/

    private int calcularAntiguedad() {;
        int anioActual = LocalDateTime.now().getYear();
        return anioActual - super.getAnioIngreso();
    }
}
