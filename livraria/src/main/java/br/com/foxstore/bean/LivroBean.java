/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.foxstore.bean;

import br.com.foxstore.dao.DAO;
import br.com.foxstore.modelo.Livro;
import javax.annotation.ManagedBean;



@ManagedBean
public class LivroBean {
    private Livro livro = new Livro();

	public Livro getLivro() {
		return livro;
	}

	public void gravar() {
		System.out.println("Gravando livro " + this.livro.getTitulo());

		if (livro.getAutores().isEmpty()) {
			throw new RuntimeException("Livro deve ter pelo menos um Autor.");
		}

		new DAO<Livro>(Livro.class).adiciona(this.livro);
	}
}
