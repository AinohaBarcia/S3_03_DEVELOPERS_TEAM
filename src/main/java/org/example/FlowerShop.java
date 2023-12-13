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
    public void printQuantity (){

        int  treeCount =  productList.stream().filter (object -> object instanceof Tree).count();
            System.out.println("There are  " + treeCount + " trees");

        int  flowersCount =  productList.stream().filter (object -> object instanceof Flower).count();
            System.out.println("There are  " + flowersCount + "flowers");

        int  decorationCount =  productList.stream().filter (object -> object instanceof Decoration).count();
        System.out.println("There are  " + decorationCount + "decorations");

    }
}
