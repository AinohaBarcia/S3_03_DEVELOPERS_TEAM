package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Methods {

    public static FlowerShop createNewFlowerShop (FlowerShop flowerShop){
        if (flowerShop == null) {
            return FlowerShop.getInstance(Input.getString("What's de Flower shop name?"));
        }
        return flowerShop;
    }
    public static void createTree(List<Product> productList){
        productList.add(new Tree(Input.getString("Tree name:"), Input.getFloat("Price:"), Input.getFloat("Height:")));
    }
    public static void createFlower(List<Product>productList){
        productList.add(new Flower(Input.getString("Flower name:"), Input.getFloat("Price:"), Input.getString("Colour:")));
    }

    public static void createDataTxt() {
        FlowerShop flowershop = null;
        try {
            Exportable.exportFlowerShop(flowershop);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteDataTxt(){
        File Arch= new File("src/main/java/org/example/data.txt");
        try {
            Files.delete(Arch.toPath());
        } catch (NoSuchFileException x) {
            System.err.format("%s: no such" + " file or directory%n", Arch.toPath());
        } catch (DirectoryNotEmptyException x) {
            System.err.format("%s not empty%n", Arch.toPath());
        } catch (IOException x) {
            // File permission problems are caught here.
            System.err.println(x);
        }
    }

    public static FlowerShop restartDataTxt(){
        deleteDataTxt();
        createDataTxt();
        FlowerShop flowerShop1 = null;
        return createNewFlowerShop(flowerShop1);

    }

    public static void createDecoration(List<Product>productList){
        char letterMaterial = Input.getString("Decoration material: Wood or Plastic?").toUpperCase().charAt(0);
        if (letterMaterial == 'P'){
            String plastic = "Plastic";
            productList.add(new Decoration(Input.getString("Decoration name:"), Input.getFloat("Price:"), plastic));
        }else if (letterMaterial == 'W'){
            String wood = "Wood";
            productList.add(new Decoration(Input.getString("Decoration name:"), Input.getFloat("Price:"), wood));
        }else{
            System.out.println("Wrong material.");
        }
    }
    public static void printStock(List<Product> productList){
        System.out.println("TREES:");
        productList.stream().filter (object -> object instanceof Tree).forEach(System.out::println);
        System.out.println("FLOWERS:");
        productList.stream().filter (object -> object instanceof Flower).forEach(System.out::println);
        System.out.println("DECORATION:");
        productList.stream().filter (object -> object instanceof Decoration).forEach(System.out::println);
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

    public static void printProductCount(List<Product> productList){
        int  treeCount = (int) productList.stream().filter (object -> object instanceof Tree).count();
        System.out.println("There are  " + treeCount + " trees.");

        int  flowersCount = (int) productList.stream().filter (object -> object instanceof Flower).count();
        System.out.println("There are  " + flowersCount + " flowers.");

        int  decorationCount = (int) productList.stream().filter (object -> object instanceof Decoration).count();
        System.out.println("There are  " + decorationCount + " decorations.");

    }
    public static void stockTotalValue(List<Product>productList){
        float valorTotal = (float) productList.stream()
                .mapToDouble(Product::getPrice)
                .sum();

        System.out.println("The total value of the stock is : " + valorTotal + " €");
    }
    public static void createTicketMethod (FlowerShop flowerShop){
        Ticket ticket = new Ticket();
        Menu.chooseMenuTicket(flowerShop, ticket);
        float totalPrice = ticket.sumTotalTicketProduct();
        System.out.println("Total price: " + totalPrice);
    }
    public static void updateCounters(FlowerShop flowerShop){
        if((flowerShop != null) && (!flowerShop.getProductList().isEmpty())){
            if(!flowerShop.getProductList().stream().filter(o ->o instanceof Tree).toList().isEmpty()){
                Tree tree= (Tree) flowerShop.getProductList().stream().filter(o ->o instanceof Tree).toList().get(0);
                Tree.updateCounter(tree.getContId());
            }else if(!flowerShop.getProductList().stream().filter(o ->o instanceof Flower).toList().isEmpty()){
                Flower flower = (Flower) flowerShop.getProductList().stream().filter(o ->o instanceof Flower).toList().get(0);
                Flower.updateCounter(flower.getContId());
            }else if(!flowerShop.getProductList().stream().filter(o ->o instanceof Decoration).toList().isEmpty()) {
                Decoration decoration = (Decoration) flowerShop.getProductList().stream().filter(o -> o instanceof Decoration).toList().get(0);
                Decoration.updateCounter(decoration.getContId());
            }
        }
    }

    public static void addProductTicket(FlowerShop flowerShop, Ticket ticket){
        String name = Input.getString("Name product:");
        int position = searchProduct(flowerShop.getProductList(), name);
        if (position >= 0){
            ticket.getProductList().add(flowerShop.getProductList().get(position));
            flowerShop.getProductList().remove(position);
        } else{
            System.out.println("The product " + name + " doesn't exist.");
        }
    }
    public static void showOldPurchases (FlowerShop flowerShop){
        if(flowerShop.getTicketList().isEmpty()){
            System.out.println("The flower shop doesn't have tickets.");
        } else {
            flowerShop.getTicketList().forEach(System.out::println);
        }
    }

    public static void showTotalEarnings(FlowerShop flowerShop) {
       float sumaPrices = 0;
        for (int cont = 0; cont <= flowerShop.getTicketList().size(); cont++)
            sumaPrices += flowerShop.getTicketList().get(cont).getTotalPrice();
        System.out.println("The total amount of the all tickets is: " + sumaPrices + " €");
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

