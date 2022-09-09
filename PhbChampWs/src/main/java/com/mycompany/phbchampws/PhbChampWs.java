/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.phbchampws;

import br.com.irontech.ws.PlayerWs;
import br.com.irontech.ws.TimeWs;
import javax.xml.ws.Endpoint;

/**
 *
 * @author andre
 */
public class PhbChampWs {
        
    public static void main(String[] args) {
        //PlayerWs playerWs = new PlayerWs();
        TimeWs timeWs = new TimeWs();
        String url = "http://localhost:8080/timeWs";
        Endpoint.publish(url, timeWs);


    }
}
