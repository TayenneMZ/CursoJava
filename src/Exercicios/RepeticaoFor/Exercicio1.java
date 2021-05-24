package Exercicios.RepeticaoFor;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int x;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        for (int contador = 1; contador <= x ; contador += 2){
            System.out.println(contador);
        }

        sc.close();
    }
}
