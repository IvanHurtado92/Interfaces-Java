package Interfaces;

public class Pizzeria implements Restaurante {
    private String comida = "Pizza";
    private int costo;
    private String mesero;
    private String cliente;

    public Pizzeria(int costoent,String meseroent,String clienteent){
        costo = costoent;
        mesero = meseroent;
        cliente = clienteent;
    }

    @Override
    public void servir() {
        System.out.println("El mesero "+mesero+" le sirve una "+comida+" a "+cliente);
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
