package Exercicios.Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        double salario, imposto;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        salario = sc.nextDouble();

        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("R$%.2f", imposto);
        } else if (salario <= 4500.00) {
            imposto = 80 + (salario - 3000.00) * 0.18;
            System.out.printf("R$%.2f", imposto);
        } else {
            imposto = 350 + (salario - 4500.00) * 0.28;
            System.out.printf("R$%.2f", imposto);
        }

        sc.close();
    }
}
