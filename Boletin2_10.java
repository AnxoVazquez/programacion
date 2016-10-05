/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_10;

import javax.swing.JOptionPane;

/**
 *
 * @author avazquezsuarez
 */
public class Boletin2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dinero;
        int billete100=0;
        int billete20=0;
        int billete5=0;
        int monedas=0;
        
        dinero= Integer.parseInt(JOptionPane.showInputDialog("introduzca la cantidad de dinero"));
        
        if (dinero>=100){
            billete100=dinero/100;
            dinero= dinero%100;       
        }
        if (dinero>=20){
            billete20=dinero/20;
            dinero= dinero%20;       
        }
        if (dinero>=5){
            billete5=dinero/5;
            dinero= dinero%5;      
        }
        if (dinero>=1){
            monedas=dinero;     
        }
        JOptionPane.showMessageDialog(null,"Billetes de 100: "+ billete100 + ", billetes de 20: "+ billete20 + ", billetes de 5: "+ billete5 + " monedas de 1 euro: "+ monedas);
    }
    
}
