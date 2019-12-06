/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeestoquepapelaria.dao;

import java.sql.*;

public class ConnectionFactory {
    private static final String URL = "jdbc:postgresql://localhost:5434/BDControleEstoquePapelaria";
    private static String USER = "UserControleDeEstoquePapelaria";
    private static final String PASS = "123456";
    
    public static Connection getConnection(){
        
        try{
            System.out.print("Conectado!");
            return DriverManager.getConnection(URL, USER, PASS);
        }
        catch(SQLException e){
            throw new RuntimeException (e);
        }
    }
}
