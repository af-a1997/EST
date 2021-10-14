package br.edu.ifsul.erp_system.database;

import java.util.Scanner;

import br.edu.ifsul.erp_system.main_menu.Main_Menu;

@SuppressWarnings({"resource"})

public class BinTree {
    public static void BST_Menu(int o){
        BinTreeAct bta = new BinTreeAct();
        int prod_idno;

        // Search
        if(o==2){
            System.out.print("Enter the product's ID: ");
            prod_idno = new Scanner(System.in).nextInt();
            
            if (bta.findNode(prod_idno) != null) {
                System.out.println("Product has been found, here is its information:");
                System.out.println("Id: " + DB_Loader.df_list.get(prod_idno - 1).getProduct_id()
                        + "\nNome: " + DB_Loader.df_list.get(prod_idno - 1).getName()
                        + "\nPrice (max): " + DB_Loader.df_list.get(prod_idno - 1).getPrices_aMax()
                        + DB_Loader.df_list.get(prod_idno).getPrices_currency()
                        + "\nPrice (min): " + DB_Loader.df_list.get(prod_idno - 1).getPrices_aMax()
                        + DB_Loader.df_list.get(prod_idno).getPrices_currency()
                        + "\nStock: " + DB_Loader.df_list.get(prod_idno - 1).getStock_list_cont()
                        + "\n");
            } else
                System.out.println("This product couldn't be found, please try again.");
        }

        Main_Menu.confirmationDialogue(4);
    }
    public static void BST_Menu(int o,int x){
        BinTreeAct bta = new BinTreeAct();
        int prod_idno;

        // Insert
        if(o==1){
            //for (int x=0;x<DB_Loader.df_list.size();x++) {
                bta.insertNode(Integer.parseInt(DB_Loader.df_list.get(x).getProduct_id()));
            //}
        }
    }
}
