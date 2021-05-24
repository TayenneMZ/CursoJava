package Exercicios.RepeticaoFor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int n;
        double valor1, valor2, valor3, media;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        valor1 = 0.00;
        valor2 = 0.00;
        valor3 = 0.00;

        n = sc.nextInt();

        for (int contador = 0; contador < n; contador++) {
            valor1 = sc.nextDouble();
            valor2 = sc.nextDouble();
            valor3 = sc.nextDouble();

            media = ((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / 10;

            System.out.printf("%.1f", media);
        }

        sc.close();
    }
}
