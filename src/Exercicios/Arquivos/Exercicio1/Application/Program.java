package Exercicios.Arquivos.Exercicio1.Application;

import Exercicios.Arquivos.Exercicio1.Entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter file path: ");
        String sourcePath = sc.nextLine();

        File sourceFile = new File(sourcePath);
        String sourceFolder = sourceFile.getParent();

        boolean sucess = new File(sourceFolder + "\\out").mkdir();

        String targetPath = sourceFolder + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourcePath))) {
            String itemFile = br.readLine();

            while (itemFile != null) {
                String[] fields = itemFile.split(";");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemFile = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetPath))) {
                for (Product item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(targetPath + " CREATED!");
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
