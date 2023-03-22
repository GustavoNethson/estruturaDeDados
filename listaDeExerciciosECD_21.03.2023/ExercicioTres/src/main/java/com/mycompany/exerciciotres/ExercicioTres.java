//Faça um algoritmo que através da idade e gênero informados pelo usuário diga 
//se ele pode ou não se alistar.
//Considere 'F' para feminino e 'M' para masculino. 
package com.mycompany.exerciciotres;

import java.util.Scanner;

public class ExercicioTres {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe seu genero: ");
        String genero = ler.nextLine();
        
        System.out.println("Informe sua idade: ");
        int idade = ler.nextInt();

        Alistamento(idade,genero);
    }

    public static void Alistamento(int idade, String genero) {
        switch (genero) {
            case 'M':  
               if (idade <= 17) {
            System.out.println("Você é jovem demias para servir.");
            } else {
            System.out.println("No seu caso é obrigatorio.");
        }
            case 'F': 
               if (idade <= 17) {
            System.out.println("Você é jovem demias para servir.");
            } else {
            System.out.println("No seu caso é opcional.");
        }
                break;
            default:
                throw new AssertionError();
        }

    }
}
