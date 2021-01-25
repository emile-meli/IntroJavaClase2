package com.company;

public abstract class FiguraGeometrica {

    private double area;

    public abstract double area();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Tiene un area de: " + this.area;
    }
}
