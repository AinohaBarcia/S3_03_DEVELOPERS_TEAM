package org.example;

import java.util.ArrayList;

public class Ticket {

    private int id;
    private ArrayList<Product> productList;

    public Ticket(int id) {
        this.id = id;
        productList = new ArrayList<Product>();
    }

    public void sumTotalTicketProduct (){
        float sumPicess = productList.stream()
                .mapToLong(Product::getPrice).sum();

        System.out.println("La suma de los precios es: " + sumPicess);
    }
}
