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
public class ExercicioDois {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
 
        System.out.println("Inforome abaixo os valores de 5 produtos em Bitcoin que deseja \n converter nas seguintes moedas (Euro, Libra, Dólar, Reais e Bitcoin). ");
        System.out.println("Inforome o valor em Bitcoin que deseja converter nas moe: ");
        double valor1 = ler.nextDouble();
        double valorReal1 = valor1 * 141257.01;
        
        Euro(valorReal1);
        Libra(valorReal1);
        Dolar(valorReal1);
        Bitcoin(valor1);
    }
    
    public static void Euro(double valorReal){
        double resultado = valorReal / 5.16;
        System.out.println("Valor em Euro = " + resultado);
    }
    public static void Libra(double valorReal){ 
        double resultado = valorReal / 6.02;
        System.out.println("Valor em Libra = " + resultado);
    }
    public static void Dolar(double valorReal){
        double resultado = valorReal / 4.81;
        System.out.println("Valor em Dolar = " + resultado);
    }
    public static void Bitcoin(double valor){
    System.out.println("Valor em Bitcoin = " + valor);
    }
    
}
