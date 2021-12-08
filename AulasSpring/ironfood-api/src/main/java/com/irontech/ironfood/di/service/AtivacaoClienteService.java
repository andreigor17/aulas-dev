package com.irontech.ironfood.di.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.irontech.ironfood.di.modelo.Cliente;
import com.irontech.ironfood.di.notificacao.NivelUrgencia;
import com.irontech.ironfood.di.notificacao.Notificador;
import com.irontech.ironfood.di.notificacao.TipoNotificador;

@Component
public class AtivacaoClienteService {

	@TipoNotificador(NivelUrgencia.NORMAL)
	@Autowired
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Cadastro no sistema ativado!");

	}

}
