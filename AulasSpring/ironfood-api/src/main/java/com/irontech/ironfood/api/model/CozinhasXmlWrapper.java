package com.irontech.ironfood.api.model;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.irontech.ironfood.domain.model.Cozinha;

@JacksonXmlRootElement(localName = "cozinhas")
public class CozinhasXmlWrapper {
	
	public CozinhasXmlWrapper(List<Cozinha> cozinhas) {
		this.cozinhas = cozinhas;
	}
	
	@JacksonXmlProperty(localName = "cozinha")
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Cozinha> cozinhas;

	public List<Cozinha> getCozinhas() {
		return cozinhas;
	}

	public void setCozinhas(List<Cozinha> cozinhas) {
		this.cozinhas = cozinhas;
	}
	
	

}
