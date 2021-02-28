package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author andre-pc
 */
public class TestandoListas {
        
    public static void main(String[] args){
        
        String aula1 = JOptionPane.showInputDialog("Insira a 1 aula");
        String aula2 = JOptionPane.showInputDialog("Insira a 2 aula");
        String aula3 = JOptionPane.showInputDialog("Insira a 3 aula");
        
        ArrayList<String> aulas =  new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        
        //System.out.println(aulas);
        
        //aulas.remove(0);
        
        //System.out.println(aulas);
        
        for (String aula : aulas){
           JOptionPane.showMessageDialog(null, aula);
           
        }
        
//        String primeiraAula = aulas.get(0);
//        System.out.println("A primeira aula é: " + primeiraAula);
        
//        for (int i = 0; i < aulas.size(); i++) {
//            System.out.println("Aula: "+ aulas.get(i));
//        }
        
        
//        aulas.add("Aumentando nosso conhecimento");
//        System.out.println(aulas);
//        Collections.sort(aulas);
//        System.out.println("Depois de ordenado");
//        System.out.println(aulas);
        
        
        
    }
    
    
}
