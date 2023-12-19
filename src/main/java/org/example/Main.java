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


