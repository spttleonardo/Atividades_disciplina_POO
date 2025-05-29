public class Bicicleta extends Capacidade{
    private boolean eletrica;


    public Bicicleta(){

    }

    public Bicicleta(int codigo, String nome, float capacidadeKg, float tempolocacao, float kmrodado, boolean eletrica){
        super(codigo,nome, capacidadeKg, tempolocacao, kmrodado);
        this.eletrica = eletrica;
    }


    public void setEletrica(boolean eletrica){
        this.eletrica = eletrica;
    }

    public boolean getEletrica(){
        return eletrica;
    }


    @Override
    public double fatorCustoAlocacao() {
        
        if (!this.eletrica){
            return this.getTempolocacao() * this.getKmrodado();
        }
        else{
            return this.getTempolocacao() * this.getKmrodado()*2;
        }
    }

}
