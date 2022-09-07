/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.phbchampws;

import br.com.irontech.modelo.Player;
import br.com.irontech.generico.ServicoGenerico;
import br.com.irontech.ws.PlayerWs;
import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.Endpoint;

/**
 *
 * @author andre
 */
public class PhbChampWs {
        
    public static void main(String[] args) {
        PlayerWs playerWs = new PlayerWs();
        String url = "http://localhost:8080/playerws";
        Endpoint.publish(url, playerWs);

        System.out.println("Testando PlayerWS " + playerWs.getPlayers().size());
    }
}
