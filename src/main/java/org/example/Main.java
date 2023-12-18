package org.example;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FlowerShop flowerShop = Exportable.importFlowerShop();
        flowerShop = Methods.createNewFlowerShop(flowerShop);
        Menu.choseMenu(flowerShop);
        Exportable.exportFlowerShop(flowerShop);

    }
}

        /*In order to run the application for the first time its necessary to create an empty data.txt
        1- Delete data.txt
        2- Introduce this line: FlowerShop flowershop = null;
        3- You need to comment all the lines except Exportable.exportFlowerShop(flowerShop)

*/
