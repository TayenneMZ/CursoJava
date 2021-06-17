package Exercicios.Heranca.Exercicio1.Application;

import Exercicios.Heranca.Exercicio1.Entities.Employee;
import Exercicios.Heranca.Exercicio1.Entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int cont = 1; cont <= n; cont++) {
            System.out.println();
            System.out.println("Employee #" + cont + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char answer = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per Hour: ");
            double valuePerHour = sc.nextDouble();

            if (answer == 'y') {
                System.out.print("Additional charge: ");
                double additional = sc.nextDouble();

                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additional));
            } else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");

        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
