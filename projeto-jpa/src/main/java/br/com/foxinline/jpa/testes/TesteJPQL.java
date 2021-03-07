package br.com.foxinline.jpa.testes;

import br.com.foxinline.projeto.jpa.Conta;
import br.com.foxinline.projeto.jpa.Movimentacao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


public class TesteJPQL {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();
        
         String jpql = "select m from Movimentacao m where m.conta = :pconta order by m.valor desc";
         
        Conta conta = new Conta();
        conta.setId(1L);
       
        
      TypedQuery<Movimentacao> query = em.createQuery(jpql, Movimentacao.class);
       query.setParameter("pconta", conta);
       
       
        List<Movimentacao> resultList = query.getResultList();
        
        for(Movimentacao movimentacao : resultList){
            System.out.println("Descricação: " + movimentacao.getDescricao());
            System.out.println("Valor: " + movimentacao.getValor());
            System.out.println("Tipo: " + movimentacao.getTipoMovimentacao());
            
        }
        
    }
    
}
