package com.irontech.ironfood.domain.repository;

import java.util.List;

import com.irontech.ironfood.domain.model.Restaurante;

public interface RestauranteRepository {

	List<Restaurante> listar();
	Restaurante buscar(Long id);
	Restaurante salvar(Restaurante restaurante);
	void remover (Long id);
	

}
