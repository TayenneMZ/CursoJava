package Exercicios.RepeticaoFor;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int n, dentro, fora;

        Scanner sc = new Scanner(System.in);

        dentro = 0;
        fora = 0;

        n = sc.nextInt();

        for (int contador = 0; contador < n; contador++) {
            int x;

            x = sc.nextInt();

            if ((x >= 10) && (x <= 20)) {
                dentro += 1;
            } else {
                fora += 1;
            }
        }

        System.out.println(dentro + " in");
        System.out.println(fora + " out");

        sc.close();
    }
}
