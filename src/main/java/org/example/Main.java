package org.example;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FlowerShop flowerShop = FlowerShop.getInstance("AJJ Flower Shop");

<<<<<<< HEAD
        flowerShop.getProductList().add(new Decoration("Green tree", 12.35f));
=======
        flowerShop.getProductList().add(new Decoration("Green tree", 12.35f, "Plastic"));
>>>>>>> 1f92d3ed70963309f4571310ab9dfac7e0e8a353










        /*try {
            Exportable.exportFlowerShop(flowerShop);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
<<<<<<< HEAD
*/

       /* OutputStream fileOutputStream2 = new FileOutputStream("exported.ser");
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream2);
        objectOutputStream2.writeObject(flowerShop);
        objectOutputStream2.close();
        fileOutputStream2.close();



        //Import
        FileInputStream fileInputStream2 = new FileInputStream("exported.ser");
        ObjectInputStream objectInputStream2 = new ObjectInputStream(fileInputStream2);
        FlowerShop flowerShop1 = (FlowerShop) objectInputStream2.readObject();
        System.out.println(flowerShop1);
        //TODO SINGLETON PARA CREAR UNA FLORISTERIA
=======
>>>>>>> 1f92d3ed70963309f4571310ab9dfac7e0e8a353
    }

}

