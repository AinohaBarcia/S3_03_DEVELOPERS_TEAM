package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class FlowerShop {
    private String name;
    private ArrayList <Product> productList;
    private ArrayList <TiccketList> ticketList;

    public FlowerShop(String name) {
        this.name = name;
        productList = new ArrayList<Product>();
        ticketList = new ArrayList<TiccketList>();
    }
    public void printStock (){
        productList.forEach(System.out::println);
    }
    public void printQuantity (){
        //creo un hashMap para poder contar la cantidad de producto de cada clase
        Map<String, Long> countByTpe = new HashMap<>();
        productList.forEach(object -> countByTpe.merge(object.getClass().getName(), 1L, Long::sum));

        // ahora podemos printar el resultado
        countByTpe.forEach((tipo, cantidad) ->
                System.out.println("Tipo: " + tipo + ", Cantidad: " + cantidad));
    }
}
