package Exercicios.Condicional;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double numero;

        Scanner sc = new Scanner(System.in);

        numero = sc.nextDouble();

        if ((numero < 0.00) || (numero > 100.00)) {
            System.out.println("Fora de intervalo");
        } else if (numero <= 25.00) {
            System.out.println("Intervalo [0, 25]");
        } else if (numero <= 50.00) {
            System.out.println("Intervalo [25, 50]");
        } else if (numero <= 75) {
            System.out.println("Intervalo [50, 75]");
        } else if (numero <= 100) {
            System.out.println("Intervalo [75,100]");
        }

        sc.close();
    }
}
