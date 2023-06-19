
package Employer;

import javax.swing.JOptionPane;


public class Principal {


    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog(null, "informe seu nome");
        String sobrenome = JOptionPane.showInputDialog(null, "informe seu sobrenome");
        Double salarioMensal = Double.parseDouble(JOptionPane.showInputDialog(null, "informe seu salario"));
        
        Employee E1 = new Employee(nome, sobrenome, salarioMensal);
        JOptionPane.showMessageDialog(null,E1.DisplayEmployee());
        
    }
    
}
