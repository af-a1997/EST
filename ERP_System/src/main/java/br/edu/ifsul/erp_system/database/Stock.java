package br.edu.ifsul.erp_system.database;

public class Stock {
    public static String date_stock;
    public static int qty;

    public Stock(String i_ds, int i_qty){
        super();

        this.date_stock = i_ds;
        this.qty = i_qty;
    }

    // ==========

    public static String getDate_stock() {
        return date_stock;
    }

    public static void setDate_stock(String date_stock) {
        Stock.date_stock = date_stock;
    }

    public static int getQty() {
        return qty;
    }

    public static void setQty(int qty) {
        Stock.qty = qty;
    }

    @Override
    public String toString() {
        return "Stock [] [date_stock=" + date_stock + ", qty=" + qty + "]";
    }
}
