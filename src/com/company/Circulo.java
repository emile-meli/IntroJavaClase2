package com.company;

public class Circulo extends FiguraGeometrica{

    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        setArea(Math.PI * Math.pow(radio,2));
        return getArea();
    }
}
