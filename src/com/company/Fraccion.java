package com.company;

public class Fraccion {

    //Suma entre fracciones
    public static double suma(int num1, int den1, int num2, int den2){
        if(den1 == 0 || den2 == 0){
            throw new RuntimeException("Un denominador no puede ser cero");
        }

        double denominador = den1 * den2;
        double numerador = num1*den2 + num2*den1;
        return numerador/denominador;
    }

    //Suma de fraccion con entero
    public static double suma(int num1, int den1, int sumando){
        if(den1 == 0){
            throw new RuntimeException("Un denominador no puede ser cero");
        }

        double numerador = num1 + sumando * den1;
        return numerador/ (double) den1;
    }

    //Resta entre fracciones
    public static double resta(int num1, int den1, int num2, int den2){
        if(den1 == 0 || den2 == 0){
            throw new RuntimeException("Un denominador no puede ser cero");
        }

        double denominador = den1 * den2;
        double numerador = num1*den2 - num2*den1;
        return numerador/denominador;
    }

    //Resta entre fraccion y un numero entero
    public static double resta(int num1, int den1, int restando){
        if(den1 == 0){
            throw new RuntimeException("Un denominador no puede ser cero");
        }

        double numerador = num1 - restando*den1;
        return numerador/ (double) den1;
    }

    //Producto entre fracciones
    public static double multiplicacion(int num1, int den1, int num2, int den2){
        if(den1 == 0 || den2 == 0){
            throw new RuntimeException("Un denominador no puede ser cero");
        }

        double denominador = den1 * den2;
        double numerador = num1 * num2;
        return numerador/denominador;
    }

    //Producto entre fraccion y un numero entero
    public static double multiplicacion(int num1, int den1, int multiplicando){
        if(den1 == 0){
            throw new RuntimeException("Un denominador no puede ser cero");
        }

        double numerador = num1 * multiplicando*den1;
        return numerador/ (double) den1;
    }

    //Division entre fracciones
    public static double dividir(int num1, int den1, int num2, int den2){
        if(den1 == 0 || den2 == 0){
            throw new RuntimeException("Un denominador no puede ser cero");
        }

        double denominador = den1 * num2;
        double numerador = num1 * den2;
        return numerador/denominador;
    }

    //Division entre fraccion y un numero entero
    public static double dividir(int num1, int den1, int dividendo){
        if(den1 == 0 || dividendo == 0){
            throw new RuntimeException("Un denominador no puede ser cero");
        }

        double denominador = den1*dividendo ;
        return (double) num1 /denominador;
    }
}
