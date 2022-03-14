package Ej1;

enum TamañoPanini{Almería, Granada, Sevilla}

public class Panini extends Pizzeria {
    private TamañoPanini tamaño;
    public Panini(Tipo tip, Estado est, TamañoPanini tam) {
        super(tip, est);
        this.tamaño=tam;
    }
}
