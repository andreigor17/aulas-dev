package com.irontech.ironfood.domain.repository;

import java.util.List;

import com.irontech.ironfood.domain.model.Cozinha;

public interface CozinhaRepository {

	List<Cozinha> listar();
	Cozinha buscar(Long id);
	Cozinha salvar(Cozinha cozinha);
	void remover (Long id);
	

}
