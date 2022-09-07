/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.irontech.estoque.ws;

import javax.xml.ws.WebFault;

/**
 *
 * @author andre
 */
@WebFault(name = "AutorizaçãoFault")
public class AutorizacaoException extends Exception {

    public AutorizacaoException(String token_inválido) {
        super(token_inválido);
    }

    public String getFaultInfo() {
        return "Token inválido!";
    }

}
