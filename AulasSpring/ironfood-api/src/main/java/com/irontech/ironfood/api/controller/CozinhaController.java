package com.irontech.ironfood.api.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.irontech.ironfood.domain.exception.EntidadeEmUsoException;
import com.irontech.ironfood.domain.exception.EntidadeNaoEncontradaException;
import com.irontech.ironfood.domain.model.Cozinha;
import com.irontech.ironfood.domain.repository.CozinhaRepository;
import com.irontech.ironfood.domain.service.CadastroCozinhaService;

@RestController
@RequestMapping(value = "/cozinhas")
public class CozinhaController {

	@Autowired
	private CozinhaRepository cozinhaRepository;
	@Autowired
	private CadastroCozinhaService cadastroCozinha;

	@GetMapping()
	public List<Cozinha> listar() {
		return cozinhaRepository.listar();
	}

	@GetMapping("/{cozinhaId}")
	public ResponseEntity<Cozinha> buscar(@PathVariable Long cozinhaId) {
		Cozinha cozinha = cozinhaRepository.buscar(cozinhaId);
		if (cozinha != null) {
			return ResponseEntity.status(HttpStatus.OK).body(cozinha);
		} else {
			return ResponseEntity.notFound().build();
		}

	}

	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public Cozinha adicionar(@RequestBody Cozinha cozinha) {
		return cadastroCozinha.salvar(cozinha);

	}

	@PutMapping("/{cozinhaId}")
	public ResponseEntity<Cozinha> atualizar(@PathVariable Long cozinhaId, @RequestBody Cozinha cozinha) {
		Cozinha c = cozinhaRepository.buscar(cozinhaId);
		if (c != null) {
//		c.setNome(cozinha.getNome());
			BeanUtils.copyProperties(cozinha, c, "id");

			cadastroCozinha.salvar(c);
			return ResponseEntity.ok(c);
		}
		
		return ResponseEntity.notFound().build();

	}

	@DeleteMapping("/{cozinhaId}")
	public ResponseEntity<Cozinha> remover(@PathVariable Long cozinhaId) {
		try {
			cadastroCozinha.excluir(cozinhaId);
			return ResponseEntity.noContent().build();

		} catch (EntidadeNaoEncontradaException e) {
			return ResponseEntity.notFound().build();

		} catch (EntidadeEmUsoException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}

	}
}