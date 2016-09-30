/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1;

import javax.swing.JOptionPane;

/**
 *
 * @author avazquezsuarez
 */
public class Boletin2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float base;
        float altura;
        double area;
        
        base= Float.parseFloat(JOptionPane.showInputDialog("introduzca la base"));
        altura= Float.parseFloat(JOptionPane.showInputDialog("introduzca la altura"));
        
        area= (base*altura)/2;
        JOptionPane.showMessageDialog(null, area);
        
                
        
    }
    
}
