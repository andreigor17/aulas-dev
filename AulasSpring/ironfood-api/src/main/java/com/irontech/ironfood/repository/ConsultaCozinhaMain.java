package com.irontech.ironfood.repository;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.irontech.ironfood.IronfoodApiApplication;
import com.irontech.ironfood.domain.model.Cozinha;
import com.irontech.ironfood.domain.repository.CozinhaRepository;

public class ConsultaCozinhaMain {

	public static void main(String args[]) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(IronfoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		List<Cozinha> cozinhas = cozinhaRepository.listar();
		for(Cozinha cozinha : cozinhas) {
			System.out.println(cozinha.getNome());
		}
		
	}
	
}
