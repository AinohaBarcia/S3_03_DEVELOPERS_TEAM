package org.example;

import java.util.Scanner;

public class Menu {

    public static int showMenu() {

        int option;
        final int MIN = 0;
        final int MAX = 14;

        do {
            System.out.println("Application menu: \r\n"
                    + "1. Add Flower Shop. \r\n"
                    + "2. Add Tree. \r\n"
                    + "3. Add Flower.\r\n"
                    + "4. Add Decoration. \r\n"
                    + "5. Stock: Print all Trees, flowers and Decoration. \r\n"
                    + "6. Remove a Tree item \r\n"
                    + "7. Remove a Flower item. \r\n"
                    + "8. Remove a Decoration item. \r\n"
                    + "9. Print stock with quantities. \r\n"
                    + "10. Print stock total value. \r\n"
                    + "11. Create a ticket with the total items. \r\n"
                    + "12. Show old purchases. \r\n"
                    + "13. View the total money earned from all sales. \r\n"
                    + "0. Exit app.");
            option = Input.getInt("Choose the section you want to access:");
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
                    System.out.println("Menu 1 - Add Flower Shop.");
                    //Todo create addFlowerShop method.
                    break;
                case 2:
                    System.out.println("Menu 2 - Add Tree.");
                    //Todo create addTree Method.
                    break;
                case 3:
                    System.out.println("Menu 3 - Add Flower.");
                    //Todo create addFlower Method.
                    break;
                case 4:
                    System.out.println("Menu 4 - Add Decoration.");
                    //Todo create addDecoration method.
                    break;
                case 5:
                    System.out.println("Menu 5 - Stock: Print all Trees, Flowers and Decoration.");
                    //Todo create stock print method.
                    break;
                case 6:
                    System.out.println("Menu 6 - Remove a Tree item.");
                    //Todo create removeTree method.
                    break;
                case 7:
                    System.out.println("Menu 7 - Remove a Flower item.");
                    //Todo create removeFlower method.
                    break;
                case 8:
                    System.out.println("Menu 8 - Remove a Decoration item.");
                    //Todo create removeDecoration method.
                    break;
                case 9:
                    System.out.println("Menu 9 - Print stock with quantities.");
                    //Todo create printStockwithQuantities method.
                    break;
                case 10:
                    System.out.println("Menu 10 - Print stock total value.");
                    //Todo create printStockTotalValues method.
                    break;
                case 11:
                    System.out.println("Menu 11 - Create a ticket with the total items.");
                    //Todo create create ticket method.
                    break;
                case 12:
                    System.out.println("Menu 12 - Show old purchases.");
                    //Todo create showOldPurchases method.
                    break;
                case 13:
                    System.out.println("Menu 13 - View the total money earned from all sales.");
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



