/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Suprimentos;
import javax.swing.JOptionPane;
/**
 *
 * @author Burunu
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String numero = JOptionPane.showInputDialog(null, "numero do pedido");
        String descricao = JOptionPane.showInputDialog(null, "Descrição do pedido");
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de itens"));
        double preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Preço do item"));
        
        Invoice Ivo1 = new Invoice(numero, descricao, quantidade, preco);
        
        Ivo1.getInvoiceAmount();
        
        
        
    }
    
    
}
