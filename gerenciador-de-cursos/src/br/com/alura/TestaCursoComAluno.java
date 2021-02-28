/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author andre-pc
 */
public class TestaCursoComAluno {
    
    public static void main(String[] args){
        
        Curso javaColecoes = new Curso("Dominando as coleções do java", "André Igor");
        
       //javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
       javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
       javaColecoes.adiciona(new Aula("Criando uma aula", 20));
       javaColecoes.adiciona(new Aula("Modelando com coleções", 21));
       
       Aluno a1 = new Aluno("Tiago Web", 1);
       Aluno a2 = new Aluno("Juliano Mapurunga", 2);
       Aluno a3 = new Aluno("Dudu", 3);
       Aluno a4 = new Aluno("Boboca", 4);
       
       javaColecoes.matricula(a1);
       javaColecoes.matricula(a2);
       javaColecoes.matricula(a3);
       
       //System.out.println("Todos os alunos matriculados nesse curso:" + javaColecoes.getAlunos());
        
//        Aluno teste = new Aluno("Tiago Web", 1);
//        System.out.println(javaColecoes.estaMatriculado(a3));
//        System.out.println(teste.equals(a1));
        
       Set<Aluno> alunos = javaColecoes.getAlunos();
       Iterator<Aluno> iterador =  alunos.iterator();
        while(iterador.hasNext()){
            Aluno proximo = iterador.next();
            System.out.println(proximo);
            
        }
        
    }
    
    
    
}
