package Ej1;

enum Tipo {Margarita, CuatroQuesos, Funghi}
enum Estado {Pedido, Servido}

public abstract class Pizzeria {
private Tipo tipo;
private Estado estado;

public Pizzeria(Tipo tip){
    this.tipo=tip;
    this.estado=Estado.Pedido;
}


public void servir(){
    System.out.println("El pedido ha sido servido");
}
}
