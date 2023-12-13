package org.example;

import java.util.ArrayList;

public class Ticket {

    private int id;
    private ArrayList<Product> productList = new ArrayList<>(); //Todo confirmar nombre de clase

    public static int count;

    public Ticket(ArrayList<Product> productList) { //Todo confirmar nombre de clase
        this.id = id + count;
        this.productList = productList;
        count ++;
    }

    public ArrayList<Product> getProductList() { //Todo confirmar nombre de clase
        return productList;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", productList=" + productList +
                '}';
    }
}
