/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_8;

import javax.swing.JOptionPane;

/**
 *
 * @author avazquezsuarez
 */
public class Boletin2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gradoscent,gradoskelvin,gradosfahr;
     
        gradoscent = Double.parseDouble(JOptionPane.showInputDialog("introduzca los grados centígrados"));
        gradosfahr= (9*gradoscent/5)+32;
        gradoskelvin= gradoscent+273;
        
        JOptionPane.showMessageDialog(null,"Los grados Kelvin son: "+ gradoskelvin + " y los grados Fahrenheit son: "+ gradosfahr);
        
        
        
    }
    
}
