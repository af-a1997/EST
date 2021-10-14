package br.edu.ifsul.erp_system.database;

import java.util.Scanner;

import br.edu.ifsul.erp_system.main_menu.Main_Menu;

@SuppressWarnings({"resource"})

public class Stock_Mgr {
    public static void take_product(int n_id_prod, int qty) {
        //int n_id_prod = id-1;

        if(DB_Loader.df_list.get(n_id_prod).getStock_list_cont().size()>=qty){
            System.out.println("Taking from stock...\n");
            System.out.println("Product information below:\n" +
                "ID: " + DB_Loader.df_list.get(n_id_prod).getProduct_id() +
                "\nName: " + DB_Loader.df_list.get(n_id_prod).getName()
            );

            for(int i=0;i<qty;i++){
                System.out.println( DB_Loader.df_list.get(n_id_prod).getStock_list_cont().get(0));

                DB_Loader.df_list.get(n_id_prod).getStock_list_cont().remove(0);

                System.out.println("Stock entry #" + (i+1) + "deleted.");
            }
        }
        else if(DB_Loader.df_list.get(n_id_prod).getStock_list_cont().size()<qty && DB_Loader.df_list.get(n_id_prod).getStock_list_cont().size()>0){
            int control=0;

            while(control!=1){
                System.out.println("Stock: " + DB_Loader.df_list.get(n_id_prod).getStock_list_cont().size()+"\nDo you want to take out " + DB_Loader.df_list.get(n_id_prod).getStock_list_cont().size() + " stock entries? (1=YES/2=NO)");
                    
                int choice_no = new Scanner(System.in).nextInt();

                if(choice_no==1){
                    System.out.println("\nTaking from stock...");
                    System.out.println("\nProduct information below:" +
                        "\nID: "
                            + DB_Loader.df_list.get(n_id_prod).getProduct_id() +
                        "\nName: "
                            + DB_Loader.df_list.get(n_id_prod).getName()
                    );

                    int stock_count_n=DB_Loader.df_list.get(n_id_prod).getStock_list_cont().size();

                    for(int i=0;i<stock_count_n;i++){
                        System.out.println(DB_Loader.df_list.get(n_id_prod).getStock_list_cont().get(0));
                        DB_Loader.df_list.get(n_id_prod).getStock_list_cont().remove(0);
                        System.out.println("Successfully deleted.");
                    }

                    control = 1;
                }
                else if(choice_no==2){
                    System.out.println("Returning to main menu, no stock entries were taken out.");

                    control = 1;
                }
                else if(choice_no!=1 && choice_no!=2){
                    System.out.println("\nInvalid choice, please try again.\n");
                }
            }

        }

        else if(DB_Loader.df_list.get(n_id_prod).getStock_list_cont().size()==0){
            System.out.println("No stock found for this product.");
        }
        else System.out.println("You can't remove this much from the stock count.");

        Main_Menu.confirmationDialogue(3);
    }
}