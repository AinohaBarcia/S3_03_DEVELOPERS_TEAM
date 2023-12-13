package org.example;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Decoration extends Product implements Externalizable {


    enum DecorationMaterial {
        WOOD, PLASTIC
    }

    private String id;
    private DecorationMaterial decorationMaterial;
    private static int contId;
    private static final String type = "DECORATION";

    public Decoration(String name, float price, DecorationMaterial decorationMaterial) {
        super(name, price);
        id = generateId();
        this.decorationMaterial = decorationMaterial;
        contId++;
    }

    public String id(){return id;}
    public String getType(){return type;}


    @Override
    public String generateId() {
        return "D" + contId;
    }

    @Override
    public String toString(){
        return id + " - " + type + " - " + name + " - " + decorationMaterial + " - " + price + "€.";
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(id);
        out.writeUTF(name);
        out.writeObject(decorationMaterial);  // Escribir el enum directamente
        out.writeFloat(price);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readUTF();
        name = in.readUTF();
        decorationMaterial = (DecorationMaterial) in.readObject();  // Leer el enum directamente
        price = in.readFloat();
    }
}
