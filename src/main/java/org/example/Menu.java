package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static byte showMenu() {
        Scanner entrada = new Scanner(System.in); //todo implement a new class for scanner entry
        byte option;
        final byte MIN = 0;
        final byte MAX = 14;

        do {
            System.out.println("\n    MAIN MENU");
            System.out.println("1.  - Add Flower Shop.");
            System.out.println("2.  - Add Tree.");
            System.out.println("3.  - Add Flower.");
            System.out.println("4.  - Add Decoration.");
            System.out.println("5.  - Stock: Print all Trees, flowers and Decoration in the flower shop.");
            System.out.println("6.  - Remove a Tree item");
            System.out.println("7.  - Remove a Flower item");
            System.out.println("8.  - Remove a Decoration item.");
            System.out.println("9. - Print stock with quantities.");
            System.out.println("10. - Print stock total value.");
            System.out.println("11. - Create a ticket with the total items.");
            System.out.println("12. - Show old purchases.");
            System.out.println("13. - Show total earnings");
            System.out.println("0.  - Exit app.\n");
            option = entrada.nextByte();
            if (option < MIN || option > MAX) {
                System.out.println("Choose a valid option");
            }
        } while (option < MIN || option > MAX);
        return option;
    }


    public static void choseMenu(ArrayList<Product>productList, ArrayList<Ticket> ticketList){
        boolean exit = false;

        do {
            switch (showMenu()) {
                case 1:
                    //todo addFlowerShop

                    break;
                case 2:
                    Methods.createTree(productList);
                    break;
                case 3:
                    Methods.createFlower(productList);
                    break;
                case 4:
                    Methods.createDecoration(productList);
                    break;
                case 5:
                    //todo hay que llamar a la tienda creada para llamar al metodo
                    break;
                case 6:
                    Methods.deleteProduct(productList, Input.getString
                            ("Write the name of the tree you want remove"));
                    break;
                case 7:
                    Methods.deleteProduct(productList, Input.getString
                            ("Write the name of the flower you want remove"));
                    break;
                case 8:
                    Methods.deleteProduct(productList, Input.getString
                            ("Write the name of the decoration you want remove"));
                    break;
                case 9:
                    Methods.printProductCount(productList);
                    break;
                case 10:
                    //Todo create printStockTotalValues method.
                    Methods.stockTotalValue(productList);

                    break;
                case 11:
                    //Todo create create ticket method.

                    break;
                case 12:
                    //Todo create showOldPurchases method.
                    break;
                case 13:
                    //Todo create showTotalEarnings method.
                    break;
                case 0:
                    System.out.println("Thank you for use the app.");
                    exit = true;
                    break;
            }
        } while (!exit);

    }


    }



