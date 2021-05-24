package Exercicios.Vetor.Exercicio1.Application;

import Exercicios.Vetor.Exercicio1.Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vector = new Product[n];
        double sum = 0;

        for (int i = 0; i < vector.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vector[i] = new Product(name, price);

            sum += vector[i].getPrice();
        }

        System.out.printf("AVERAGE HEIGHT  %.2f", sum / n);

        sc.close();
    }
}
