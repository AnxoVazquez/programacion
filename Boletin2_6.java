/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_6;

import javax.swing.JOptionPane;

/**
 *
 * @author avazquezsuarez
 */
public class Boletin2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float preciotarifa;
        float preciopagado;
        float descuento,descuento2;
        preciotarifa = Float.parseFloat(JOptionPane.showInputDialog("introduzca el precio de tarifa"));
        preciopagado= Float.parseFloat(JOptionPane.showInputDialog("introduzca el precio pagado"));
        descuento= (preciopagado*100)/preciotarifa;
        descuento2= 100-descuento;
        JOptionPane.showMessageDialog(null,"El porcentaje es: "+ descuento2 + " %");
    }
    
}
