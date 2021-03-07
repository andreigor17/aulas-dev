package br.com.foxinline.jpa.testes;

import br.com.foxinline.projeto.jpa.Categoria;
import br.com.foxinline.projeto.jpa.Conta;
import br.com.foxinline.projeto.jpa.Movimentacao;
import br.com.foxinline.projeto.jpa.TipoMovimentacao;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaMovimentacaoCategoria {

    public static void main(String[] args) {

        Categoria categoria = new Categoria("Viagem");
        Categoria categoria2 = new Categoria("Negocios");
        
        Conta conta = new Conta();
        conta.setId(2L);
        
        
        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setDescricao("Viagem a JP");
        movimentacao.setTipoMovimentacao(TipoMovimentacao.SAIDA);
        movimentacao.setData(LocalDateTime.now());
        movimentacao.setValor(new BigDecimal(300.0));
        List<Categoria> categorias = new ArrayList<>();
        categorias.add(categoria);
        categorias.add(categoria2);
        movimentacao.setCategorias(categorias);
        movimentacao.setConta(conta);
        
        
        Movimentacao movimentacao2 = new Movimentacao();
        movimentacao2.setDescricao("Viagem a RJ");
        movimentacao2.setTipoMovimentacao(TipoMovimentacao.SAIDA);
        movimentacao2.setData(LocalDateTime.now());
        movimentacao2.setValor(new BigDecimal(1000.0));
        categorias.add(categoria);
        categorias.add(categoria2);
        movimentacao2.setCategorias(categorias);
        movimentacao2.setConta(conta);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(categoria);
        em.persist(categoria2);
        em.persist(movimentacao);
        em.persist(movimentacao2);
        em.getTransaction().commit();
        em.close();
        
        
        
        

    }

}
