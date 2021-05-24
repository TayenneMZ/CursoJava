package Exercicios.Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        double x, y;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        x = sc.nextDouble();
        y = sc.nextDouble();

        if ((x == 0.00) && (y == 0.00)) {
            System.out.println("Origem");
        } else if (x == 0.00) {
            System.out.println("Eixo X");
        } else if (y == 0.00) {
            System.out.println("Eixo Y");
        } else if (y > 0.00) {
            if (x > 0.00) {
                System.out.println("Q1");
            } else {
                System.out.println("Q2");
            }
        } else {
            if (x > 0.00) {
                System.out.println("Q4");
            } else {
                System.out.println("Q3");
            }
        }

        sc.close();
    }
}
