package com.irontech.ironfood.di.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.irontech.ironfood.di.modelo.Cliente;

@Profile("prod")
@TipoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {

	private boolean caixaAlta;
	
	public NotificadorEmail() {
		System.out.println("Notificador email REAL");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {		
		if(this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		System.out.printf("Notificando %s através do email %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
}
