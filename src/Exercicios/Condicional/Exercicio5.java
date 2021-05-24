package Exercicios.Condicional;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        int codigo, quantidade;
        double preco;

        Scanner sc = new Scanner(System.in);

        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        if (codigo == 1) {
            preco = quantidade * 4;
        } else if (codigo == 2) {
            preco = quantidade * 4.50;
        } else if (codigo == 3) {
            preco = quantidade * 5;
        } else if (codigo == 4) {
            preco = quantidade * 2;
        } else {
            preco = quantidade * 1.50;
        }

        System.out.printf("Total: R$%.2f", preco);

        sc.close();
    }
}
