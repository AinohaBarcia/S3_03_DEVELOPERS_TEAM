package org.example;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

public class Ticket implements Externalizable {

    private int id;
    private ArrayList<Product> productList;
    public static int count;
    private int totalPrice;


    public Ticket() {
        this.id = id + count;
        count++;
        productList = new ArrayList<>();
        totalPrice=0;
    }

    public ArrayList<Product> getProductList() { //Todo confirmar nombre de clase
        return productList;
    }

    public int getId() {
        return id;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public float sumTotalTicketProduct() {

        for (Product product : productList) {
            totalPrice += product.getPrice();
        }
        ;
        return totalPrice;
    }


    @Override
    public String toString() {
        return "Ticket" +
                "id =" + id +
                ", productList =" + productList +
                ", total price = " + totalPrice +
                "€";
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeObject(productList);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readInt();
        productList = (ArrayList<Product>) in.readObject();
    }
}
