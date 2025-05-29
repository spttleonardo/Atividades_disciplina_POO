public abstract class NumMaxPessoa extends Transporte {
    private int numeroMaximoPessoas;

    public NumMaxPessoa(){}

    public NumMaxPessoa(int codigo, String nome, int numeroMaximoPessoas, float tempoLocacao, float kmRodado){ 
    super(codigo, nome, tempoLocacao, kmRodado);
    this.numeroMaximoPessoas = numeroMaximoPessoas;
    }

    public void setNumeroMaximoPessoa(int numeroMaximoPessoas){
        this.numeroMaximoPessoas = numeroMaximoPessoas;
    }

    public int getNumeroMaximoPessoas(){
        return numeroMaximoPessoas;
    }

}
