package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;


public class TestaAlunos {
    
    public static void main(String[] args){
       
        Collection <String> alunos = new HashSet<>();
        alunos.add("Andre");
        alunos.add("Naruto");
        alunos.add("Goku");
        alunos.add("Luffy");
        alunos.add("Tai");
        
        
//        for(String aluno: alunos){
//            System.out.println( "--> " + aluno);
//        }
        
//        boolean alunoEstaMatriculado = alunos.contains(JOptionPane.showInputDialog("Insira o nome do aluno"));
//        if(alunoEstaMatriculado == true){
//            JOptionPane.showMessageDialog(null, "Aluno está matriculado");
//        } else {
//            JOptionPane.showMessageDialog(null, "Aluno não está matriculado");
//        }
        
        List<String> alunosEmLista = new ArrayList<>(alunos);
        
        System.out.println(alunosEmLista.get(3));
        
        
    }
    
}
