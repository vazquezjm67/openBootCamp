package com.tema4;

public class SmartWatch extends SmartDevice {
    float tamnhoPnatalla;
    int generacionBlooth;
    String tipoCorrea;

    public SmartWatch() {
    }

    public SmartWatch(String fabricante, String modelo, int duracionBateria, int tamañoPantalla, double precio, int garantia, float tamnhoPnatalla, int generacionBlooth, String tipoCorrea) {
        super(fabricante, modelo, duracionBateria, tamañoPantalla, precio, garantia);
        this.tamnhoPnatalla = tamnhoPnatalla;
        this.generacionBlooth = generacionBlooth;
        this.tipoCorrea = tipoCorrea;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", duracionBateria=" + duracionBateria +
                ", tamañoPantalla=" + tamañoPantalla +
                ", precio=" + precio +
                ", garantia=" + garantia +
                ", tamnhoPnatalla=" + tamnhoPnatalla +
                ", generacionBlooth=" + generacionBlooth +
                ", tipoCorrea='" + tipoCorrea + '\'' +
                '}';
    }
}
