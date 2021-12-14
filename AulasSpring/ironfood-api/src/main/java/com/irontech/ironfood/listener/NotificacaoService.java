package com.irontech.ironfood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.irontech.ironfood.di.notificacao.NivelUrgencia;
import com.irontech.ironfood.di.notificacao.Notificador;
import com.irontech.ironfood.di.notificacao.TipoNotificador;
import com.irontech.ironfood.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	
	@TipoNotificador(NivelUrgencia.NORMAL)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		System.out.println("Cliente " + event.getCliente().getNome() + " agora esta ativo!");
		 notificador.notificar(event.getCliente(), "Cliente notificado com sucesso!");	
		
	}

}
