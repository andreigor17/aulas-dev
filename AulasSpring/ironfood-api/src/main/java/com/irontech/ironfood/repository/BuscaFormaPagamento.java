package com.irontech.ironfood.repository;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.irontech.ironfood.IronfoodApiApplication;
import com.irontech.ironfood.domain.model.Cozinha;
import com.irontech.ironfood.domain.model.FormaPagamento;
import com.irontech.ironfood.domain.repository.CozinhaRepository;
import com.irontech.ironfood.domain.repository.FormaPagamentoRepository;

public class BuscaFormaPagamento {

	public static void main(String args[]) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(IronfoodApiApplication.class)
				.web(WebApplicationType.NONE).run(args);

		FormaPagamentoRepository formaPagamentoRepository = applicationContext.getBean(FormaPagamentoRepository.class);

		FormaPagamento formPag = formaPagamentoRepository.buscar(1L);
		System.out.println("Forma de pagamento: " + formPag.getDescricao());
	}

}
