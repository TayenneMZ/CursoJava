package Exercicios.Excecao.Application;

import Exercicios.Excecao.Entities.Account;
import Exercicios.Excecao.Exception.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter account data");
            System.out.printf("Number: ");
            int number = sc.nextInt();
            System.out.printf("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.printf("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.printf("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount from withdraw: ");

            account.withdraw(sc.nextDouble());

            System.out.println("New balance: " + account.getBalance());
        } catch (DomainException e){
            System.out.printf(e.getMessage());
        }
    }
}
