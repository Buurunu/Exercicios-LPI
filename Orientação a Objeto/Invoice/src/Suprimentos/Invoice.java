/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suprimentos;
import javax.swing.JOptionPane;
/**
 *
 * @author Burunu
 */
public class Invoice {

    
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;
    
    
    public Invoice(String numero, String descricao, int quantidade, double preco) {
        if (quantidade >0 && preco >0){
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
        }
        else if (quantidade<=0 && preco>=0){
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = 0;
        this.preco = preco;
        }
        else if (preco<=0 && quantidade>=0){
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = 0.0;
        }
        else{
            this.numero = numero;
            this.descricao = descricao;
            this.quantidade = 00;
            this.preco = 0.0; 
        }
    }
    
    public void getInvoiceAmount(){
        double fatura =(quantidade*preco);
        JOptionPane.showMessageDialog(null, "Numero do pedido: "+this.numero+"\nDescrição do item: "+descricao+"\nQuantidade: "+quantidade+"\nPreço : "+preco+"R$"+"\nFatura total: "+fatura+"R$"); 
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
          return quantidade;
    }


    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;   
        }


    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
