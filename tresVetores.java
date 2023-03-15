package com.mycompany.aulaestruturas;
import java.util.Scanner;

public class tresVetores{

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numero [] = new int[20];
        double numInt[] = new double[5];
        String animais[] = new String[10];
        
        for(int i=0; i<numero.length; i++){
            System.out.println("Digite um numero ");
            numero[i] = ler.nextInt();
        }
        
        System.out.print("Numeros Informados: ");
        for(int i=0; i<numero.length; i++){
            System.out.print(" - " +numero[i]);
        }
        
        //Numeros inteiros
        
        for(int i=0; i<numInt.length; i++){
            System.out.println("Digite um numero ");
            numInt[i] = ler.nextDouble();
        }
        
        System.out.print("Numeros Informados: ");
        for(int i=0; i<numInt.length; i++){
            System.out.print(" - " +numInt[i]);
        }
        
        //String animais
        
        for(int i=0; i<animais.length; i++){
            System.out.println("Digite um numero ");
            animais[i] = ler.nextLine();        
        }
        
        System.out.print("Numeros Informados: ");
        for(int i=0; i<animais.length; i++){
            System.out.print(" - " +animais[i]);
        }
           
    }
}