package Interfaces;

public class Marisqueria implements Restaurante{

    private String comida = "Pescado";
    private int costo;
    private String mesero;
    private String cliente;

    public Marisqueria(int cost,String meser,String client){
        costo = cost;
        mesero = meser;
        cliente = client;
    }
    @Override
    public void servir() {
        System.out.println("El mesero "+mesero+" le sirve una "+comida+" a "+cliente+" acompaniado de saladitas yomi");
    }

    @Override
    public void costo() {
        System.out.println("El costo de: "+comida+" es de $"+costo);
    }

    @Override
    public void menu() {
        System.out.println("El platillo principal que ofrecen en este restaurante es: "+comida+" con saladitas yomi");
    }
}
