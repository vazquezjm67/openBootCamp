package com.tema4;

public class SmartPhone extends SmartDevice {
    String generacionComunicaciones;
    String tipoWifi;

    public SmartPhone() {
    }

    public SmartPhone(String generacionComunicaciones, String tipoWifi) {
        this.generacionComunicaciones = generacionComunicaciones;
        this.tipoWifi = tipoWifi;
    }

    public SmartPhone(String fabricante, String modelo, int duracionBateria, int tamañoPantalla, double precio, int garantia, String generacionComunicaciones, String tipoWifi) {
        super(fabricante, modelo, duracionBateria, tamañoPantalla, precio, garantia);
        this.generacionComunicaciones = generacionComunicaciones;
        this.tipoWifi = tipoWifi;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", duracionBateria=" + duracionBateria +
                ", tamañoPantalla=" + tamañoPantalla +
                ", precio=" + precio +
                ", garantia=" + garantia +
                ", generacionComunicaciones='" + generacionComunicaciones + '\'' +
                ", tipoWifi='" + tipoWifi + '\'' +
                '}';
    }
}
