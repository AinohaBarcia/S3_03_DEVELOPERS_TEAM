package org.example;

public class Decoration extends Product{
    enum DecorationMaterial {
        WOOD, PLASTIC
    }

    private final DecorationMaterial decorationMaterial;
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
        return "Id: " + id + "\r\n"
                + "Type: " + type + "\r\n"
                + "Product name: " + name + "\r\n"
                + "Decoration material: " + decorationMaterial + "\r\n"
                + "Price: " + price + "€.";
    }
}
