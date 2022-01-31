package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

public class Coche extends Vehiculo {
    int numeroPuertas;
    String tipo;

    public Coche(String fabricante, String modeloVehiculo, double cc, int year, boolean sport, int speed, Motor motor, int numeroPuertas, String tipo) {
        super(fabricante, modeloVehiculo, cc, year, sport, speed, motor);
        this.numeroPuertas = numeroPuertas;
        this.tipo = tipo;
    }
}
