package br.com.foxinline.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;




public class TesteCriarTabelas {
    public static void main(String[] args) {
        
        EntityManagerFactory emf  = Persistence.createEntityManagerFactory("contas");
        EntityManager createEntityManager = emf.createEntityManager();
        emf.close();
        
    }
    
    
}
