package br.com.foxinline.jpa.testes;

import br.com.foxinline.projeto.jpa.Conta;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriaContaComSaldo {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();

        Conta conta = new Conta();
        conta.setTitular("Roney");
        conta.setNumero(42110);
        conta.setAgencia(2300);
        conta.setSaldo(3000.0);
        
        em.getTransaction().begin();
        em.persist(conta);
        em.getTransaction().commit();
        em.close();
        
        
        EntityManager em2 = emf.createEntityManager();
        System.out.println("Id da conta do Roney = " + conta.getId());
        conta.setSaldo(4000.0);
        em2.getTransaction().begin();
        em2.merge(conta);
        em2.getTransaction().commit();
    }

}
