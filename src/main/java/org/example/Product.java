package org.example;

import java.io.Externalizable;

public abstract class Product implements Externalizable {
    protected String name;
    protected float price;

    public Product (String name, float price){
        this.name = name;
        this.price = price;

    }
    public Product() { }

    public String getName(){return name;}
    public float getPrice(){return price;}

    public void setName(String name){this.name = name;}
    public void setPrice(float price){this.price = price;}

    public abstract String generateId();

}
