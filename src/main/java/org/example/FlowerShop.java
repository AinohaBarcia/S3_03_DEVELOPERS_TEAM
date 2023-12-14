package org.example;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class FlowerShop implements Externalizable {
    private String name;
    private List <Product> productList;
    private List <Ticket> ticketList;

    public FlowerShop(String name) {
        this.name = name;
        productList = new ArrayList<Product>();
        ticketList = new ArrayList<Ticket>();
    }

    public String getName() {
        return name;
    }
    public List <Product> getProductList() {
        return productList;
    }
    public List <Ticket> getTicketList() {
        return ticketList;
    }



    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeObject(productList);
        out.writeObject(ticketList);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        productList = (ArrayList<Product>) in.readObject();
        ticketList = (ArrayList<Ticket>) in.readObject();

    }

}
