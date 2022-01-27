package poo.clases;

public class Vehiculo {
    protected  String fabricante;
    String modeloVehiculo;
    double cc;
    int year;
    boolean sport;
    int speed;
    Motor motor;


    public Vehiculo() {
    }

    public Vehiculo(String fabricante, String modeloVehiculo, double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modeloVehiculo = modeloVehiculo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport) {
        this.fabricante = fabricante;
        this.modeloVehiculo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = 0;




    }

    public void acelerar(int qantity){
        this.speed += qantity;
    }







}


