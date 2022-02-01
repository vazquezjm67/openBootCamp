package com.tema5;

public class Coche {
    String fabricante;
    String modelo;
    String matricula;
    int year;

    public Coche() {}

    public Coche(String fabricante, String modelo, String matricula, int year) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.matricula = matricula;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", year=" + year +
                '}';
    }
}


