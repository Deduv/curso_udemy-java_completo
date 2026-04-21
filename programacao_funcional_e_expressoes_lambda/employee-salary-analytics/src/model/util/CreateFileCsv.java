package model.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileCsv {
    static void main () {

        String [] name = {"Maria", "Alex", "Marco", "Bob", "Anna"};
        String [] email = {"maria@gmail.com", "alex@gmail.com", "marco@gmail.com", "bob@gmail.com", "anna@gmail.com"};
        Double [] salary = {3200.00, 1900.00, 1700.00, 3500.00, 2900.00};

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/big_ed/salary.txt"))) {
            for (int i = 0; i < name.length; i++) {
                bw.write(name[i] + ", " + email[i] + ", " + salary[i]);
                bw.newLine();
            }

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
