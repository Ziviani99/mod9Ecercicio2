package entities;

public class Companhia extends Contribuintes{
    
    private Integer numeroFuncionarios;
    
    public Companhia(){
    }

    public Companhia(String name, Double rendaAnual, Integer numeroFuncionarios) {
        super(name, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double calculoImposto(){
        double imposto = 0;
        if(numeroFuncionarios <= 10){
            imposto = rendaAnual * 0.16;
        }
        else{
            imposto = rendaAnual * 0.14;
        }
        return imposto;
    }
}
