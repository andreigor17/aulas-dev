package br.com.foxinline.jpa.testes;

import br.com.foxinline.projeto.jpa.Conta;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriaConta {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();

        Conta conta = new Conta();
        conta.setTitular("André Igor Lopes");
        conta.setNumero(29411);
        conta.setAgencia(2300);
        conta.setSaldo(1650.0);
        
        em.getTransaction().begin();
        em.persist(conta);
        em.getTransaction().commit();
        
        
    }

}
