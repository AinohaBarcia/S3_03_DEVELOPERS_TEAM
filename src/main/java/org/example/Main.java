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

        /*try {
            Exportable.exportFlowerShop(flowerShop);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


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


    }

}
*/
