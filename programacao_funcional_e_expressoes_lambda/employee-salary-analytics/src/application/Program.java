package application;

import model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String [] fields = line.split(", ");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");

            List <String> name = list.stream()
                    .filter(p -> p.getSalary() > salary)
                    .map(p -> p.getEmail())
                    .sorted((s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase()))
                    .collect(Collectors.toList());
            name.forEach(System.out::println);

            System.out.print("Enter the initial of the person whose salary sum you want to know: ");
            char initial = sc.next().charAt(0);
            sc.nextLine();

            double sum = list.stream()
                    .filter(p -> p.getName().charAt(0) == initial)
                    .map(p -> p.getSalary())
                    .reduce(0.0, (x, y) -> x + y);
            System.out.println("Sum of salary of people whose name starts with '" + initial + "': " + sum);

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();

    }
}
