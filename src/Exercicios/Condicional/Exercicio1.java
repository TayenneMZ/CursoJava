package Exercicios.Condicional;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        int numero;

        Scanner sc = new Scanner(System.in);

        numero = sc.nextInt();

        if (numero < 0){
            System.out.println("NEGATIVO");
        } else{
            System.out.println("NÃO NEGATIVO");
        }

        sc.close();
    }
}
