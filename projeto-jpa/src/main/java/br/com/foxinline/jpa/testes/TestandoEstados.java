package br.com.foxinline.jpa.testes;

import br.com.foxinline.projeto.jpa.Conta;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class TestandoEstados {
    
    public static void main(String[] args) {
        
        //Transient
        Conta conta = new Conta();
        conta.setTitular("Remedios");
        conta.setAgencia(2300);
        conta.setNumero(10051);
        conta.setSaldo(10000000.0);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();
        
//        em.getTransaction().begin();
//        
//        //Transient --> Managed
//        em.persist(conta);
//        
//        em.getTransaction().commit();
//        
//        em.close();
        
        EntityManager em2 = emf.createEntityManager();
        Conta contaCeline = em2.find(Conta.class, 11L);
        contaCeline.setSaldo(2200.0);
        em2.getTransaction().begin();
        
         
        em2.merge(contaCeline);
        em2.getTransaction().commit();
        
        
        
    }
    
    
}
