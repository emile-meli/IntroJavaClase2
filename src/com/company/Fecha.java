package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    GregorianCalendar calendar;

    public Fecha(int dia, int mes, int anio) {
        if(dia <= 0 || mes < 0 || anio <= 0){
            throw new RuntimeException("Dia/Mes/Año no tiene un valor aceptable");
        }else if(mes >= 12){
            throw new RuntimeException("El mes no puede superar 11");
        }
        GregorianCalendar aux = new GregorianCalendar(anio, mes, 1);
        if(dia > aux.getActualMaximum(Calendar.DAY_OF_MONTH)){
            throw new RuntimeException("Valor de dia demasiado grande.");
        }
        calendar = new GregorianCalendar(anio, mes, dia);
    }

    public GregorianCalendar getCalendar() {
        return calendar;
    }

    public void setCalendar(GregorianCalendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        return calendar.get(Calendar.DAY_OF_MONTH) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR);
    }
}
