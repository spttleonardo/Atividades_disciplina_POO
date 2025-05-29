public class Onibus extends NumMaxPessoa {
    private int numeroPessoasTransportadas;
    private int numeroEixos;

    public Onibus() {
        super();
    }

    public Onibus(int codigo,String nome, int numeroMaximoPessoas, float tempoLocacao, int numeroPessoasTransportadas,
        int numeroEixos,float kmRodado){ 
        super(codigo, nome, numeroMaximoPessoas, tempoLocacao, kmRodado);
        this.numeroPessoasTransportadas = numeroPessoasTransportadas;
        this.numeroEixos = numeroEixos;
    }

    public int getNumeroPessoasTransportadas() {
        return numeroPessoasTransportadas;
    }

    public void setNumeroPessoasTransportadas(int numeroPessoasTransportadas) {
        this.numeroPessoasTransportadas = numeroPessoasTransportadas;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }


    @Override
    public double fatorCustoAlocacao() {
    
        double razao = (double) this.getNumeroPessoasTransportadas()
                     / this.getNumeroMaximoPessoas();
        return this.getTempolocacao()
             * this.getKmrodado()
             * this.getNumeroEixos()
             * razao;
    }
}
