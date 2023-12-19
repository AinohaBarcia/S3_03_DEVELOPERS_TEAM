package org.example;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File Arch= new File("src/main/java/org/example/data.txt");
        if(!Arch.exists()){
            Methods.createDataTxt();
        }

        FlowerShop flowerShop = Exportable.importFlowerShop();
        Methods.updateCounters(flowerShop);
        flowerShop = Methods.createNewFlowerShop(flowerShop);
        FlowerShop flowerShop1 = Menu.choseMenu(flowerShop);
        Exportable.exportFlowerShop(flowerShop1);


    }
}

        /*In order to run the application for the first time its necessary to create an empty data.txt
        1- Delete data.txt
        2- Introduce this line: FlowerShop flowershop = null;
        3- You need to comment all the lines except Exportable.exportFlowerShop(flowerShop)

*/
