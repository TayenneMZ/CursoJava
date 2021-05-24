package Exercicios.Condicional;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int A, B;

        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();

        if ((A%B == 0) || (B%A == 0)) {
            System.out.println("São multiplos");
        } else{
            System.out.println("Não são multiplos");
        }

        sc.close();
    }
}
