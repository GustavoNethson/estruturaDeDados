/*Implemente um programa onde sejam permitidos adicionar varios nomes de 
bandas, excluir um elemento qualquer da lista por seu indice, mostrar novamente
a lista, fazer uma nova inclusão, e por fim excluir todos os elementos da lista.
Bonus: trocar ao menos uma banda de local(indice).*/

package com.mycompany.desafio;
import java.util.ArrayList;//Importando a biblioteca que permite a criação da lista
import javax.sound.midi.Soundbank;

public class Desafio {

    public static void main(String[] args) {
        ArrayList<String> listaBandas = new ArrayList<>();//criando a lista 
        
        listaBandas.add("AC/DC");
        listaBandas.add("Metalica");
        listaBandas.add("Iron Maden");
        listaBandas.add("Black Sabbath");
        listaBandas.add("DragonForce");
        listaBandas.add("Shania Twain");
        //Adicionando todos os elementos da lista.
        
        for (String elemento: listaBandas){
              System.out.println(elemento);
        }
        //imprimindo todos os elementos da lista.
        
        listaBandas.remove(5);
        //Excluindo um elemento da lista pelo indice
        System.out.println("\n----\n");
        
        for (String elemento: listaBandas){
            System.out.println(elemento);
        }
        //imprimindo novamente os itens da lista, apos a atualização.
        
        System.out.println("\n----\n");
        
        listaBandas.add("Bon Jovi");        
        listaBandas.add("Dio");         
        listaBandas.add("Guns N' Roses");        
        listaBandas.add("Judas Priest");
        listaBandas.add("Ozzy Osbourne");
        listaBandas.add("Twisted Sister");
        //Nova lista, em ordem alfabetica, e com mais bandas de Rock.
        
        for (String elemento: listaBandas){
            System.out.println(elemento);
        }//imprimindo novamente os itens da lista, apos a atualização.
        
        System.out.println("\n----\n");
        
        listaBandas.clear();
        
        for (String elemento: listaBandas){
            System.out.println(elemento);
        }//imprimindo novamente os itens da lista, apos a atualização.
        
        System.out.println("\n----\n");
                
    }
}
