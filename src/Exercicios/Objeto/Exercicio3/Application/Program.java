package Exercicios.Objeto.Exercicio3.Application;

import Exercicios.Objeto.Exercicio3.Entities.Studant;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Studant studant = new Studant();

        studant.name = sc.nextLine();
        studant.nota1 = sc.nextDouble();
        studant.nota2 = sc.nextDouble();
        studant.nota3 = sc.nextDouble();

        System.out.println();
        System.out.printf("FINAL GRADE = %.2f%n", studant.finalGrade());
        if (studant.finalGrade() > 60.00){
            System.out.println("PASS");
        } else{
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", studant.missing() );
        }

        sc.close();
    }
}
