package br.com.alura;

import javax.swing.JOptionPane;

public class TestaBuscaAlunosNoCurso {

    public static void main(String[] args) {

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
        
        int mat = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero da matricula:"));
        System.out.println("Quem é o aluno com matricula " + mat + "?" );
        Aluno aluno = javaColecoes.buscaMatriculado(mat);
        System.out.println(aluno);
        
        



    }
}
