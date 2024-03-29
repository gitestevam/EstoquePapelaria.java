/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeestoquepapelaria.view;

import controledeestoquepapelaria.controller.ProdutoController;

/**
 *
 * @author LAB06-PC002
 */
public class InserirProdutosView extends javax.swing.JPanel {

    /**
     * Creates new form InserirProdutosView
     */
    public InserirProdutosView() {
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

        labelInserirProdutos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textfieldCodigo = new javax.swing.JTextField();
        textfieldQuantidade = new javax.swing.JTextField();
        buttonInserir = new javax.swing.JButton();
        buttonLimpar = new javax.swing.JButton();

        labelInserirProdutos.setText("Inserir Produtos");

        jLabel1.setText("Código:");

        jLabel2.setText("Quantidade:");

        buttonInserir.setText("Inserir");
        buttonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInserirActionPerformed(evt);
            }
        });

        buttonLimpar.setText("Limpar");
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelInserirProdutos)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonInserir)
                            .addGap(90, 90, 90)
                            .addComponent(buttonLimpar))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textfieldQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                .addComponent(textfieldCodigo)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelInserirProdutos)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(textfieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textfieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLimpar)
                    .addComponent(buttonInserir))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        limparCampos();//chama o metodo para limpar que se encontra um pouco mais a baixo
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void buttonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInserirActionPerformed
        ProdutoController produtoController = new ProdutoController();//instancia a classe produtoController
        produtoController.Inserir((Integer.parseInt(textfieldCodigo.getText())),Integer.parseInt(textfieldQuantidade.getText()));//aqui é passado as variáveis digitadas
    }//GEN-LAST:event_buttonInserirActionPerformed
    private void limparCampos(){//metodo que limpa os campos
        textfieldCodigo.setText("");
        textfieldQuantidade.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonInserir;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelInserirProdutos;
    private javax.swing.JTextField textfieldCodigo;
    private javax.swing.JTextField textfieldQuantidade;
    // End of variables declaration//GEN-END:variables
}
