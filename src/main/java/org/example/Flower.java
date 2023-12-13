package org.example;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Flower extends Product{
    private String id;
    private String colour;
    private static int contId;
    private static String type = "FLOWER";

    public Flower(String name, float price, String colour) {
        super(name, price);
        id = generateId();
        this.colour = colour;
        contId++;
    }

    public String id(){return id;}
    public String getColour(){return colour;}
    public String getType(){return type;}

    public void setColour(String height){this.colour = colour;}

    @Override
    public String generateId() {
        return "F" + contId;
    }

    @Override
    public String toString(){
        return id + " - " + type + " - " + name + " - " + colour + " - " + price + "€.";
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(id);
        out.writeUTF(name);
        out.writeUTF(colour);
        out.writeUTF(type);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readUTF();
        name = in.readUTF();
        colour = in.readUTF();
        type = in.readUTF();
    }
}
