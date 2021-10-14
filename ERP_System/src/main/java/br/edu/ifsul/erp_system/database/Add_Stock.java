package br.edu.ifsul.erp_system.database;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@SuppressWarnings({"resource"})

public class Add_Stock {
    private static int prid;
    public static List<Stock> stock_list = new ArrayList<Stock>();

    static{
        for(int y=0;y<5;y++){
            Data_Fields product_instance = new Data_Fields();

            product_instance.product_id = Integer.toString(y);
            product_instance.name = "Stock test - " + (y + 1);
            product_instance.prices_aMax = Integer.toString(100 + y);
            product_instance.prices_aMin = Integer.toString(100 - y);

            int amount_stock = new Random().nextInt(20);

            for(int x=0;x<5;x++){
                Stock stg = new Stock();

                // Credits to javatpoint.com for a tutorial on how to DATE->STRING.
                Date curr_date = Calendar.getInstance().getTime();  
                DateFormat date_format = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
                String fd = date_format.format(curr_date);

                // Gives random data to the product to be stocked.
                stg.date_stock = fd;
                stg.qty = amount_stock;
                product_instance.stock_list_cont.add(stg);
            }

            /* VS Code suggestions due to error when trying to add(product_instance)
             * 
             * 1 -> use addAll()
             * 2 -> do type casting
             */
            //Add_Stock.stock_list.add(product_instance);
        }
    }

    // Getters and setters

    public static List<Stock> getStock_list() {
        return stock_list;
    }

    public static void setStock_list(List<Stock> stock_list) {
        Add_Stock.stock_list = stock_list;
    }

    public static int getPrid() {
        return prid;
    }

    public static void setPrid(int prid) {
        Add_Stock.prid = prid;
    }
}
