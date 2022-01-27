package poo.clases;

public class Motor {
    String modeloMotor;
    int caballos;
    double parNm;
    int numCilindros;

    public Motor() {
    }

    public Motor(String modelo, int caballos, double parNm, int numCilindros) {
        this.modeloMotor = modelo;
        this.caballos = caballos;
        this.parNm = parNm;
        this.numCilindros = numCilindros;
    }
}
