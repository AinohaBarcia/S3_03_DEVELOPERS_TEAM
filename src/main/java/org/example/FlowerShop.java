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
    public void printStock (){
        productList.forEach(System.out::println);
    }


        int  treeCount = (int) productList.stream().filter (object -> object instanceof Tree).count();
            System.out.println("There are  " + treeCount + " trees");

        int  flowersCount = (int) productList.stream().filter (object -> object instanceof Flower).count();
            System.out.println("There are  " + flowersCount + "flowers");

        int  decorationCount = (int) productList.stream().filter (object -> object instanceof Decoration).count();
        System.out.println("There are  " + decorationCount + "decorations");

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
