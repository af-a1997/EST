package br.edu.ifsul.erp_system.main_menu;

import java.io.IOException;
import java.util.Scanner;

import br.edu.ifsul.erp_system.database.Add_Stock;
import br.edu.ifsul.erp_system.database.DB_Loader;

@SuppressWarnings({ "resource" })

public class Main_Menu {
    public static void main(String[] args){
        System.out.println("Welcome to ERP_System, your electronic product manager.");
        System.out.println("=======================================================\n\n");

        System.out.println("Please input a number matching your choice and hit [ENTER].");

        menu_entries(1);

        int opt = new Scanner(System.in).nextInt();

        while(opt<=0 || opt>=7){
            System.out.println(".----------------------------------. ");
            System.out.println("| Invalid option!                  | ");
            System.out.println("| Input a valid option from these: | ");
            System.out.println(":----------------------------------+ ");
            menu_entries(0);

            opt = new Scanner(System.in).nextInt();
        }

        menu_actions(opt);
    }

    public static void menu_actions(int choice) {
        if(choice==1){
            System.out.print("Write the ID associated to the product you're looking for: ");
            int id = new Scanner(System.in).nextInt();

            try {
                DB_Loader.findByID(id);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(choice==2){
            System.out.print("Write the name (or part of it) of the product you're looking for: ");
            String name = new Scanner(System.in).nextLine();

            try {
                DB_Loader.findByName(name);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(choice==3){
            
            int pid = 0;
            System.out.print("Enter the product's ID: ");
            pid = new Scanner(System.in).nextInt();

            DB_Loader.retrieveProduct(pid);
        }
        else if(choice==5){
            System.out.print("Write the ID associated to the product you're looking for: ");
            int id = new Scanner(System.in).nextInt();

            try {
                System.out.println("Attempting a binary search for the product...\n");
                DB_Loader.findProdByIdBin(id);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(choice==6){
            System.out.println("Halted system.");
            System.exit(0);
        }
    }

    // These menu options are printed in more than one instance, so it uses a dedicated function, contains a graphical menu of sorts made in the console.
    public static void menu_entries(int introduction){
        if(introduction==1) System.out.println(".----------------------------------------------------------.");
        // Introduction value is used in case a note is attached above the visual menu, this means this parameter merely adds a little cosmetic change as needed.

        System.out.println("| 1 = Product lookup by ID                                 |");
        System.out.println("| 2 = Product lookup by name                               |");
        System.out.println("| 3 = Get product in stock                                 |");
        System.out.println("| 4 = [Unused for now]                                     |");
        System.out.println("| 5 = Product lookup by ID (using binary search approach)  |");
        System.out.println("| 6 = Exit                                                 |");
        System.out.println(".__________________________________________________________.");

        // Each entry and horizontal lines in the menu is currently 30 characters long, counting boundaries and spaces.
    }

    // This function provides the user with confirmation as to whether or not they'd like to make another product search query.
    public static void confirmationDialogue(int source_option){
        String choice = "C";
        String source_option_descriptor = " ";
        String top_bar = ".";
        String bottom_bar = ":_________.";

        // To display the kind of query the user may want after looking up a product.
        if(source_option==1){
            source_option_descriptor = "ID";
        }
        else if(source_option==2){
            source_option_descriptor = "name";
        }
        else if(source_option==5){
            source_option_descriptor = "ID (binary search)";
        }

        // Build up the confirmation question after the query type has been identified.
        String confirmation_string = "| Would you like to perform another "+source_option_descriptor+" lookup query? |";
        String confirmation_instruction = "| Write one of two words below and hit [ENTER].";

        // To build part of the menu, purely comestic.
        for(int x=0;x<confirmation_string.length()-1;x++){
            if(x<confirmation_string.length()-2){
                top_bar += "-";
                if(x>9)
                    bottom_bar += "_";

                if(x>45)
                    confirmation_instruction += " ";
            }
            else{
                top_bar += ".";
                bottom_bar += ".";
                confirmation_instruction += "|";
            }
        }

        // As long as you pick a non-existing option, you'll be prompted to enter a valid option again.
        do{
            System.out.println(top_bar+"\n"+confirmation_string+"\n"+confirmation_instruction+"\n"+bottom_bar);
            System.out.println("| Y = Yes |");
            System.out.println("| N = No  |");
            System.out.println("._________.");
            choice = new Scanner(System.in).nextLine();

            if(choice.equalsIgnoreCase("Y"))
                menu_actions(source_option);
            else if(choice.equalsIgnoreCase("N"))
                main(null);
            else{
                System.out.println(".----------------------------.");
                System.out.println("| Invalid option, try again. |");
                System.out.println(".____________________________.\n");
            }
        } while (!choice.equalsIgnoreCase("Y") || !choice.equalsIgnoreCase("N"));
    }
}