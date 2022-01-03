package com.irontech.ironfood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.irontech.ironfood.domain.model.Cozinha;
import com.irontech.ironfood.domain.model.FormaPagamento;
import com.irontech.ironfood.domain.repository.CozinhaRepository;
import com.irontech.ironfood.domain.repository.FormaPagamentoRepository;

@Component
public class FormaPagamentoRepositoryJPA implements FormaPagamentoRepository {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<FormaPagamento> listar() {
		TypedQuery<FormaPagamento> query = manager.createQuery("from FormaPagamento", FormaPagamento.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public FormaPagamento salvar(FormaPagamento formaPagamento) {
		return manager.merge(formaPagamento);

	}
	
	@Override
	public FormaPagamento buscar(Long id) {
		return manager.find(FormaPagamento.class, id);
		
	}
	
	@Override
	@Transactional
	public void remover(FormaPagamento formaPagamento) {
		formaPagamento = buscar(formaPagamento.getId());
		manager.remove(formaPagamento);
		
	}
	 
	
	

}
