package com.irontech.ironfood.domain.repository;

import java.util.List;

import com.irontech.ironfood.domain.model.Cozinha;
import com.irontech.ironfood.domain.model.FormaPagamento;

public interface FormaPagamentoRepository {

	List<FormaPagamento> listar();
	FormaPagamento buscar(Long id);
	FormaPagamento salvar(FormaPagamento formaPagamento);
	void remover (FormaPagamento formaPagamento);
	

}
