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

    public Ticket() {
    private ArrayList<Product> productList = new ArrayList<>();

    public static int count;

    public Ticket(ArrayList<Product> productList) {

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
