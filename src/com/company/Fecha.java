package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    int dia;
    int mes;
    int anio;

    public Fecha(int dia, int mes, int anio) {
        if(!checkDate(dia, mes, anio)){
            throw new RuntimeException("Valores no validos.");
        }
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }



    public static boolean checkDate(int dia, int month, int year){
        if(dia <= 0 || month <= 0 || year <= 0){
            return false;
        }else if(month > 12){
            return false;
        }
        GregorianCalendar aux = new GregorianCalendar(year, month-1, 1);
        return dia <= aux.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public Fecha addDay(){
        GregorianCalendar calendar = new GregorianCalendar(anio, mes - 1, dia);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        this.dia = calendar.get(Calendar.DAY_OF_MONTH);
        this.mes = calendar.get(Calendar.MONTH) + 1;
        this.anio = calendar.get(Calendar.YEAR);
        return this;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
}
