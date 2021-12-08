package com.irontech.ironfood.di.notificacao;

import org.springframework.stereotype.Component;

import com.irontech.ironfood.di.modelo.Cliente;

@TipoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {

	private boolean caixaAlta;

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
