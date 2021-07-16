package Exercicios.GenericSetMap.Exercicio2.Application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> students = new HashSet<>();

        System.out.print("How many students for course A? ");
        int courseA = sc.nextInt();

        for (int count = 0; count < courseA; count++) {
            students.add(sc.nextInt());
        }

        System.out.print("How many students for course B? ");
        int courseB = sc.nextInt();

        for (int count = 0; count < courseB; count++) {
            students.add(sc.nextInt());
        }

        System.out.print("How many students for course C? ");
        int courseC = sc.nextInt();

        for (int count = 0; count < courseC; count++) {
            students.add(sc.nextInt());
        }

        System.out.println("Total students: " + students.size());

        sc.close();
    }
}
