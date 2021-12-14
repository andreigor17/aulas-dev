package com.irontech.ironfood.di.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.irontech.ironfood.di.modelo.Cliente;

@Profile("teste")
@TipoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmailMock implements Notificador {

	private boolean caixaAlta;
	
	public NotificadorEmailMock() {
		System.out.println("Notificador email DEV");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {		
		if(this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		System.out.printf("Mock: A notificação seria para o %s através do email %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
}
