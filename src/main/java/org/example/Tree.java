package org.example;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Tree extends Product{
    private String id;
    private float height;
    private static int contId;


    public Tree(String name, float price, float height) {
        super(name, price);
        id = generateId();
        this.height = height;
        super.type = "TREE";
        contId++;
    }
    public Tree() { }

    public String id(){return id;}
    public float getHeight(){return height;}
    public String getType(){return type;}


    public int getContId() {
        return contId;
    }

    public void setHeight(float height){this.height = height;}

    public static void updateCounter(int counter){
        contId= counter;
    }

    @Override
    public String generateId(){
        return "A" + contId;
    }

    @Override
    public String toString(){
        return "Id: " + id + "\r\n"
                + "Type: " + type + "\r\n"
                + "Product name: " + name + "\r\n"
                + "Height: " + height + "cm" + "\r\n"
                + "Price: " + price + "€.";
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(id);
        out.writeUTF(name);
        out.writeFloat(height);
        out.writeUTF(type);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readUTF();
        name = in.readUTF();
        height = in.readFloat();
        type = in.readUTF();
    }
}
