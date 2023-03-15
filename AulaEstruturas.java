package com.mycompany.aulaestruturas;
import java.util.Scanner;
public class AulaEstruturas {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String palavra [] = new String[10];
        
        for(int i=0; i<palavra.length; i++){
            System.out.println("Digite sua palavra ");
            palavra[i] = ler.nextLine();
        
        }
        
        System.out.print("Numeros Informados: ");
        for(int i=0; i<palavra.length; i++){
            System.out.print(" - " +palavra[i]);
        }
    }
}
