package Exercicios.Objeto.Exercicio4.Application;

import Exercicios.Objeto.Exercicio4.Util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();

        System.out.print("What is the dollar price? ");

        currencyConverter.valorDollar = sc.nextDouble();

        System.out.println();
        System.out.print("How many dollar will be bought? ");

        currencyConverter.quantidadeDollar = sc.nextDouble();

        System.out.println();
        System.out.printf("Amount to be paid in reais = %.2f", currencyConverter.converter());

        sc.close();
    }
}
