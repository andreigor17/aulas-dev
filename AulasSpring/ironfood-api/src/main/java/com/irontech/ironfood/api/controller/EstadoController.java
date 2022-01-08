package com.irontech.ironfood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irontech.ironfood.domain.model.Estado;
import com.irontech.ironfood.domain.repository.EstadoRepository;

@RestController
@RequestMapping("/estados")
public class EstadoController {
	
	@Autowired
	public EstadoRepository estadoRespoRepository;
	
	@GetMapping
	public List<Estado> estados(){
		return estadoRespoRepository.listar();
	}

}
