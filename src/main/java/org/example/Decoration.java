package org.example;

public class Decoration extends Product{
    enum DecorationMaterial {
        WOOD, PLASTIC
    }

    private DecorationMaterial decorationMaterial;
    private int contId;
    private static final String type = "DECORATION";

    public Decoration(String name, float price, DecorationMaterial decorationMaterial) {
        super(name, price);
        this.id = generateId();
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
}
