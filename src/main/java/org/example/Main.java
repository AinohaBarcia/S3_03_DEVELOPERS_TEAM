package org.example;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FlowerShop flowerShop = new FlowerShop("AJJ Flower Shop");

        flowerShop.getProductList().add(new Decoration("Green tree", 12.35f, Decoration.DecorationMaterial.PLASTIC));


        try {
            Exportable.exportFlowerShop(flowerShop);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //TODO SINGLETON PARA CREAR UNA FLORISTERIA
    }

}

