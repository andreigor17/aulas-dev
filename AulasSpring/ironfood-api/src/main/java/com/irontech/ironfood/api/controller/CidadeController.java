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
import org.springframework.web.bind.annotation.RestController;

import com.irontech.ironfood.domain.exception.EntidadeEmUsoException;
import com.irontech.ironfood.domain.exception.EntidadeNaoEncontradaException;
import com.irontech.ironfood.domain.model.Cidade;
import com.irontech.ironfood.domain.repository.CidadeRepository;
import com.irontech.ironfood.domain.repository.EstadoRepository;
import com.irontech.ironfood.domain.service.CadastroCidadeService;

@RestController
@RequestMapping("/cidades")
public class CidadeController {
	
	@Autowired
	public EstadoRepository estadoRespoRepository;
	@Autowired
	public CidadeRepository cidadeRepository;
	@Autowired
	public CadastroCidadeService cadastroCidade;
	
	@GetMapping
	public List<Cidade> cidades(){
		return cidadeRepository.listar();
	}
	
	@GetMapping("/{cidadeId}")
	public ResponseEntity<Cidade> buscar(@PathVariable Long cidadeId) {
		Cidade cidade = cidadeRepository.buscar(cidadeId);
		if (cidade != null) {
			return ResponseEntity.status(HttpStatus.OK).body(cidade);
		} else {
			return ResponseEntity.notFound().build();
		}

	}

	@PostMapping
	public ResponseEntity<?> adicionar(@RequestBody Cidade cidade) {
		try {
			cidade = cadastroCidade.salvar(cidade);
			return ResponseEntity.status(HttpStatus.CREATED).body(cidade);
		} catch (EntidadeNaoEncontradaException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}

	}

	@PutMapping("/{cidadeId}")
	public ResponseEntity<Cidade> atualizar(@PathVariable Long cidadeId,
			@RequestBody Cidade cidade) {
		try {
			Cidade c = cidadeRepository.buscar(cidadeId);
			if (c != null) {
				BeanUtils.copyProperties(cidade, c, "id");

				cadastroCidade.salvar(c);
				return ResponseEntity.ok(c);
			} else {
				return ResponseEntity.notFound().build();
			}
		} catch (EntidadeNaoEncontradaException e) {
			return ResponseEntity.notFound().build();
		}

	}

	@DeleteMapping("/{cidadeId}")
	public ResponseEntity<Cidade> remover(@PathVariable Long cidadeId) {
		try {
			cadastroCidade.excluir(cidadeId);
			return ResponseEntity.noContent().build();

		} catch (EntidadeNaoEncontradaException e) {
			return ResponseEntity.notFound().build();

		} catch (EntidadeEmUsoException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}

	}
	
	

}
