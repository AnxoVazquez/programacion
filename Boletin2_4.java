/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import javax.swing.JOptionPane;

/**
 *
 * @author avazquezsuarez
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n1,n2;
        float suma,resta,mult,div;
        n1= Float.parseFloat(JOptionPane.showInputDialog("introduzca el primer numero"));
        n2= Float.parseFloat(JOptionPane.showInputDialog("introduzca el segundo numero"));
        
        suma= n1+n2;
        resta= n1-n2;
        mult= n1*n2;
        div= n1/n2;
        
        JOptionPane.showMessageDialog(null,"Suma: "+ suma);
        JOptionPane.showMessageDialog(null,"Resta: "+ resta);
        JOptionPane.showMessageDialog(null,"Multiplicación: "+ mult);
        JOptionPane.showMessageDialog(null,"División: "+ div);
    }
    
}
