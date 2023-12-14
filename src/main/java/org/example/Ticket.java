package org.example;

import java.util.ArrayList;

public class Ticket {

    private int id;
    private ArrayList<Product> productList;
    public static int count;

    public Ticket() {
        this.id = id + count;
        this.productList = productList;
        count ++;
        productList = new ArrayList<>();

    }

    public ArrayList<Product> getProductList() { //Todo confirmar nombre de clase
        return productList;
    }

    public int getId() {
        return id;
    }

    public float sumTotalTicketProduct(){

        float totalPrice = 0;
        for(Product product:productList){
            totalPrice+= product.getPrice();
        };
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", productList=" + productList +
                '}';
    }
}
