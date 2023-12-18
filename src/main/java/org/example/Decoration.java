package org.example;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Decoration extends Product implements Externalizable {


    private String id;
<<<<<<< HEAD

    private static int contId;
    private static final String type = "WOOD";

    public Decoration(String name, float price) {
=======
    private String decorationMaterial;
    private static int contId;
    private static final String type = "DECORATION";

    public Decoration(String name, float price, String decorationMaterial) {
>>>>>>> 1f92d3ed70963309f4571310ab9dfac7e0e8a353
        super(name, price);
        id = generateId();
        contId++;
    }

    public Decoration() {
        super();
    }

    public String id(){return id;}
    public String getType(){return type;}


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
<<<<<<< HEAD
         // Escribir el enum directamente
=======
        out.writeUTF(decorationMaterial);
>>>>>>> 1f92d3ed70963309f4571310ab9dfac7e0e8a353
        out.writeFloat(price);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readUTF();
        name = in.readUTF();
<<<<<<< HEAD
        // Leer el enum directamente
=======
        decorationMaterial = in.readUTF();
>>>>>>> 1f92d3ed70963309f4571310ab9dfac7e0e8a353
        price = in.readFloat();
    }
}
