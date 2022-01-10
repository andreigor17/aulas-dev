package com.irontech.ironfood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.irontech.ironfood.domain.model.Cidade;
import com.irontech.ironfood.domain.model.Cozinha;
import com.irontech.ironfood.domain.repository.CidadeRepository;

@Component
public class CidadeRepositoryJPA implements CidadeRepository {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Cidade> listar() {
		TypedQuery<Cidade> query = manager.createQuery("from Cidade", Cidade.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public Cidade salvar(Cidade cidade) {
		return manager.merge(cidade);

	}
	
	@Override
	public Cidade buscar(Long id) {
		return manager.find(Cidade.class, id);
		
	}
	
	@Override
	@Transactional
	public void remover(Long id) {
		Cidade cidade = buscar(id);
		manager.remove(cidade);
		
	}
	 
	
	

}
