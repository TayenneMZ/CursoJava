package Exercicios.Vetor.Exercicio2.Application;

import Exercicios.Vetor.Exercicio2.Entities.Aluguel;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will  be rented? ");
        int roomsRented = sc.nextInt();

        Aluguel[] vector = new Aluguel[9];

        for (int counter = 0; counter < roomsRented; counter++) {
            System.out.println("Rent #" + (counter+1));
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            System.out.println();

            vector[room] = new Aluguel(name, email, room);
        }

        System.out.println();
        System.out.println("Busy rooms");

        for (int counter = 0; counter < vector.length; counter++) {
            if (vector[counter] != null){
                System.out.println(vector[counter].getRoom() + ": " + vector[counter].getName() + ", " + vector[counter].getEmail());
            }
        }

        sc.close();
    }
}
