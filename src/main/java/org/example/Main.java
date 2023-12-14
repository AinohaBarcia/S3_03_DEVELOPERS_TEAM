package org.example;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FlowerShop flowerShop = FlowerShop.getInstance("AJJ Flower Shop");

        flowerShop.getProductList().add(new Decoration("Green tree", 12.35f, "Plastic"));


        try {
            Exportable.exportFlowerShop(flowerShop);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

