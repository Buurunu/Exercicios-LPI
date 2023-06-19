
package Data;


public class Data {
    
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (conferirData (dia,mes,ano)==true){
        
    
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    else
    {
        this.dia = 0;
        this.mes = 0;
        this.ano = 0;
    }
    }
    public boolean conferirData (int dia, int mes,int ano){
        if ((dia >0) && (dia<=31) && (mes>0) && (mes <=12) && (ano>=1) && (ano<=2023))
             return true;
        else
            return false;
    }
    
    public String DisplayData (){
        return this.dia+"/"+this.mes+"/"+this.ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
}
