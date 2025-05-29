public class Caminhao extends Capacidade {
    private int numeroEixos;

    public Caminhao() {
        super();
    }

    public Caminhao(int codigo,String nome,float capacidadeKg,float tempoLocacao,int numeroEixos,
        float kmRodado){
        super(codigo, nome,capacidadeKg, tempoLocacao, kmRodado);
        this.numeroEixos = numeroEixos;
    }


    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }


    @Override
    public double fatorCustoAlocacao() {
        return this.getTempolocacao()* this.getKmrodado()* this.getNumeroEixos();
    }
}
