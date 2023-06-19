/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carro1;

import javax.swing.JOptionPane;

/**
 *
 * @author Burunnu
 */
public class Carro1 {

    static void carro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @param args the command line arguments
     */
//   
//    
    public Carro1(String placa, String cor, int ano, double valor) {
        if (placa != null){
             this.placa = placa;
        }
       
        this.cor = cor;
        this.ano = ano;
        this.valor = valor;
    }
    
    private String placa;
    private String cor;
    private int ano;
    private double valor;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if( placa != null) {
            this.placa = placa;
        } else {
        JOptionPane.showMessageDialog(null,"entrada precisa do vlaor da placa");
        }
        
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void mostrarInfomacoesCarro(){
    
        JOptionPane.showMessageDialog(null,"Ano : \n" + ano + "Placa : \n " + placa+ " valor : \n"+ valor+ " cor :\n"+ cor );
    }
}
