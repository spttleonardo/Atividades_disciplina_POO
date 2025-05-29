public class Moto extends Capacidade {
    private int cilindrada;

    public Moto(){

    }

    public Moto(int codigo, String nome, float capacidadeKg, float tempolocacao, float kmrodado, int cilindrada){
        super(codigo, nome,capacidadeKg, tempolocacao, kmrodado);
        this.cilindrada = cilindrada;
    }
    

        // Getter e Setter para cilindrada
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double fatorCustoAlocacao() {
        return this.getTempolocacao()*this.getKmrodado()*this.getCilindrada();
    }


}
