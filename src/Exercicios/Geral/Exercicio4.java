package Exercicios.Geral;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio4 {
    public static void main(String[] args) {
        int funcionario, horas;
        double salarioHora, salario;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        funcionario = sc.nextInt();
        horas = sc.nextInt();
        salarioHora = sc.nextDouble();

        salario = horas * salarioHora;

        System.out.println("NUMBER = " + funcionario);
        System.out.printf("SALARY = U$%.2f", salario);

        sc.close();
    }
}
