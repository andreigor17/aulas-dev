package br.com.foxinline.jpa.testes;

import br.com.foxinline.projeto.jpa.Categoria;
import br.com.foxinline.projeto.jpa.Conta;
import br.com.foxinline.projeto.jpa.Movimentacao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class TesteJPQLMovimentacaoDeUmaCategoria {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();
        
         String jpql = "select m from Movimentacao m join m.categorias c where c = :pCategoria";
         
        Categoria categoria = new Categoria();
        categoria.setId(1L);
       
        
      TypedQuery<Movimentacao> query = em.createQuery(jpql, Movimentacao.class);
       query.setParameter("pCategoria", categoria);
       
       
        List<Movimentacao> resultList = query.getResultList();
        
        for(Movimentacao movimentacao : resultList){
            System.out.println("Categoria: " + movimentacao.getCategorias());
            System.out.println("Descricação: " + movimentacao.getDescricao());
            System.out.println("Valor: " + movimentacao.getValor());
            System.out.println("Tipo: " + movimentacao.getTipoMovimentacao());
            
        }
    
    
    
}
    
}
