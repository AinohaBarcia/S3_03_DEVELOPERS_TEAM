package org.example;

public class Flower extends Product{
    private String colour;
    private int contId;
    private static final String type = "FLOWER";

    public Flower(String name, float price, String colour) {
        super(name, price);
        this.id = generateId();
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
}
