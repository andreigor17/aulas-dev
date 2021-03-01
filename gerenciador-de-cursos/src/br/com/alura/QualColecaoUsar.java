
package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class QualColecaoUsar {
    
    public static void main (String[] args){
        Collection<Aluno> alunos = new HashSet<>();
        Aluno a1 = new Aluno("André", 01);
        Aluno a2 = new Aluno("Paulo", 02);
        Aluno a3 = new Aluno("João", 03);
        
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        
        System.out.println(alunos.size());
        
        
        
        
        
        
    }
    
    
    
}
