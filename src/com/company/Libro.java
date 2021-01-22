package com.company;

import java.util.Date;

public class Libro {

    private String titulo;
    private String autor;
    private int isbn;
    private boolean prestamo = false;

    public Libro(String titulo, String autor, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public boolean isPrestamo() {
        return prestamo;
    }

    public void setPrestamo(boolean enPrestamo) {
        this.prestamo = enPrestamo;
    }

    public void prestamo(){
        this.prestamo = true;
    }

    public void devolucion(){
        this.prestamo = false;
    }

 /*   public String toString(){
        return this.titulo + ", " + this.isbn + ", " + this.autor;
    }*/

/*    @Override // Error de compilación
    public String tostring(){

    }*/

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn=" + isbn +
                ", prestamo=" + prestamo +
                '}';
    }
}
