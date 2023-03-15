package com.mycompany.aulaestruturas;
import java.util.Scanner;

public class numeros {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numero [] = new int[10];
        
        for(int i=0; i<numero.length; i++){
            System.out.println("Digite um numero ");
            numero[i] = ler.nextInt();
        
        }
        
        System.out.print("Numeros Informados: ");
        for(int i=0; i<numero.length; i++){
            System.out.print(" - " +numero[i]);
        }
    }
}