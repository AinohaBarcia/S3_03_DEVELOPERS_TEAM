package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class FlowerShop {
    private String name;
    private List <Product> productList;
    private List <Ticket> ticketList;

    public FlowerShop(String name) {
        this.name = name;
        productList = new ArrayList<Product>();
        ticketList = new ArrayList<Ticket>();
    }
    public void printStock (){
        productList.forEach(System.out::println);
    }

}
