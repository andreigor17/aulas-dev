/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.irontech.ws;

import br.com.irontech.modelo.Player;
import br.com.irontech.servico.PlayerServico;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author andre
 */
@WebService
public class PlayerWs {
    
    
    public List<Player> getPlayers(){
        PlayerServico playerServico = new PlayerServico();
        Player player = new Player();
        System.out.println("Retornando Players");
        List<Player> players = playerServico.pesquisar();
        return players;
    }
    
}
