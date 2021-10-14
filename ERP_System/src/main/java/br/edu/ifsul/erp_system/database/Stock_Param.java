package br.edu.ifsul.erp_system.database;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"resource"})

public class Stock_Param {
    private static int p_id;
    private static String p_name;
    private static int p_count;
    private static String p_date;
    public static List<Stock> stock_list = new ArrayList<Stock>();

    // Constructor

    public Stock_Param(int i_id,String i_name,int i_count,String i_date){
        this.p_id = i_id;
        this.p_name = i_name;
        this.p_count = i_count;
        this.p_date = i_date;
    }

    // Getters and setters

    public static int getP_id() {
        return p_id;
    }

    public static void setP_id(int p_id) {
        Stock_Param.p_id = p_id;
    }

    public static String getP_name() {
        return p_name;
    }

    public static void setP_name(String p_name) {
        Stock_Param.p_name = p_name;
    }

    public static int getP_count() {
        return p_count;
    }

    public static void setP_count(int p_count) {
        Stock_Param.p_count = p_count;
    }

    public static String getP_date() {
        return p_date;
    }

    public static void setP_date(String p_date) {
        Stock_Param.p_date = p_date;
    }

    public static List<Stock> getStock_list() {
        return stock_list;
    }

    public static void setStock_list(List<Stock> stock_list) {
        Stock_Param.stock_list = stock_list;
    }

    // toString() override

    @Override
    public String toString() {
        return "Stock_Param ["
            + "p_id" + p_id
            + "p_name" + p_name
            + "p_count" + p_count
            + "p_date" + p_date
            + "stock_list" + stock_list
        +"]";
    }
}
