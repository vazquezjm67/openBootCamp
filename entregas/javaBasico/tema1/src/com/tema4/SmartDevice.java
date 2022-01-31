package com.tema4;

public abstract class  SmartDevice {
    String fabricante;
    String modelo;
    int duracionBateria;
    int tamañoPantalla;
    double precio;
    int garantia;

    public SmartDevice() {
    }

    public SmartDevice(String fabricante, String modelo, int duracionBateria, int tamañoPantalla, double precio, int garantia) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.duracionBateria = duracionBateria;
        this.tamañoPantalla = tamañoPantalla;
        this.precio = precio;
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", duracionBateria=" + duracionBateria +
                ", tamañoPantalla=" + tamañoPantalla +
                ", precio=" + precio +
                ", garantia=" + garantia +
                '}';
    }
}
