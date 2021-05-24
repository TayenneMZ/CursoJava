package Exercicios.Listas.Exercicio1.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        /*Declaração de lista não aceita tipos primitivos, como o int
        Na instanciação da lista tem que colocar uma classe que implementa a interface*/
        List<String> list = new ArrayList<>();

        //Adicionar valor na lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Lucas");
        list.add("William");
        list.add("Laura");

        //Adicionar valor na lista na posicaçõa desejada, mandando o da posição x para a posição x+1
        list.add(2, "Marco");

        //Verificar o tamanho da lista
        System.out.println(list.size());

        //Remover um elemento da lista, comparando o valor
        list.remove("Anna");
        //Remover um elemento da lista, dada a posição
        list.remove(1);
        //Remover elementos baseados em predicado
        list.removeIf(name -> name.charAt(0) == 'M');

        //Encontrar a posição de um elemento
        System.out.println("Index of Bobo " + list.indexOf("Bob"));
        //Quando o indexOf não encontra o elemento ele retorna -1
        System.out.println("Index of Marco " + list.indexOf("Marco"));
        System.out.println();

        for (String name: list){
            System.out.println(name);
        }
        System.out.println();

        /*Filtar todos o elementos por predicado
        Onde eu crio uma lista 'result', que recebe uma lista dos itens da lista que eu quero
        Então a lista 'result' recebe a lista, converte para stream, faz a operação que quer,
        que é filtrar o item, onde o item começa com o char 'L', e no final convertendo para tipo lista*/
        List<String> result = list.stream().filter(name -> name.charAt(0) == 'L').collect(Collectors.toList());

        for (String name: result){
            System.out.println(name);
        }

        /*Filtra o primeiro nome (no caso desse exemplo) com o predicado
        Primeiro ele busca pelo primeiro nome com o elemento se esse elemente não existir ele retorna nulo */
        String names = list.stream().filter(name -> name.charAt(0) == 'L').findFirst().orElse(null);

        System.out.println(names);
    }
}
