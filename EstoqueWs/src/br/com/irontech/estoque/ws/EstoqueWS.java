/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.irontech.estoque.ws;

import br.com.irontech.estoque.modelo.item.Filtro;
import br.com.irontech.estoque.modelo.item.Filtros;
import br.com.irontech.estoque.modelo.item.Item;
import br.com.irontech.estoque.modelo.item.ItemDao;
import br.com.irontech.estoque.modelo.item.ListaItens;
import br.com.irontech.estoque.modelo.usuario.TokenDao;
import br.com.irontech.estoque.modelo.usuario.TokenUsuario;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author andre
 */
@WebService
public class EstoqueWS {

    private ItemDao dao = new ItemDao();

    @WebMethod(operationName = "TodosOsItens")
    @WebResult(name = "itens")
    public ListaItens getItens(@WebParam(name = "filtros") Filtros filtros) {

        System.out.println("Chamando getItens()...");
        List<Filtro> lista = filtros.getLista();
        List<Item> itensResultado = dao.todosItens(lista);

        return new ListaItens(itensResultado);
    }

    @WebMethod(operationName = "CadastrarItem")
    @WebResult(name = "item")
    public Item cadastrarItem(@WebParam(name = "token", header = true) TokenUsuario token, @WebParam(name = "item")Item item) throws AutorizacaoException {

        System.out.println("Cadastrando item: " + item + " ,com token: " + token);

        boolean valido = new TokenDao().ehValido(token);
        if(!valido){
            throw new AutorizacaoException("Falha na autorização!");
        }
        this.dao.cadastrar(item);
        return item;
    }

}
