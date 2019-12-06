/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeestoquepapelaria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author LAB06-PC002
 */
public class ProdutosDAO {
    Connection conn;
        
    public ProdutosDAO(){
        conn=ConnectionFactory.getConnection(); 
    }
    
    public void atualizar(int id, int qtde) throws SQLException{//o metodo recebe o id e a qdte como parametro
        String sql="UPDATE Produtos SET quantidade=? WHERE id=?";//a "sql" é a variável que guarda a query
        PreparedStatement pstmt=conn.prepareStatement(sql);// o PreparedStatement é uma forma de você fazer uma inserção 
       pstmt.setInt(1, qtde);                              // no banco mais segura,onde você prepara os parametros para serem inseridos, 
        pstmt.setInt(2, id);                               // evitando assim ataques como o sql injection.
        pstmt.execute();
        pstmt.close();                                                    
    }
    
    public Integer buscarQuantidadeDeEstoque(int id){//o metodo recebe o id como parametro
        try{
            String sql="SELECT quantidade FROM produtos WHERE id=?";//a "sql" é a variável que guarda a query
            PreparedStatement pstmt=conn.prepareStatement(sql);// o PreparedStatement é uma forma de você fazer uma inserção
            pstmt.setInt(1, id);                               // no banco mais segura,onde você prepara os parametros para serem inseridos,
            ResultSet rs=pstmt.executeQuery();                 // evitando assim ataques como o sql injection.
            if(rs.next()){
                return rs.getInt("quantidade");
            }
                pstmt.close();
                return null;
            }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public ResultSet buscarTodosProdutos(){
        try{
            String sql="SELECT * FROM produtos";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs=pstmt.executeQuery();
            return rs;
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
