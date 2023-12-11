package org.example;

public abstract class Product {
    protected String id;
    protected String name;
    protected float price;

    public Product (String name, float price){
        this.name = name;
        this.price = price;
    }

    public String getId(){return id;}
    public String getName(){return name;}
    public float getPrice(){return price;}

    public void setName(String name){this.name = name;}
    public void setPrice(float price){this.price = price;}

    public abstract String generateId();

    @Override
    public String toString(){
        return id + " - " + name + " - " + price + "€.";
    }

}
