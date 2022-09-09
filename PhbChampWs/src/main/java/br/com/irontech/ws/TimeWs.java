/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.irontech.ws;

import br.com.irontech.modelo.Player;
import br.com.irontech.modelo.Time;
import br.com.irontech.servico.TeamServico;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author andre
 */
@WebService
public class TimeWs {

    private TeamServico teamServico = new TeamServico();

    @WebMethod(operationName = "TodosOsTimes")
    @WebResult(name = "times")
    public List<Time> getTimes() {
        List<Time> times = new ArrayList<>();
        times = teamServico.pesquisar();
        for (Time t : times) {
            t.setPlayers(teamServico.playersPorTime(t));
            System.out.println("size " + t.getPlayers().size());
        }
        return times;

    }

}
