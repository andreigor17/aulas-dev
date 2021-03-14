package br.com.foxstore.bean;

import br.com.foxstore.dao.DAO;
import br.com.foxstore.modelo.Autor;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class AutorBean {
    
    private Autor autor = new Autor();

	public Autor getAutor() {
		return autor;
	}

	public void gravar() {
		System.out.println("Gravando autor " + this.autor.getNome());

		new DAO<Autor>(Autor.class).adiciona(this.autor);
	}
}
    

