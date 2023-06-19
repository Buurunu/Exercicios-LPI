/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carro1;

import javax.swing.JOptionPane;



/**
 *
 * @author Burunnu
 */
public class CarroPrincipal {
     public static void main(String[] args) {
//        // TODO code application logic here
    
    String placa  = JOptionPane.showInputDialog(null, "digite placa: ");
      String cor  = JOptionPane.showInputDialog(null, "digite placa: ");
        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "digite placa: "));
         Double valor  = Double.parseDouble(JOptionPane.showInputDialog(null, "digite placa: "));
            
    Carro1 carro = new Carro1 (placa, cor, ano, valor);
    carro.mostrarInfomacoesCarro();
   
   
            
    }
    
}
