/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caelum.java.web01.teste;

import caelum.java.web01.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;



/**
 *
 * @author proto
 */
public class TestaConexao {
    
    public static void main(String[] args) throws SQLException {
        
        System.out.println("hi!");
        
        Connection conexao = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta");
        conexao.close();
        
    }
}
