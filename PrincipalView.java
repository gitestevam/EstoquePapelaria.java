/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeestoquepapelaria.view;

import controledeestoquepapelaria.controller.RelatorioDeEstoque;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author LAB06-PC002
 */
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalView
     */
    public PrincipalView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelControleDeEstoquePapelaria = new javax.swing.JLabel();
        buttonInserirProdutos = new javax.swing.JButton();
        buttonBaixarProdutos = new javax.swing.JButton();
        buttonRelatorioDeEstoque = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        tabbedPaneCentral = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelControleDeEstoquePapelaria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelControleDeEstoquePapelaria.setText("Controle de Estoque Papelaria");

        buttonInserirProdutos.setText("Inserir Produto");
        buttonInserirProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInserirProdutosActionPerformed(evt);
            }
        });

        buttonBaixarProdutos.setText("Baixar Produto");
        buttonBaixarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBaixarProdutosActionPerformed(evt);
            }
        });

        buttonRelatorioDeEstoque.setText("Relatório de Estoque");
        buttonRelatorioDeEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRelatorioDeEstoqueActionPerformed(evt);
            }
        });

        buttonSair.setText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(labelControleDeEstoquePapelaria))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(buttonInserirProdutos)
                                .addGap(27, 27, 27)
                                .addComponent(buttonBaixarProdutos)
                                .addGap(43, 43, 43)
                                .addComponent(buttonRelatorioDeEstoque)
                                .addGap(42, 42, 42)
                                .addComponent(buttonSair)))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addComponent(tabbedPaneCentral, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelControleDeEstoquePapelaria)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonInserirProdutos)
                    .addComponent(buttonBaixarProdutos)
                    .addComponent(buttonRelatorioDeEstoque)
                    .addComponent(buttonSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPaneCentral, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        //O if imprime a caixa de dialogo para o usuario confirma se realmente deseja sair ou não e o YES_NO_OPTION e o parametro para dar continuidade caso o usario escolha o YES
        if(JOptionPane.showConfirmDialog(this, "Deseja realmente sair do sistema?", "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonInserirProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInserirProdutosActionPerformed
        tabbedPaneCentral.removeAll();
        tabbedPaneCentral.add("Inserir Produtos", new InserirProdutosView());//é onde aparece os campos para inserir produtos
        tabbedPaneCentral.validate();
        tabbedPaneCentral.repaint();
    }//GEN-LAST:event_buttonInserirProdutosActionPerformed

    private void buttonBaixarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBaixarProdutosActionPerformed
        tabbedPaneCentral.removeAll();
        tabbedPaneCentral.add("Baixar Produtos", new BaixarProdutosView());//é onde aparece os campos para inserir produtos
        tabbedPaneCentral.validate();
        tabbedPaneCentral.repaint();
    }//GEN-LAST:event_buttonBaixarProdutosActionPerformed

    private void buttonRelatorioDeEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRelatorioDeEstoqueActionPerformed
        try{
            Date data = new Date();
            DateFormat df = new SimpleDateFormat("dd_MM_yyyy");//Aqui ocorre a busca de data e hora
            RelatorioDeEstoque relatorioEstoque = new RelatorioDeEstoque("C:\\Relatórios"+df.format(data)+".pdf");//o caminho onde o relatório será gerado e motifica o nome que aparece no arquivo
            if(relatorioEstoque.geraRelatorio()){//Aqui a mensagem se foi gerado corretamente ou não o relatório
                JOptionPane.showMessageDialog(this, "Relatório gerado com sucesso! O relatório" + "gerado se encontra em C:\\Relatórios", "Sucesso", JOptionPane.OK_OPTION);
            }else{
                JOptionPane.showMessageDialog(this, "Relatório não gerado!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }catch (Exception e){
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_buttonRelatorioDeEstoqueActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBaixarProdutos;
    private javax.swing.JButton buttonInserirProdutos;
    private javax.swing.JButton buttonRelatorioDeEstoque;
    private javax.swing.JButton buttonSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelControleDeEstoquePapelaria;
    private javax.swing.JTabbedPane tabbedPaneCentral;
    // End of variables declaration//GEN-END:variables
}
