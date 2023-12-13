package org.example;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Tree extends Product{
    private final String id;
    private float height;
    private static int contId;
    private static final String type = "TREE";

    public Tree(String name, float price, float height) {
        super(name, price);
        id = generateId();
        this.height = height;
        contId++;
    }

    public String id(){return id;}
    public float getHeight(){return height;}
    public String getType(){return type;}

    public void setHeight(float height){this.height = height;}

    @Override
    public String generateId(){
        return "A" + contId;
    }

    @Override
    public String toString(){
        return id + " - " + type + " - " + name + " - " + height + "cm - " + price + "€.";
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
