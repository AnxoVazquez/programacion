/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

import javax.swing.JOptionPane;

/**
 *
 * @author avazquezsuarez
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float MILLA= 1852;
        float millas;
        float metros;
        millas = Float.parseFloat(JOptionPane.showInputDialog("introduzca el numero de millas"));
        metros= millas* MILLA;
        JOptionPane.showMessageDialog(null,"Son "+ metros + " metros");
    }
    
}
