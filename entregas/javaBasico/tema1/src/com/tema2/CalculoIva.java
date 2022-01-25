package com.tema2;
//funcion que se calcula el iva
public class CalculoIva {
    public static void main(String[] args) {
        double precio = 0;
        double totaIncIva = 0;
        precio= 200;
        System.out.println("El resultado es "+ calcularIva(precio));

    }
    static double calcularIva(double nprecio) {
        return nprecio * 1.21;
    }
}


