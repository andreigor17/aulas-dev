/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.irontech.estoque.ws;

import javax.xml.ws.Endpoint;

/**
 *
 * @author andre
 */
public class PublicaWebService {
    
    public static void main(String[] args) {
        
        EstoqueWS service = new EstoqueWS();
        String url = "http://localhost:8080/estoquews";
        
        Endpoint.publish(url, service);
    }
    
}
