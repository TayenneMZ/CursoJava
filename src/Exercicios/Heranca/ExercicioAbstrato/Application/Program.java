package Exercicios.Heranca.ExercicioAbstrato.Application;

import Exercicios.Heranca.ExercicioAbstrato.Entities.LegalPerson;
import Exercicios.Heranca.ExercicioAbstrato.Entities.Person;
import Exercicios.Heranca.ExercicioAbstrato.Entities.PyshicalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Person> list = new ArrayList<>();

        double sum = 0;

        System.out.println("Enter the number of tax payers: ");
        int number = sc.nextInt();

        for (int cont = 1; cont <= number; cont++) {
            System.out.println();
            System.out.println("Tax payer #" + cont + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char choose = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (choose == 'i'){
                System.out.print("Health expenditures: ");
                double healthSpending = sc.nextDouble();

                list.add(new PyshicalPerson(name, anualIncome, healthSpending));
            } else{
                System.out.print("Number of employees: ");
                int employeeNumber = sc.nextInt();

                list.add(new LegalPerson(name, anualIncome, employeeNumber));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");

        for (Person person: list){
            System.out.println(person.getName() + ": $" + String.format("%.2f", person.tax()));
            sum += person.tax();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));

        sc.close();
    }
}
