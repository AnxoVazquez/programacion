/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import javax.swing.JOptionPane;

/**
 *
 * @author avazquezsuarez
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double euros;
        double cambio;
        double dolares;
        euros= Float.parseFloat(JOptionPane.showInputDialog("introduzca los euros"));
        cambio= Float.parseFloat(JOptionPane.showInputDialog("introduzca el cambio"));
        
        dolares= euros*cambio;
        JOptionPane.showMessageDialog(null, dolares);
    }
   
}
