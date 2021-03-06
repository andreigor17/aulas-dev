package br.com.foxinline.jpa.testes;

import br.com.foxinline.projeto.jpa.Conta;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlteraSaldoConta {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();
        
        Conta contaDoAndre = em.find(Conta.class, 2L);
        Conta contaDoTiago = em.find(Conta.class, 3L);
        
        em.getTransaction().begin();
        contaDoAndre.setSaldo(1650.0);
        contaDoTiago.setSaldo(1650.0);
        em.getTransaction().commit();

    }

}
