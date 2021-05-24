package Exercicios.Matriz.Exercicio1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int count = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; mat[i].length < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main Diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; mat[i].length < n; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.print("Negative numbers: " + count);

        sc.close();
    }
}
