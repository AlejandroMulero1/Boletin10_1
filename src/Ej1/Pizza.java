package Ej1;

enum TamañoPizza{Mediana, Familiar}

public class Pizza extends Pizzeria{
    private TamañoPizza tamaño;
    public Pizza(Tipo tip, Estado est, TamañoPizza tam) {
        super(tip, est);
        this.tamaño=tam;
    }
}
