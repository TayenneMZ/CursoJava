package Exercicios.RepeticaoWhile;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int senha;

        Scanner sc = new Scanner(System.in);

        senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha invalida");

            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido");

        sc.close();
    }
}
