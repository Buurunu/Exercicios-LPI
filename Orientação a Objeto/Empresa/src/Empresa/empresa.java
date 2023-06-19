
package Empresa;
import javax.swing.JOptionPane;
public class empresa {

   
    private String nome;
    private double salario;
    private int admicao;
    private int sexo;

    
   //public empresa(String nome, double salario, int admicao, int sexo) {
        //this.nome = nome;
        //this.salario = salario;
        //this.sexo = sexo;
       // this.admicao = admicao;
        //}




    public String Display( empresa funcionario) {
        return "Nome: "+this.nome+"\nSexo: "+this.sexo+"\nSalario: "+this.salario+"\nAno de admicao: "+this.admicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAdmicao() {
        return admicao;
    }

    public void setAdmicao(int admicao) {
        this.admicao = admicao;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    
    
    public void getHoraExtra (empresa funcionario) {
        int diasTrampados = Integer.parseInt(JOptionPane.showInputDialog(null, "informe quantos sabados foram trabalhados"));
        double salario_Extra = (salario/220)*diasTrampados;
        JOptionPane.showMessageDialog(null, "o valor do salario extra é: " +salario_Extra);
    }

       
    public void getAuxlioCreche (empresa funcionario){
        int filhos = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de filhos "));
        if (sexo == 1){
        double auxilio_C = ((salario*0.05)*filhos);
        JOptionPane.showMessageDialog(null,"seu auxilio creche é no valor de: "+auxilio_C);
        
        }
        else{
           JOptionPane.showMessageDialog(null, "auxlio indisponivel" );
           }
    }
        
    public void getSalarioMensal_e_Anual (empresa funcionario){
        int domingos_e_Feriados = Integer.parseInt(JOptionPane.showInputDialog(null, "informe a quantidade de dias trabalhos, sendo domingos e feriados"));
        double auxilio_C = ((salario*0.05));
        double domFeri = ((salario/30)*domingos_e_Feriados);  
        double totalMensal = (salario+domFeri+auxilio_C);
        double totalMensalSemAux = (salario+domFeri);
        if (sexo == 1){
            JOptionPane.showMessageDialog(null,"sua saldo mensal é: "+totalMensal);
        }else{
            JOptionPane.showMessageDialog(null,"sua saldo mensal é: "+totalMensalSemAux);
        }
    if (sexo == 1){
            JOptionPane.showMessageDialog(null,"seu saldo Anual é: "+totalMensal*12);
        }else{
            JOptionPane.showMessageDialog(null,"sua saldo Anual é: "+totalMensalSemAux*12);
        }
    }    
      

}

  
