package com.tema3;

public class ConcatenaArray {
    public static void main(String[] args) {
        String[] cadena = {"hola"," ","amigos"," ","del bootcamp"};
        String cadenaConcatenada;
        System.out.println(cadenaConcatenada=concatenadora(cadena));
    }

    private static String concatenadora(String[] cadena) {
        String temporal = "";
        int i = 0;

        for(i=0;i<cadena.length;i++){
                    temporal = temporal + cadena[i];
                }
                return temporal;
    }
}
