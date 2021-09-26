package br.edu.ifsul.erp_system.database;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Imports OpenCSV to handle the comma-separated value database linked below, only needed in this class. Exception handler must also be imported.
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import br.edu.ifsul.erp_system.main_menu.Main_Menu;

public class DB_Loader {
    /* This class loads the product database in a comma-separated values file and hosts browsing/stock management functions.
     *
     * Get a copy of the database here: https://www.kaggle.com/datafiniti/electronic-products-prices
    */

    public static List<Data_Fields> df_list = new ArrayList<Data_Fields>();

    // Loads the database and keeps it stored as a list in the RAM.
    public static void main(String[] args) throws IOException {
        // Make sure to update the location of your database copy in the following string!!
        String fileName = "C:\\Users\\af1899\\Documents\\GitHub\\EST\\ERP_System\\_database\\Products.csv";
        System.out.println("Loading database...");

        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            List<String[]> r = reader.readAll();

            for(String[] product_listing : r){
                Data_Fields df = new Data_Fields();
    
                df.setProduct_id(product_listing[0]);
                df.setPrices_aMax(product_listing[1]);
                df.setPrices_aMin(product_listing[2]);
                df.setAvail(product_listing[3]);
                df.setCond(product_listing[4]);
                df.setPrices_currency(product_listing[5]);
                df.setSeen_timestamp(product_listing[6]);
                df.setPrices_sale(product_listing[7]);
                df.setPrices_merchant(product_listing[8]);
                df.setPrices_shipping(product_listing[9]);
                df.setPrices_SrcURLs(product_listing[10]);
                df.setAsins(product_listing[11]);
                df.setBrand(product_listing[12]);
                df.setCategories(product_listing[13]);
                df.setAdded(product_listing[14]);
                df.setUpdated(product_listing[15]);
                df.setEAN(product_listing[16]);
                df.setImage_LocURLs(product_listing[17]);
                df.setKeys(product_listing[18]);
                df.setManufacturer_name(product_listing[19]);
                df.setManufacturer_no(product_listing[20]);
                df.setName(product_listing[21]);
                df.setPrimary_categories(product_listing[22]);
                df.setSrcURLs(product_listing[23]);
                df.setUPC(product_listing[24]);
                df.setWeight(product_listing[25]);

                df_list.add(df);
            }
            System.out.println("Success!");
        } catch (CsvException e) {
            e.printStackTrace();
        }

        // If the database is loaded, loads the menu.

        Main_Menu.main(args);
    }

    public static void findByID(int pr_id) throws IOException {
        boolean found = false;
        String pr_id_string = Integer.toString(pr_id);

        System.out.println("\n====================\n");

        for(int x=0;x<df_list.size();x++){
            if(df_list.get(x).getProduct_id().equals(pr_id_string)){
                System.out.println("Product with ID " + df_list.get(x).getProduct_id() + " has been found, here is some of its information:\n");
                System.out.println("Name: " + df_list.get(x).getName());
                System.out.println("Maximum cost: " + df_list.get(x).getPrices_aMax() + " " + df_list.get(x).getPrices_currency());
                System.out.println("Minimum cost: " + df_list.get(x).getPrices_aMin() + " " + df_list.get(x).getPrices_currency());
                System.out.print("\n"); // Separates confirmation dialogue a little from query output.

                found = true;
            }
        }

        if(found==false) System.out.println("There isn't a product matching the ID " + pr_id + ", the maximum available ID is: " + df_list.size());

        Main_Menu.confirmationDialogue(1);
    }

    public static void findByName(String pr_name) throws IOException {
        int results = 0;
        String regex_comparator = "(.*)" + pr_name + "(.*)";

        System.out.println("\n====================\n");

        for(int x=0;x<df_list.size();x++){
            if(df_list.get(x).getName().matches(regex_comparator)){
                System.out.println("ID: " + df_list.get(x).getProduct_id());
                System.out.println("Name: " + df_list.get(x).getName());
                System.out.println("Maximum cost: " + df_list.get(x).getPrices_aMax() + " " + df_list.get(x).getPrices_currency());
                System.out.println("Minimum cost: " + df_list.get(x).getPrices_aMin() + " " + df_list.get(x).getPrices_currency());
                System.out.print("\n"); // Separates confirmation dialogue a little from query output.
                if(x<df_list.size()-1)
                    System.out.println("\n # # # # # # # # # # \n");

                results++;
            }
        }

        if(results==0) System.out.println("There isn't a \""+pr_name+"\" product.");

        String p = "product";
        if(results>=2) p += "s";
        else System.out.println("\n====================\nA total of " + results + " " + p + " has been found.");

        Main_Menu.confirmationDialogue(2);
    }
}
