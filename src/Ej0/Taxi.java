package Ej0;

public class Taxi extends Vehiculo {
    private int numLicencia;

    public Taxi(String mat, Modelo mod, int  numLic) {
        super(mat, mod);
        this.numLicencia = numLic;
    }
}
