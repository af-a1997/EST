package br.edu.ifsul.erp_system.csv_db_loader;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CSV_Loader {
    public static void main(String[] args) throws IOException {

        String fileName = "C:\\Users\\AF1899\\Documents\\GitHub\\EST\\ERP_System\\_database\\Products.csv";

        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            List<String[]> r = reader.readAll();
            // r.forEach(x -> System.out.println(Arrays.toString(x)));
        } catch (CsvException e) {
            e.printStackTrace();
        }
    }
}
