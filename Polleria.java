package Interfaces;

public class Polleria implements Restaurante{

    private String comida = "Pollito";
    private int costo;
    private String mesero;
    private String cliente;

    public Polleria(int cost,String meser,String client){
        costo = cost;
        mesero = meser;
        cliente = client;
    }
    @Override
    public void servir() {
        System.out.println(mesero+" le entrega su comida a "+cliente+" en el mostrador");
    }

    @Override
    public void costo() {
        System.out.println("El costo de: "+comida+" es de $"+costo);
    }

    @Override
    public void menu() {
        System.out.println("El platillo principal que ofrecen en este restaurante es: "+comida);
    }
}
