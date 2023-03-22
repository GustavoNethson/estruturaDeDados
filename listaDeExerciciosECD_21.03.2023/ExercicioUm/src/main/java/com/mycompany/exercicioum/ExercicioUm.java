//1 - Escreva um procedimento que gere um cabeçalho para um relatório. 
//Esse procedimento deve receber um literal (string, ou cadeia de caracteres) 
//como parâmetro. O cabeçalho tem a seguinte forma: 

//================================================= 
//UNIPAR - UNIVERSIDADE PARANAENSE 
//Analise e Desenvolvimento de Sistemas - ADS 
//Algoritmos e Fundamentos de Programação de Computadores 
//Nome: Fulano de Tal 
//================================================= 
//onde Fulano de Tal, corresponde ao parâmetro passado. 

package com.mycompany.exercicioum;
import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        String aluno = ler.nextLine();
        
        Aluno(aluno);

    }
    public static void Aluno(String aluno){
        System.out.println("=================================================");
        System.out.println("UNIPAR - UNIVERSIDADE PARANAENSE");
        System.out.println("Analise e Desenvolvimento de Sistemas - ADS");
        System.out.println("Algoritmos e Fundamentos de Programação de Computadores");
        System.out.println("Nome: "+ aluno);
        System.out.println("=================================================");
        }
}
