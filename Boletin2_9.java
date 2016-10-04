/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_9;

import javax.swing.JOptionPane;

/**
 *
 * @author avazquezsuarez
 */
public class Boletin2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dinero,billetes100,billetes20,billetes5,monedas1;
        
        billetes100 = Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de billetes de 100 euros"));
        billetes20 = Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de billetes de 20 euros"));
        billetes5 = Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de billetes de 5 euros"));
        monedas1 = Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de monedas de 1 euro"));
        
        dinero= billetes100*100+billetes20*20+billetes5*5+monedas1;
        
        JOptionPane.showMessageDialog(null,"La suma de dinero es: "+ dinero + " euros");
    }
    
}
