/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.irontech.estoque.ws;

import br.com.irontech.estoque.modelo.item.Item;
import br.com.irontech.estoque.modelo.item.ItemDao;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author andre
 */
@WebService
public class EstoqueWS {
    
    private ItemDao dao = new ItemDao();
    
    public List<Item> getItens(){
        
        System.out.println("Chamando getItens()");
        List <Item> list = dao.todosItens();
        return list;
    }
    
}
