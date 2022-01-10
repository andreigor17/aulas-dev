package com.irontech.ironfood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.irontech.ironfood.domain.exception.EntidadeEmUsoException;
import com.irontech.ironfood.domain.exception.EntidadeNaoEncontradaException;
import com.irontech.ironfood.domain.model.Estado;
import com.irontech.ironfood.domain.repository.EstadoRepository;

@Service
public class CadastroEstadoService {

	@Autowired
	private EstadoRepository estadoRepository;

	public Estado salvar(Estado estado) {

		return estadoRepository.salvar(estado);

	}

	public void excluir(Long estadoId) {
		try {
			estadoRepository.remover(estadoId);
			
		} catch (EmptyResultDataAccessException e) {
			throw new EntidadeNaoEncontradaException(
					String.format("Estado de código %d não econtrada!", estadoId));
			
		} catch (DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException(
					String.format("Estado de código %d não pode ser removida, pois esta em uso", estadoId));
		}
	}
}
