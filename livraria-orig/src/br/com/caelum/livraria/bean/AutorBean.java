package br.com.caelum.livraria.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.caelum.livraria.dao.DAO;
import br.com.caelum.livraria.modelo.Autor;


@ManagedBean
@ViewScoped
public class AutorBean {
	
	private Autor autor = new Autor();
	
	private Integer autorId;
	
	public Autor getAutor() {
		return autor;
	}
	
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String gravar() {
		System.out.println("Gravando autor " + this.autor.getNome());

		if(this.autor.getId() == null) {
			new DAO<Autor>(Autor.class).adiciona(this.autor);
			return "autor?faces-redirect=true";
		} else {
			new DAO<Autor>(Autor.class).atualiza(this.autor);	

		}
		
		this.autor = new Autor();
		return null;
		
		
	}
	
	public void removerAutor(Autor autor) {
		new DAO<Autor>(Autor.class).remove(autor);
	}
	
	public void carregar(Autor autor) {
		this.autor = autor;
	}
	
	public String formLivro() {
		System.out.println("Chamando o formulario do livro!");
		return "livro?faces-redirect=true";
	}

	public Integer getAutorId() {
		return autorId;
	}

	public void setAutorId(Integer autorId) {
		this.autorId = autorId;
	}
	
	public void carregarAutorPelaId() {
		this.autor = new DAO<Autor>(Autor.class).buscaPorId(autorId);
		
	}
	
	public List<Autor> getAutores() {
		return new DAO<Autor>(Autor.class).listaTodos();
	}
}
