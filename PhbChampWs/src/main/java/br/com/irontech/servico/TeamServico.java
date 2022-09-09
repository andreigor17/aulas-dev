/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.irontech.servico;

import br.com.irontech.generico.ServicoGenerico;
import br.com.irontech.modelo.Player;
import br.com.irontech.modelo.Time;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author andre
 */
@Stateless
public class TeamServico extends ServicoGenerico<Time> {

    public TeamServico() {
        super(Time.class);
    }

    public void salvar(Time time) {
        if (time.getId() == null) {
            save(time);
        } else {
            update(time);
        }
    }

    public List<Time> pesquisar() {

        String sql = "select p from Time p ";

        Query query = getEntityManager().createQuery(sql);

        return query.getResultList();

    }
    
    public List<Player> playersPorTime(Time time) {
        String sql = "select p from Player p where p.time = :time";

        Query query = getEntityManager().createQuery(sql);

        if (time != null && time.getId() != null) {
            query.setParameter("time", time.getId());
        }

        return query.getResultList();
    }

}
