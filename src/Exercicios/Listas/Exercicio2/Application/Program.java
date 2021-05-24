package Exercicios.Listas.Exercicio2.Application;

import Exercicios.Listas.Exercicio2.Entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registred?");
        int quantity = sc.nextInt();

        for (int cont = 0; cont < quantity; cont++) {
            System.out.println("Employee #" + (cont + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.println();

            Employee employee = new Employee(id, name, salary);

            list.add(employee);
        }

        System.out.print("Enter the employee ID that will have salary");
        int id = sc.nextInt();

        Employee emp = list.stream().filter(codigo -> codigo.getId() == id).findFirst().orElse(null);

        if (emp == null){
            System.out.print("This id does not exist!");
        } else{
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();

            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");

        for (Employee e: list){
            System.out.println(e);
        }
    }
}
