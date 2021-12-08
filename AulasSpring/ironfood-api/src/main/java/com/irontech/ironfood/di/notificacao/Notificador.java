package com.irontech.ironfood.di.notificacao;

import com.irontech.ironfood.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}