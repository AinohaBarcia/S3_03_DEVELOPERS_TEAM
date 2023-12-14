package org.example;

import java.util.ArrayList;


public class Menu {

    public static byte showMenu() {

        byte option;
        final byte MIN = 0;
        final byte MAX = 14;

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
            option = Input.getByte("Choose the section you want to access:");
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
                    System.out.println("Menu 1 - Add Flower Shop.");
                    Methods.createNewFlowerShop();
                    break;
                case 2:
                    System.out.println("Menu 2 - Add Tree.");
                    Methods.createTree(productList);
                    break;
                case 3:
                    System.out.println("Menu 3 - Add Flower.");
                    Methods.createFlower(productList);
                    break;
                case 4:
                    System.out.println("Menu 4 - Add Decoration.");
                    Methods.createDecoration(productList);
                    break;
                case 5:
                    System.out.println("Menu 5 - Stock: Print all Trees, Flowers and Decoration.");
                    //Todo create stock print method.
                    break;
                case 6:
                    System.out.println("Menu 6 - Remove a Tree item.");
                    Methods.deleteProduct(productList, Input.getString
                            ("Write the name of the tree you want remove"));
                    break;
                case 7:
                    System.out.println("Menu 7 - Remove a Flower item.");
                    Methods.deleteProduct(productList, Input.getString
                            ("Write the name of the flower you want remove"));
                    break;
                case 8:
                    System.out.println("Menu 8 - Remove a Decoration item.");
                    Methods.deleteProduct(productList, Input.getString
                            ("Write the name of the decoration you want remove"));
                    break;
                case 9:
                    System.out.println("Menu 9 - Print stock with quantities.");
                    Methods.printProductCount(productList);
                    break;
                case 10:
                    System.out.println("Menu 10 - Print stock total value.");
                    Methods.stockTotalValue(productList);
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



