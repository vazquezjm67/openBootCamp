package com.tema5;

public class MainTema5 {
    static  CocheCRUD cocheCRUD = new CocheCRUDImpl();
    public static void main(String[] args) {
       cocheCRUD.findALL();
        cocheCRUD.save(new Coche());




    }
}
