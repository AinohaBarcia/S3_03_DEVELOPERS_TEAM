package org.example;

public class Flower extends Product{
    private String colour;
    private static int contId;
    private static final String type = "FLOWER";

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
        return "Id: " + id + "\r\n"
                + "Type: " + type + "\r\n"
                + "Product name: " + name + "\r\n"
                + "Colour: " + colour + "\r\n"
                + "Price: "+ price + "€.";
    }
}
