

package com.mycompany.aula28032023;
import java.util.ArrayList;

public class Aula28032023 {

    public static void main(String[] args) {
        
        String curso1 = "Estrutura de dados";
        String curso2 = "Robótica";
        String curso3 = "Inteligencia Artificial";
        String curso4 = "Java";
        
        ArrayList<String> cursos = new ArrayList<>();
                
            cursos.add(curso1);
            cursos.add(curso2);
            cursos.add(curso3);
            cursos.add(curso4);
                         
        int sala1 = 2;
        int sala2 = 4;
        int sala3 = 6;
        int sala4 = 10;
        
        ArrayList<Integer> salas = new ArrayList<>();
            
            salas.add(sala1);
            salas.add(sala2);
            salas.add(sala3);
            salas.add(sala4);
            
        System.out.println("Curso: " + curso1 + ", Sala: " + sala1);
        System.out.println("Curso: " + curso2 + ", Sala: " +sala2);
        System.out.println("Curso: " + curso3 + ", Sala: " + sala3);
        System.out.println("Curso: " + curso4 + ", Sala: " + sala4);
    }
}
