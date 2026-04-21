package application;

import model.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter the file path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(", ");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double avg = list.stream()
                    .map(p -> p.getProductPrices())
                    .reduce(0.0, (x, y) -> x + y) / list.size();

            System.out.println("Average price: " + String.format("%.2f", avg));

            List <String> names = list.stream()
                    .filter(p -> p.getProductPrices() < avg)
                    .map(p -> p.getProductNames())
                    .sorted((s1, s2) -> s2.toUpperCase().compareTo(s1.toUpperCase()))
                    .collect(Collectors.toList());

            names.forEach(System.out::println);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
