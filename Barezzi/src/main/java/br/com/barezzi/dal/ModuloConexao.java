/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.barezzi.dal;
import java.sql.*;

/**
 *
 * @author gelso
 */
public class ModuloConexao {
    public static Connection conector(){
        java.sql.Connection conexao = null;
        // a linha abaixo "chama" o driver
        String driver = "com.mysql.jdbc.Driver";
        // Informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbbarezzi";
        String user = "root";
        String password = "";
        // estabelece a conexão com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //A linha abaixo serve para verificar o motivo da falha de comunicação com o BD
            //System.out.println(e);
            return null;
        }
                
    }
}
