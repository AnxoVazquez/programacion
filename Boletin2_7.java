/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_7;

import javax.swing.JOptionPane;

/**
 *
 * @author avazquezsuarez
 */
public class Boletin2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nominal,porcentaje,anos,renta;
        nominal = Double.parseDouble(JOptionPane.showInputDialog("introduzca el nominal"));
        porcentaje= Double.parseDouble(JOptionPane.showInputDialog("introduzca el porcentaje"));
        anos = Double.parseDouble(JOptionPane.showInputDialog("introduzca los años"));
        renta= (nominal*Math.pow((1+porcentaje),anos)*porcentaje)/(Math.pow((porcentaje+1),anos)-1);
        JOptionPane.showMessageDialog(null,"La renta es: "+ renta + " euros");
    }
    
}
