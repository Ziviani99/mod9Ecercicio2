package entities;

public class PessoaFisica extends Contribuintes{
    
    private Double gastosSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
        super(name, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }
    
    @Override
    public double calculoImposto(){
        double imposto = 0;
        if(rendaAnual < 20000.0 && gastosSaude > 0){
            rendaAnual = rendaAnual * 0.15;
            gastosSaude = gastosSaude * 0.5;
            imposto = rendaAnual - gastosSaude;
        }
        else if(rendaAnual < 20000.0 && gastosSaude <= 0){
            rendaAnual = rendaAnual * 0.15;
            imposto = rendaAnual;
        }
        if(rendaAnual >= 20000.0 && gastosSaude > 0){
           rendaAnual = rendaAnual * 0.25;
           gastosSaude = gastosSaude * 0.5;
           imposto = rendaAnual - gastosSaude;
        }
        else{
            rendaAnual = rendaAnual * 0.25;
             imposto = rendaAnual;
        }
        return imposto;
    }
}
