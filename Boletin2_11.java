/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_11;

import javax.swing.JOptionPane;

/**
 *
 * @author avazquezsuarez
 */
public class Boletin2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float sueldo,sueldototal,comision,km;
        int dietas;
        
        sueldo= Float.parseFloat(JOptionPane.showInputDialog("introduzca el sueldo base"));
        comision= Float.parseFloat(JOptionPane.showInputDialog("introduzca el numero de ventas"));
        km= Float.parseFloat(JOptionPane.showInputDialog("introduzca la cantidad de Km que ha recorrido"));
        dietas= Integer.parseInt(JOptionPane.showInputDialog("introduzca los dias de desplazamiento"));
        
        sueldototal= (sueldo+(comision*5/100)+(2*km)+(dietas*30))- 36;
        JOptionPane.showMessageDialog(null,"Sueldo total es de: "+ sueldototal);
    }
    
}
