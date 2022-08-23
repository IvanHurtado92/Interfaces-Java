package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class InterfazPlazaComida {
    public static void main(String[] args) {
        List<Restaurante> lista = new ArrayList<>();
        Pizzeria alfredos = new Pizzeria(250,"Fangio","Raul");
        Polleria fregona = new Polleria(150,"Brandon","Alonso");
        Marisqueria bobEsponja = new Marisqueria(120,"Rodrigo","Gerardo");

        lista.add(alfredos);
        lista.add(fregona);
        lista.add(bobEsponja);

        System.out.println("\n    .:PLAZA COMER:.");
        for(Restaurante i:lista){
            i.menu();
            i.costo();
            i.servir();
            System.out.println();
        }
    }
}
