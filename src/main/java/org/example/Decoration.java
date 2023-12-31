package org.example;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Decoration extends Product implements Externalizable {

    private String id;
    private String decorationMaterial;
    private static int contId;
    private static final String type = "DECORATION";

    public Decoration(String name, float price, String decorationMaterial) {
        super(name, price);
        id = generateId();
        super.type = "DECORATION";
        contId++;
        this.decorationMaterial = decorationMaterial;
    }


    public Decoration() { }

    public String id(){return id;}
    public String getType(){return type;}

    public static void updateCounter(int counter){
        contId= counter;
    }

    public int getContId() {
        return contId;
    }

    @Override
    public String generateId() {
        return "D" + contId;
    }

    @Override
    public String toString(){
        return "Id: " + id + "\r\n"
                + "Type: " + type + "\r\n"
                + "Product name: " + name + "\r\n"
                + "Decoration material: " +   "\r\n"
                + "Price: " + price + "€.";
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(id);
        out.writeUTF(name);

         // Escribir el enum directamente

        out.writeUTF(decorationMaterial);
        out.writeFloat(price);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readUTF();
        name = in.readUTF();

        decorationMaterial = in.readUTF();

        price = in.readFloat();
    }
}
