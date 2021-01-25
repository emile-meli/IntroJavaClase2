package com.company;

import java.util.List;

public class AreaUtil {

    public static double areaPromedio(List<FiguraGeometrica> figuras){
        double areaPromedio = 0;
        for(FiguraGeometrica figura: figuras){
            areaPromedio += figura.area();
        }
        areaPromedio = areaPromedio/figuras.size();
        return areaPromedio;
    }
}
