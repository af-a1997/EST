package br.edu.ifsul.erp_system.main_menu;

import br.edu.ifsul.erp_system.browsing_features.ID_Filter;

import java.util.Scanner;

public class Main_Menu {
    public static void main(){
        System.out.println("Bienvenid@ al sistema de gestión de productos electrónicos, ERP_System.");
        System.out.println("=======================================================================\n\n");

        System.out.println("Ingrese una opción:\n");

        /*
        * Meant to look like a graphical menu.
        * TODO: option 3.
        * */
        System.out.println(".--------------------------------.");
        System.out.println(". 1 = Buscar producto por ID     |");
        System.out.println(". 2 = Buscar producto por nombre |");
        // System.out.println(". 3 = Adquirir producto en stock |");
        System.out.println(". 4 = Salir                      |");
        System.out.println(".________________________________.");

        int opt = new Scanner(System.in).nextInt();

        while(opt<=0 || opt>=5){
            System.out.print("Ingrese una opción correcta: ");
            opt = new Scanner(System.in).nextInt();
        }

        if(opt==1){
            // TODO: search by ID.

            ID_Filter idf = new ID_Filter();
            idf.main();
        }
        else if(opt==2){
            // TODO: search by name.
        }
        else if(opt==3){
            // TODO: take product from stock by amount.
        }
    }
}
