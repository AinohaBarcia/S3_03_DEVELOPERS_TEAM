package org.example;

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


    public static void choseMenu(/*FlowerShop.Array*/){ //Todo Implement the arrayList of the FlowerShop class.
        boolean exit = false;

        do {
            switch (showMenu()) {
                case 1:
                    //Todo create addFlowerShop method.
                    break;
                case 2:
                    //Todo create addTree Method.
                    break;
                case 3:
                    //Todo create addFlower Method.
                    break;
                case 4:
                    //Todo create addDecoration method.
                    break;
                case 5:
                    //Todo create stock print method.
                    break;
                case 6:
                    //Todo create removeTree method.
                    break;
                case 7:
                    //Todo create removeFlower method.
                    break;
                case 8:
                    //Todo create removeDecoration method.
                    break;
                case 9:
                    //Todo create printStockwithQuantities method.
                    break;
                case 10:
                    //Todo create printStockTotalValues method.
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



