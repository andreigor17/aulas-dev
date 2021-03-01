/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author andre-pc
 */
public class Exercicio {
    
    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");
        
        
        
        
        Iterator<Integer> iterador = pessoas.keySet().iterator() ;
        while(iterador.hasNext()){
            Integer pessoa = iterador.next();
            System.out.println(pessoa);
            
            
        
    }
        
        
        
    }       
    
    
    
}
