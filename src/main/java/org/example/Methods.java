package org.example;

import java.util.List;
import java.util.Locale;

public class Methods {

    public static void createTree(List<Product> productsList){
        productsList.add(new Tree(Input.getString("Tree name:"), Input.getFloat("Price:"), Input.getFloat("Height:")));
    }
    public static void createFlower(List<Product>productsList){
        productsList.add(new Flower(Input.getString("Flower name:"), Input.getFloat("Price:"), Input.getString("Colour:")));
    }
    public static void createDecoration(List<Product>productsList){
        char letterMaterial = Input.getString("Decoration material: Wood or Plastic?").toUpperCase().charAt(0);
        if (letterMaterial == 'P'){
            Decoration.DecorationMaterial plastic = Decoration.DecorationMaterial.PLASTIC;
            productsList.add(new Decoration(Input.getString("Decoration name:"), Input.getFloat("Price:"), plastic));
        }else if (letterMaterial == 'W'){
            Decoration.DecorationMaterial wood = Decoration.DecorationMaterial.WOOD;
            productsList.add(new Decoration(Input.getString("Decoration name:"), Input.getFloat("Price:"), wood));
        }else{
            System.out.println("Wrong material.");
        }
    }
}
