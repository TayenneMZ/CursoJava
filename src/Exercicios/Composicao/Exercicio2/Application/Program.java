package Exercicios.Composicao.Exercicio2.Application;

import Exercicios.Composicao.Exercicio2.Entities.Comment;
import Exercicios.Composicao.Exercicio2.Entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        Post p1 = new Post(sdf.parse("27/06/2018 13:03:44"), "Traveling to New Zealand", "I'm going to visit this wonderful countray!", 12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        sc.close();
    }
}
