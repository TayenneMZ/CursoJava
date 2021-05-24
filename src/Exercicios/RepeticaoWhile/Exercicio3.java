package Exercicios.RepeticaoWhile;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int tipoCombustivel, alcool, gasolina, diesel;

        Scanner sc = new Scanner(System.in);

        alcool = 0;
        gasolina = 0;
        diesel = 0;

        tipoCombustivel = sc.nextInt();

        while (tipoCombustivel != 4) {
            switch (tipoCombustivel) {
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
            }

            tipoCombustivel = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
