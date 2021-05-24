package Exercicios.RepeticaoWhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int x, y;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        while ((x != 0) && (y != 0)) {
            if (y > 0) {
                if (x > 0) {
                    System.out.println("primeiro");
                } else {
                    System.out.println("segundo");
                }
            } else {
                if (x > 0) {
                    System.out.println("quarto");
                } else {
                    System.out.println("terceiro");
                }
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
