package com.irontech.ironfood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.irontech.ironfood.domain.exception.EntidadeEmUsoException;
import com.irontech.ironfood.domain.exception.EntidadeNaoEncontradaException;
import com.irontech.ironfood.domain.model.Cozinha;
import com.irontech.ironfood.domain.repository.CozinhaRepository;

@Service
public class CadastroCozinhaService {

	@Autowired
	private CozinhaRepository cozinhaRepository;

	public Cozinha salvar(Cozinha cozinha) {

		return cozinhaRepository.salvar(cozinha);

	}

	public void excluir(Long cozinhaId) {
		try {
			cozinhaRepository.remover(cozinhaId);
			
		} catch (EmptyResultDataAccessException e) {
			throw new EntidadeNaoEncontradaException(
					String.format("Cozinha de código %d não econtrada!", cozinhaId));
			
		} catch (DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException(
					String.format("Cozinha de código %d não pode ser removida, pois esta em uso", cozinhaId));
		}
	}
}
