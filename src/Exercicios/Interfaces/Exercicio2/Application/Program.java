package Exercicios.Interfaces.Exercicio2.Application;

import Exercicios.Interfaces.Exercicio2.Entities.Contract;
import Exercicios.Interfaces.Exercicio2.Entities.Installment;
import Exercicios.Interfaces.Exercicio2.Services.ContractServices;
import Exercicios.Interfaces.Exercicio2.Services.PaymentService;
import Exercicios.Interfaces.Exercicio2.Services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        PaymentService paymentService = new PaypalService();

        System.out.println("Enter contract data");
        System.out.printf("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        Date dateContract = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        double value = sc.nextDouble();
        System.out.print("Enter number of installments: ");
        int installments = sc.nextInt();

        Contract contract = new Contract(number, dateContract, value);
        ContractServices contractServices = new ContractServices(new PaypalService());
        contractServices.processContract(contract, installments);

        System.out.println("Installments:");
        for (Installment monthlyInstallment : contract.getInstallments()) {
            System.out.println(monthlyInstallment);
        }

        sc.close();
    }
}
