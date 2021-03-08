package br.com.foxinline.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;



class Banco {
    
    private static List<Empresa> lista = new ArrayList();
    
    static{
       Empresa empresa = new Empresa();
       empresa.setNome("FoxInLine");
       Empresa empresa2 = new Empresa();
       empresa2.setNome("IronTech");
       lista.add(empresa);
       lista.add(empresa2);
        
    }

    

    public void adiciona(Empresa empresa) {
        Banco.lista.add(empresa);
    }
    
    public List<Empresa> getEmpresas(){
            return Banco.lista;
            
    }
}
