package model.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileCsv {
     static void main () {
        String [] productNames = {"Tv", "Mouse", "Tablet", "HD Case", "Computer", "Monitor"};
        Double [] productPrices = {900.00, 50.00, 350.50, 80.90, 850.00, 290.00};

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/big_ed/products.csv"))) {
            for(int i = 0; i < productNames.length; i++) {
                bw.write(productNames[i] + ", " + productPrices[i]);
                bw.newLine();
            }

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
