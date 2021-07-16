package Exercicios.GenericSetMap.Exercicio3.Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            Map<String, Integer> votes = new HashMap<>();

            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int vote = Integer.parseInt(fields[1]);

                if (votes.containsKey(name)) {
                    int previousVotes = votes.get(name);
                    votes.put(fields[0], vote + previousVotes);
                } else {
                    votes.put(name, vote);
                }

                line = br.readLine();
            }

            for (String key : votes.keySet()) {
                System.out.printf(key + ": " + votes.get(key));
            }
        } catch (IOException e) {
            System.out.printf("Error: " + e.getMessage());
        }

        sc.close();
    }
}
