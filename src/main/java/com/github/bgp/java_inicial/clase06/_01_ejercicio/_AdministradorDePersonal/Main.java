package com.github.bgp.java_inicial.clase06._01_ejercicio._AdministradorDePersonal;

public class Main {
    public static void main(String[] args) {
    	
    	//Se crea una instancia de Empresa
        Empresa telefe = new Empresa();
        
        /*------------------------------------------------------------------------------------------*/
        
        // Se agregan empleados de Comision a la empresa
        telefe.agregarEmpleado(new EmpleadoComision(42555666, "Maria", "Becerra", 2005, 10));
        telefe.agregarEmpleado(new EmpleadoComision(42555667, "Lionel", "Scaloni", 1998, 12));
        telefe.agregarEmpleado(new EmpleadoComision(42555668, "Bautista", "Montenegro", 1997, 9));
        telefe.agregarEmpleado(new EmpleadoComision(42555669, "Emilia", "Mernes", 2001, 11));
        telefe.agregarEmpleado(new EmpleadoComision(42555670, "Rodrigo", "DePaul", 1994, 8));
        telefe.agregarEmpleado(new EmpleadoComision(42555671, "Tini", "Stoessel", 1997, 10));
        telefe.agregarEmpleado(new EmpleadoComision(42555672, "Pedro", "Almada", 1999, 13));
        telefe.agregarEmpleado(new EmpleadoComision(42555673, "Cande", "Tinelli", 2000, 7));
        telefe.agregarEmpleado(new EmpleadoComision(42555674, "Nico", "Occhiato", 1993, 10));
        telefe.agregarEmpleado(new EmpleadoComision(42555675, "Lali", "Espósito", 1991, 12));
        telefe.agregarEmpleado(new EmpleadoComision(42555676, "Mauro", "Icardi", 1992, 9));
        telefe.agregarEmpleado(new EmpleadoComision(42555677, "Zoe", "Gotusso", 1995, 31));
        telefe.agregarEmpleado(new EmpleadoComision(42555678, "Thiago", "PZK", 2001, 8));
        telefe.agregarEmpleado(new EmpleadoComision(42555679, "Ciro", "Martinez", 2003, 10));
        telefe.agregarEmpleado(new EmpleadoComision(42555680, "Malena", "Narvay", 1998, 9));
        telefe.agregarEmpleado(new EmpleadoComision(42555681, "Luciano", "Pereyra", 1989, 7));
        telefe.agregarEmpleado(new EmpleadoComision(42555682, "Ángela", "Torres", 2000, 12));
        telefe.agregarEmpleado(new EmpleadoComision(42555683, "Federico", "Bal", 1996, 20));
        telefe.agregarEmpleado(new EmpleadoComision(42555684, "Brenda", "Asnicar", 1991, 11));
        telefe.agregarEmpleado(new EmpleadoComision(42555685, "Gastón", "Dalmau", 1993, 10));
        
        /*------------------------------------------------------------------------------------------*/

        // Se agregan empleados de Salario Fijo a la empresa
        telefe.agregarEmpleado(new EmpleadoSalarioFijo(43000001, "Sofia", "Juarez", 2024));
        telefe.agregarEmpleado(new EmpleadoSalarioFijo(43000002, "Mateo", "Rinaldi", 2020));
        telefe.agregarEmpleado(new EmpleadoSalarioFijo(43000003, "Julia", "Salguero", 2022));
        telefe.agregarEmpleado(new EmpleadoSalarioFijo(43000004, "Benjamin", "Serrano", 2018));
        telefe.agregarEmpleado(new EmpleadoSalarioFijo(43000005, "Micaela", "Arce", 2001));
        telefe.agregarEmpleado(new EmpleadoSalarioFijo(43000006, "Lucas", "Ferrari", 1997));
        telefe.agregarEmpleado(new EmpleadoSalarioFijo(43000007, "Catalina", "Moreno", 2000));
        telefe.agregarEmpleado(new EmpleadoSalarioFijo(43000008, "Juan", "Oliva", 1994));
        telefe.agregarEmpleado(new EmpleadoSalarioFijo(43000009, "Valeria", "Silvestre", 2002));
        telefe.agregarEmpleado(new EmpleadoSalarioFijo(43000010, "Alan", "Espinoza", 1996));
        telefe.agregarEmpleado(new EmpleadoSalarioFijo(43000011, "Rocio", "Maldonado", 1991));
        telefe.agregarEmpleado(new EmpleadoSalarioFijo(43000012, "Facundo", "Vera", 1990));
        telefe.agregarEmpleado(new EmpleadoSalarioFijo(43000013, "Luciana", "Aguirre", 2003));
        telefe.agregarEmpleado(new EmpleadoSalarioFijo(43000014, "Nicolas", "Benitez", 2023));
        telefe.agregarEmpleado(new EmpleadoSalarioFijo(43000015, "Julieta", "Gimenez", 1998));
        telefe.agregarEmpleado(new EmpleadoSalarioFijo(43000016, "Diego", "Montes", 2006));
        telefe.agregarEmpleado(new EmpleadoSalarioFijo(43000017, "Camila", "Rossi", 2004));
        telefe.agregarEmpleado(new EmpleadoSalarioFijo(43000018, "Agustin", "Franco", 2021));
        telefe.agregarEmpleado(new EmpleadoSalarioFijo(43000019, "Milagros", "Palacios", 2000));
        telefe.agregarEmpleado(new EmpleadoSalarioFijo(43000020, "Tobias", "Mendez", 2016));

        /*------------------------------------------------------------------------------------------*/
        
        //Test
        telefe.mostrarSalarios();
        telefe.empleadoConMasClientes().mostrarEmpleado();
        
        /*------------------------------------------------------------------------------------------*/
    }
}
