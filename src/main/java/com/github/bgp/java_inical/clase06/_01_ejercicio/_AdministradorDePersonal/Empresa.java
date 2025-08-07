package com.github.bgp.java_inical.clase06._01_ejercicio._AdministradorDePersonal;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }
    
    /*------------------------------------------------------------------------------------------*/

    public Empleado empleadoConMasClientes() {

        EmpleadoComision empleadoMaxClientes = null;
        Empleado empleado;
        int maxClientes = 0;
        
        for (int i = 0; i < empleados.size(); i++) {
        	
            empleado = empleados.get(i);
            
            if (empleado instanceof EmpleadoComision) {
                EmpleadoComision empleadoComision = (EmpleadoComision) empleado;    // DownCasting 

                if (empleadoComision.masClientes(maxClientes)) {
                    maxClientes = empleadoComision.getCantidadClientes();
                    empleadoMaxClientes = empleadoComision;
                }
            }
        }
        
        return empleadoMaxClientes;
    }
    
    /*------------------------------------------------------------------------------------------*/

    public void mostrarSalarios() {
        for(int i = 0; i < empleados.size(); i++) {
            empleados.get(i).mostrarSalario();
        }
    }
    
    /*------------------------------------------------------------------------------------------*/
    
    public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

}
