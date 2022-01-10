package com.irontech.ironfood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.irontech.ironfood.domain.exception.EntidadeEmUsoException;
import com.irontech.ironfood.domain.exception.EntidadeNaoEncontradaException;
import com.irontech.ironfood.domain.model.Cozinha;
import com.irontech.ironfood.domain.model.Restaurante;
import com.irontech.ironfood.domain.repository.CozinhaRepository;
import com.irontech.ironfood.domain.repository.RestauranteRepository;

@Service
public class CadastroRestauranteService {

	@Autowired
	private RestauranteRepository restauranteRepository;
	@Autowired
	private CozinhaRepository cozinhaRepository;

	public Restaurante salvar(Restaurante restaurante) {
		Long cozinhaId = restaurante.getCozinha().getId();
		Cozinha cozinha = cozinhaRepository.buscar(cozinhaId);
		
		if(cozinha == null) {
			throw new EntidadeNaoEncontradaException(
					String.format("Não existe cozinha com o id %d cadastrada!", cozinhaId));
		}
		restaurante.setCozinha(cozinha);
		return restauranteRepository.salvar(restaurante);

	}

	public void excluir(Long restauranteId) {
		try {
			restauranteRepository.remover(restauranteId);
			
		} catch (EmptyResultDataAccessException e) {
			throw new EntidadeNaoEncontradaException(
					String.format("Restaurante de código %d não econtrada!", restauranteId));
			
		} catch (DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException(
					String.format("Restaurante de código %d não pode ser removida, pois esta em uso", restauranteId));
		}
	}
}
