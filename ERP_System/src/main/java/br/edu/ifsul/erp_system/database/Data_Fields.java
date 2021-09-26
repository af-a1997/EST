package br.edu.ifsul.erp_system.database;

import java.util.ArrayList;
import java.util.List;

public class Data_Fields {
    // Class that contains almost all of the product fields.
    public static List<String[]> r = new ArrayList<String[]>();

    /*
     * Prepares a variable for each field in the CSV DB, except the last five columns.
     * Each variable is a string for ease of coding and data handling, but "would-be" types are commented right next to each variable, if not stated, then assume type is correct or best fit.
    */
    public String product_id;       // INT
    public String prices_aMax;      // DOUBLE
    public String prices_aMin;      // DOUBLE
    public String avail;
    public String cond;
    public String prices_currency;
    public String seen_timestamp;
    public String prices_sale;      // BOOLEAN
    public String prices_merchant;
    public String prices_shipping;
    public String prices_SrcURLs;
    public String asins;
    public String brand;
    public String categories;
    public String added;
    public String updated;
    public String EAN;
    public String image_LocURLs;
    public String keys;
    public String manufacturer_name;
    public String manufacturer_no;
    public String name;
    public String primary_categories;
    public String srcURLs;
    public String UPC;
    public String weight;

    // Generated toString() override.

    @Override
    public String toString() {
        return "Data_Fields [EAN=" + EAN + ", UPC=" + UPC + ", added=" + added + ", asins=" + asins + ", avail=" + avail
                + ", brand=" + brand + ", categories=" + categories + ", cond=" + cond + ", image_LocURLs="
                + image_LocURLs + ", keys=" + keys + ", manufacturer_name=" + manufacturer_name + ", manufacturer_no="
                + manufacturer_no + ", name=" + name + ", prices_SrcURLs=" + prices_SrcURLs + ", prices_aMax="
                + prices_aMax + ", prices_aMin=" + prices_aMin + ", prices_currency=" + prices_currency
                + ", prices_merchant=" + prices_merchant + ", prices_sale=" + prices_sale + ", prices_shipping="
                + prices_shipping + ", primary_categories=" + primary_categories + ", product_id=" + product_id
                + ", seen_timestamp=" + seen_timestamp + ", srcURLs=" + srcURLs + ", updated=" + updated + ", weight="
                + weight + "]";
    }

    // Generated getters and setters.

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getPrices_aMax() {
        return prices_aMax;
    }

    public void setPrices_aMax(String prices_aMax) {
        this.prices_aMax = prices_aMax;
    }

    public String getPrices_aMin() {
        return prices_aMin;
    }

    public void setPrices_aMin(String prices_aMin) {
        this.prices_aMin = prices_aMin;
    }

    public String getAvail() {
        return avail;
    }

    public void setAvail(String avail) {
        this.avail = avail;
    }

    public String getCond() {
        return cond;
    }

    public void setCond(String cond) {
        this.cond = cond;
    }

    public String getPrices_currency() {
        return prices_currency;
    }

    public void setPrices_currency(String prices_currency) {
        this.prices_currency = prices_currency;
    }

    public String getSeen_timestamp() {
        return seen_timestamp;
    }

    public void setSeen_timestamp(String seen_timestamp) {
        this.seen_timestamp = seen_timestamp;
    }

    public String getPrices_sale() {
        return prices_sale;
    }

    public void setPrices_sale(String prices_sale) {
        this.prices_sale = prices_sale;
    }

    public String getPrices_merchant() {
        return prices_merchant;
    }

    public void setPrices_merchant(String prices_merchant) {
        this.prices_merchant = prices_merchant;
    }

    public String getPrices_shipping() {
        return prices_shipping;
    }

    public void setPrices_shipping(String prices_shipping) {
        this.prices_shipping = prices_shipping;
    }

    public String getPrices_SrcURLs() {
        return prices_SrcURLs;
    }

    public void setPrices_SrcURLs(String prices_SrcURLs) {
        this.prices_SrcURLs = prices_SrcURLs;
    }

    public String getAsins() {
        return asins;
    }

    public void setAsins(String asins) {
        this.asins = asins;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getAdded() {
        return added;
    }

    public void setAdded(String added) {
        this.added = added;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getEAN() {
        return EAN;
    }

    public void setEAN(String eAN) {
        EAN = eAN;
    }

    public String getImage_LocURLs() {
        return image_LocURLs;
    }

    public void setImage_LocURLs(String image_LocURLs) {
        this.image_LocURLs = image_LocURLs;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public String getManufacturer_name() {
        return manufacturer_name;
    }

    public void setManufacturer_name(String manufacturer_name) {
        this.manufacturer_name = manufacturer_name;
    }

    public String getManufacturer_no() {
        return manufacturer_no;
    }

    public void setManufacturer_no(String manufacturer_no) {
        this.manufacturer_no = manufacturer_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrimary_categories() {
        return primary_categories;
    }

    public void setPrimary_categories(String primary_categories) {
        this.primary_categories = primary_categories;
    }

    public String getSrcURLs() {
        return srcURLs;
    }

    public void setSrcURLs(String srcURLs) {
        this.srcURLs = srcURLs;
    }

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String uPC) {
        UPC = uPC;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
