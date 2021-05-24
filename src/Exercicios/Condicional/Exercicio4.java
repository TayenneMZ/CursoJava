package Exercicios.Condicional;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int horaInicial, horaFinal, duracao;

        Scanner sc = new Scanner(System.in);

        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        if (horaInicial > horaFinal){
            duracao = 24 - horaInicial + horaFinal;
        } else{
            duracao = horaFinal - horaInicial;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
