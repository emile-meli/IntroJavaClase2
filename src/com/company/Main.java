package com.company;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        //Ejercicio 1 TM

/*	    CuentaCorriente cuentaA = new CuentaCorriente("Emile", 10000);
	    CuentaCorriente cuentaB = new CuentaCorriente("Alan", 1000000);

	    CuentaCorriente cuentaC = new CuentaCorriente("Fede",1000);
	    CuentaCorriente cuentaD = cuentaC;
	    cuentaD.setNombreTitular("Jorge");

	    cuentaB.transferencia(cuentaA, 1000);

        System.out.println(cuentaC.getNombreTitular());*/

        //Ejercicio 2 TM

        //Ejercicio 3 TM
        Libro libro = new Libro("Harry Potter", "J. K. Rowling", 12342324);
        System.out.println(libro.toString());

        //Ejercicio 4 TM
        System.out.println("3/2 + 1/2 = " + Fraccion.suma(3,2,1,2));
        System.out.println("1/2 + 1 = " + Fraccion.suma(1,2,1));
        System.out.println("3/2 - 1/2 = " + Fraccion.resta(3,2,1,2));
        System.out.println("1/2 - 1 = " + Fraccion.resta(1,2,1));
        System.out.println("3/2 * 1/2 = " + Fraccion.multiplicacion(3,2,1,2));
        System.out.println("1/2 * 1 = " + Fraccion.multiplicacion(1,2,1));
        System.out.println("3/2 / 1/2 = " + Fraccion.dividir(3,2,1,2));
        System.out.println("1/2 / 2 = " + Fraccion.dividir(1,2,2));

        //Ejercicio 5 TM

        Fecha fecha1 = new Fecha(31,5,2021);
        System.out.println(fecha1);
        System.out.println("Agregando un dia a es fecha se obtiene: " + fecha1.addDay());
        System.out.println("31/2/2020 " + (Fecha.checkDate(31,1,2020)?"Fecha válida":"Fecha no válida"));

    }
}
