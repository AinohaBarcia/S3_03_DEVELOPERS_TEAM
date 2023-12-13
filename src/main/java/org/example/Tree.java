package org.example;

public class Tree extends Product{ 
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
        return "Id: " + id + "\r\n"
                + "Type: " + type + "\r\n"
                + "Product name: " + name + "\r\n"
                + "Height: " + height + "cm" + "\r\n"
                + "Price: " + price + "€.";
    }
}