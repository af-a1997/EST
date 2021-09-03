package br.edu.ifsul.erp_system.main_menu;

import br.edu.ifsul.erp_system.browsing_features.ID_Filter;

import java.util.Scanner;

public class Main_Menu {
    public static void main(String[] args){
        System.out.println("Welcome to ERP_System, your electronic product manager.");
        System.out.println("=======================================================\n\n");

        System.out.println("Please input a number matching your choice and hit [ENTER].");

        menu_entries(1);

        int opt = new Scanner(System.in).nextInt();

        while(opt<=0 || opt>=5){
            System.out.println(".----------------------------------. ");
            System.out.println("| Invalid option!                  | ");
            System.out.println("| Input a valid option from these: | ");
            System.out.println(":----------------------------.-----. ");
            menu_entries(0);

            opt = new Scanner(System.in).nextInt();
        }

        if(opt==1){
            // TODO: search by ID.

            ID_Filter idf = new ID_Filter();
        }
        else if(opt==2){
            // TODO: search by name.
        }
        else if(opt==3){
            // TODO: take product from stock by amount.
        }
    }

    // These menu options are printed in more than one instance, so it uses a dedicated function.
    public static void menu_entries(int introduction){
        /*
         * Meant to look like a graphical menu.
         * TODO: code the following options: 1, 2 and 3.
         * */
        if(introduction==1) System.out.println(".----------------------------.");
        // Introduction value is used in case a note is attached above the visual menu.

        System.out.println("| 1 = Product lookup by ID   |");
        System.out.println("| 2 = Product lookup by name |");
        System.out.println("| 3 = Get product in stock   |");
        System.out.println("| 4 = Exit                   |");
        System.out.println(".____________________________.");
    }
}
