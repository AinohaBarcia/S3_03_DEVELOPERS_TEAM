package org.example;

import java.io.*;

public class Exportable {

    public static FlowerShop importFlowerShop() {

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("data.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        FlowerShop flowerShop;
        try {
            flowerShop = (FlowerShop) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return flowerShop;
    }
    public static void exportFlowerShop(FlowerShop flowerShop) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream("data.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        try {
            objectOutputStream.writeObject(flowerShop);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        fileOutputStream.close();
    }
}
