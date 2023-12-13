package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FlowerShop flowerShop = new FlowerShop("florist");


        try {
            Exportable.exportFlowerShop(flowerShop);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //TODO SINGLETON PARA CREAR UNA FLORISTERIA
    }
}
