package com.irontech.ironfood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.irontech.ironfood.di.modelo.Cliente;
import com.irontech.ironfood.di.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacao;

	public MeuPrimeiroController(AtivacaoClienteService ativacao) {
		this.ativacao = ativacao;
		System.out.println("MeuPrimeiroController");
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente dede = new Cliente("Dede","86999647412","deruga@fox.com");
		
		ativacao.ativar(dede);
		
		return dede.getNome();
		 	

	}

}
