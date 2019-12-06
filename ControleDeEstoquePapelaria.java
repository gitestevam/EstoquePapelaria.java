/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeestoquepapelaria;

import controledeestoquepapelaria.view.PrincipalView;

/**
 *
 * @author LAB06-PC002
 */
public class ControleDeEstoquePapelaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrincipalView principalView = new PrincipalView();
        principalView.validate();
        principalView.pack();
        principalView.setVisible(true);
    }
}
