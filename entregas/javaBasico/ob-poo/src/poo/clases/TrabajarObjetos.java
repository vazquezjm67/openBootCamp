package poo.clases;

public class TrabajarObjetos {
    public static void main(String[] args) {
    Vehiculo toyotaPrius = new Vehiculo();
    Motor motorGti = new Motor("GTI", 190, 459.0, 6  );
    Vehiculo forMondeo = new Vehiculo("ford", "Mondeo", 2.1, 2010,false,0,  motorGti);
        System.out.println(forMondeo.fabricante);
        System.out.println(forMondeo.year);
        System.out.println(forMondeo.speed);
        forMondeo.acelerar(50);
        System.out.println(forMondeo.speed);
    }
}
