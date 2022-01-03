package com.irontech.ironfood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.irontech.ironfood.IronfoodApiApplication;
import com.irontech.ironfood.domain.model.Cozinha;
import com.irontech.ironfood.domain.model.Restaurante;
import com.irontech.ironfood.domain.repository.CozinhaRepository;
import com.irontech.ironfood.domain.repository.RestauranteRepository;

public class ConsultaRestauranteMain {

	public static void main(String args[]) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(IronfoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);
		List<Restaurante> restaurantes = restauranteRepository.listar();
		for(Restaurante rests : restaurantes) {
			System.out.printf("%s - %f - %s\n",rests.getNome(), rests.getTaxaFrete(), rests.getCozinha().getNome());
		}
		
	}
	
}
