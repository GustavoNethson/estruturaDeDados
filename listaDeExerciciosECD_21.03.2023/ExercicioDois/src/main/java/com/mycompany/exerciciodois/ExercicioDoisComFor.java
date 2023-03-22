//Desenvolva um algoritmo que receba o valor em Bitcoin de 5 produtos. 
//Em seguida deve ser impresso na tela o valor convertido em dólares, euros, 
//libras e reais. Utilize uma função para cada conversão. 
//Considere os valores abaixo: 
//1 Euro = R$ 5,16 
//1 Libra = R$ 6,02 
//1 Dólar = R$ 4,81 
//1 Bitcoin = R$ 141.257,01 
package com.mycompany.exerciciodois;
import java.util.Scanner;

public class ExercicioDoisComFor {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double valBt [] = new double[5];
        
        for(int i=0; i<valBt.length; i++){
            System.out.println("Digite o " + i + "º valor: ");
            valBt[i] = ler.nextInt();
        }
        
        System.out.print("Os Valores Informados: ");
            for(int i=0; i<valBt.length; i++){
            System.out.print(" - " +valBt[i]);
        }
    }  
}