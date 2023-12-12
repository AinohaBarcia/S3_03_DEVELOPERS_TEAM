package org.example;

public class Tree extends Product{ 
    private float height;
    private int contId;
    private static final String type = "TREE";

    public Tree(String name, float price, float height) {
        super(name, price);
        this.id = generateId();
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
}
