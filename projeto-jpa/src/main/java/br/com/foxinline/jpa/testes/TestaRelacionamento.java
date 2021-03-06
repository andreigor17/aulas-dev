/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.foxinline.jpa.testes;

import br.com.foxinline.projeto.jpa.Conta;
import br.com.foxinline.projeto.jpa.Movimentacao;
import br.com.foxinline.projeto.jpa.TipoMovimentacao;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author andre-pc
 */
public class TestaRelacionamento {
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        conta.setTitular("Marcio");
        conta.setAgencia(2300);
        conta.setNumero(10051);
        conta.setSaldo(5000.0);
        
        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setData(LocalDateTime.now());
        movimentacao.setDescricao("Churrascaria");
        movimentacao.setValor(new BigDecimal(200.0));
        movimentacao.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
        movimentacao.setConta(conta);
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(conta);
        em.persist(movimentacao);
        em.getTransaction().commit();
        
        em.close();
        
        
        
        
        
    }
    
    
    
    
    
}
