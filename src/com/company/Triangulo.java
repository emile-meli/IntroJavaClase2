package com.company;

public class Triangulo extends FiguraGeometrica{

    double ancho, alto;

    public Triangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public double area() {
        setArea(alto*ancho/2);
        return getArea();
    }
}
