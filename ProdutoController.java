/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeestoquepapelaria.controller;

import controledeestoquepapelaria.dao.ProdutosDAO;
import controledeestoquepapelaria.view.BaixarProdutosView;
import controledeestoquepapelaria.view.InserirProdutosView;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB06-PC002
 */
public class ProdutoController {
    public void Inserir(int id, int qtde){//o metodo é void não possue retorno e recebe as variáveis do Inserir ou baixar na mesma ordem isto é as variáveis "int id" e "int qtde" vão receber as variáveis que o usuario digitar nessa ordem sendo "código" para "id" e "quantidade" para "qtde"
        
        try{
            ProdutosDAO produtosDAO = new ProdutosDAO();;//Aqui é instanciado o ProdutoDAO onde é realizado a conexeção com o banco
            Integer quantidadeDeEstoque;//É criada uma variável
            quantidadeDeEstoque = produtosDAO.buscarQuantidadeDeEstoque(id);//A variável recebe a quantidade que possue em estoque
            if(quantidadeDeEstoque != null){//o if verifica se esta diferente de vazio
                produtosDAO.atualizar(id, qtde + quantidadeDeEstoque);//Se não estiver vazio chama o metodo atualizar e imprimi a mensagem
                JOptionPane.showMessageDialog(null, "Estoque atualizado","Operação Confirmada", JOptionPane.INFORMATION_MESSAGE);
            }else{//Caso o estoque esteja vazio 
                JOptionPane.showMessageDialog(null, "Código Inválido", "Operação Incorreta", JOptionPane.ERROR);
            }
            //limparCampos();
        }catch (SQLException ex){
            Logger.getLogger(InserirProdutosView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Código Inválido", "Operação Incorreta", JOptionPane.ERROR);
        }
    }
    
    public void Baixar(int id, int qtde){
        try{
            ProdutosDAO produtosDAO = new ProdutosDAO();//Aqui é instanciado o ProdutoDAO onde é realizado a conexeção com o banco
        Integer quantidadeDeEstoque;//É criada uma variável
        quantidadeDeEstoque = produtosDAO.buscarQuantidadeDeEstoque(id);//A variável recebe a quantidade que possue em estoque
        if(quantidadeDeEstoque < qtde){//o if verifica se esta zerado
            JOptionPane.showMessageDialog(null,"Verificar o estoque, operação não realizada", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }else if(quantidadeDeEstoque != null){//o if verifica se esta diferente de vazio
            produtosDAO.atualizar(id, quantidadeDeEstoque - qtde);//Se não estiver vazio chama o metodo atualizar e imprimi a mensagem
            JOptionPane.showMessageDialog(null, "Estoque atualizado", "Sucesso", JOptionPane.OK_OPTION);
            
        }
        //limparCampos();
        }catch(SQLException ex){
            Logger.getLogger(BaixarProdutosView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Digite valores numéricos", "Erro", JOptionPane.ERROR);
        }
    }
}
