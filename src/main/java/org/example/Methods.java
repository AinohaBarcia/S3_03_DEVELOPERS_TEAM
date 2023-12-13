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
    public static void printProductCount(List<Product> productList){
        int  treeCount = (int) productList.stream().filter (object -> object instanceof Tree).count();
        System.out.println("There are  " + treeCount + " trees");

        int  flowersCount = (int) productList.stream().filter (object -> object instanceof Flower).count();
        System.out.println("There are  " + flowersCount + "flowers");

        int  decorationCount = (int) productList.stream().filter (object -> object instanceof Decoration).count();
        System.out.println("There are  " + decorationCount + "decorations");

    }
    public static void deleteProduct(List<Product> productList, String name){
        int position = searchProduct(productList,name);

        if (position>=0){
            productList.remove(position);
            System.out.println("The product " + name + " has been deleted");
        }else {
            System.out.println("The product " + name + " isn't in the list");
        }
    }
    public static void stockTotalValue(List<Product>productList){
        float valorTotal = (float) productList.stream()
                .mapToDouble(Product::getPrice)
                .sum();

        System.out.println("The total value of the stock is : " + valorTotal + " €");
    }
    public static int searchProduct (List<Product> productList, String name){

        boolean found = false;

        int position = -1;
        int index = 0;

        while (index <productList.size() && !found) {

            if (productList.get(index).getName().equals(name)) {
                position = index;
                found = true;
            }
            index++;
        }

        return position;
    }
}

