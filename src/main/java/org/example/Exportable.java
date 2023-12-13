package org.example;

import java.io.*;

public class Exportable {

    public static FlowerShop importFlowerShop() {

        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream2 = new FileInputStream("data.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ObjectInputStream objectInputStream2 = null;
        try {
            objectInputStream2 = new ObjectInputStream(fileInputStream2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        FlowerShop flowerShop;
        try {
            flowerShop = (FlowerShop) objectInputStream2.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return flowerShop;
    }
    public static void exportFlowerShop(FlowerShop flowerShop) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream("data.txt");
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream);
        try {
            objectOutputStream2.writeObject(flowerShop);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            objectOutputStream2.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        fileOutputStream.close();
    }
}
