package Exercicios.Geral;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int A, B, C, D, diferenca;

        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        diferenca = (A * B - C * D);

        System.out.println("DIFERENÇA = " + diferenca);

        sc.close();
    }
}
