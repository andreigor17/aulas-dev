/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.irontech.servico;

/**
 *
 * @author andre
 */


import br.com.irontech.generico.ServicoGenerico;
import java.util.List;
import javax.persistence.Query;

import br.com.irontech.modelo.Player;
import javax.ejb.Stateless;

@Stateless
public class PlayerServico extends ServicoGenerico<Player>{

    private Player player;

    public void instanciar(){
        this.player =  new Player();

    }

    public PlayerServico(){
        super(Player.class);
    }

     public void salvar(Player player) {
        if (player.getId() == null) {
            save(player);
        } else {
            update(player);
        }
    }



    public List<Player> pesquisar() {

        String sql = "select p from Player p ";

        Query query = getEntityManager().createQuery(sql);        

        return query.getResultList();

    }


    public List<Player> autoCompletePessoa() {
        return buscaPlayers();
    }

    private List<Player> buscaPlayers() {
        String sql = "select player from Player player where player.ativo = true";
        Query query = getEntityManager().createQuery(sql);
        return query.getResultList();
    }
    
}
