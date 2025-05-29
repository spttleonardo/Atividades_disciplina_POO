public abstract  class Capacidade  extends Transporte {
    private float capacidadeKg; 

    public Capacidade(){

    }

    public Capacidade(int codigo, String nome, float capacidadeKg, float tempolocacao, float kmrodado){
        super(codigo,nome, tempolocacao, kmrodado );
        this.capacidadeKg = capacidadeKg;
    }

    public void setCapacidadeKg(float capacidadeKg){
        this.capacidadeKg = capacidadeKg;
    }

    public float getCapacidadeKg(){
        return capacidadeKg;
    }

}
