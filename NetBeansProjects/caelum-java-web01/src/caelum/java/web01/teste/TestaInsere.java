/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caelum.java.web01.teste;

import caelum.java.web01.dao.ContatoDao;
import caelum.java.web01.model.Contato;
import java.util.Calendar;

/**
 *
 * @author proto
 */
public class TestaInsere {
    
    public static void main(String[] args) {
    
        Contato contato = new Contato();
        contato.setNome("Caelum");
        contato.setEmail("contato@caelum.com.br");
        contato.setEndereco("R. Vergueiro 10");
        contato.setDataNascimento(Calendar.getInstance());
        
        ContatoDao dao = new ContatoDao();
        
        dao.adiciona(contato);
        
        System.out.println("Gravado");
        
    }
}
