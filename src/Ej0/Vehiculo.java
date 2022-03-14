package Ej0;

enum Modelo{Coche1, Coche2, Coche3, CocheDeChoque}

public class Vehiculo {
    private String matricula;
    private Modelo modelo;

    public Vehiculo(String mat, Modelo mod){
        this.matricula= mat;
        this.modelo= mod;
    }
}
