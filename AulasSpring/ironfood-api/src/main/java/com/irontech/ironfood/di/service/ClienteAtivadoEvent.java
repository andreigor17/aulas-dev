package com.irontech.ironfood.di.service;

import com.irontech.ironfood.di.modelo.Cliente;

public class ClienteAtivadoEvent {
	
	 private Cliente cliente;

	public ClienteAtivadoEvent(Cliente cliente) {		
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}


}
