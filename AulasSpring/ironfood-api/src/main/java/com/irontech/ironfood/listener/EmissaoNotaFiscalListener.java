package com.irontech.ironfood.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.irontech.ironfood.di.service.ClienteAtivadoEvent;

@Component
public class EmissaoNotaFiscalListener {
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		System.out.println("Emitindo nota fiscal para o cliente " +  event.getCliente().getNome());
		
		
	}

}
