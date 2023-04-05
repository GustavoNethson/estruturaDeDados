package com.mycompany.teste;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<String>();
        Scanner inserir = new Scanner(System.in);
        
        //Criando a lista juntamente com todos os elementos que a compõem.
        listaNomes.add("Gustavo Henrique da Silva Nethson\n");
        listaNomes.add("Sopa de macaco\n");
        listaNomes.add("João Marcos Contini Tavares Pereira\n");
        listaNomes.add("Eduardo Rodrigues\n");
        listaNomes.add("Lucas Alexandre Leopolski\n");
        //Roda a primeira versão da lista
        System.out.println(listaNomes);
        //Apaga o item localizado no indice 1, ou seja o segundo item da lista.
        listaNomes.remove(1);
        System.out.println("---");
        // Imprime a lista agora sem o segundo item.
        System.out.println(listaNomes);
        
        listaNomes.add(inserir.nextLine() + "\n");
        System.out.println("\n---\n");
        
        System.out.println(listaNomes);
    }
}
