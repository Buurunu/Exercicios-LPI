
package Employer;

import javax.swing.JOptionPane;


public class Employee {
    
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    

    public Employee(String nome, String sobrenome, double salarioMensal) {
        if(salarioMensal >0){
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.salarioMensal = salarioMensal;
        }
        else
        {
            JOptionPane.showMessageDialog(null,nome+sobrenome+ "Salario inferior");
        }
    }
      

    
    
    public String DisplayEmployee (){
        return "Nome: "+this.nome+"\nSobrenome: "+this.sobrenome+"\nSalario mensal: "+this.salarioMensal;
    }
            

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {

        this.salarioMensal = salarioMensal;
    }
    
    }
    

