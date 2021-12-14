package com.irontech.ironfood.di.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.irontech.ironfood.di.modelo.Cliente;
import com.irontech.ironfood.di.notificacao.NivelUrgencia;
import com.irontech.ironfood.di.notificacao.Notificador;
import com.irontech.ironfood.di.notificacao.TipoNotificador;

@Component
public class AtivacaoClienteService {

	@Autowired
	private ApplicationEventPublisher eventPublisher;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		// vamos dizer para o container que o cliente esta ativado no momento
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));

		

	}

}
