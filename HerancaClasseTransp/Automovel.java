public class Automovel extends NumMaxPessoa{
    private boolean arCondicionado;

    public Automovel() {
        super();
    }

    public Automovel(int codigo,String nome,float tempoLocacao,int numeroMaximoPessoas,float kmRodado,
        boolean arCondicionado)
    {
        super(codigo, nome,numeroMaximoPessoas, tempoLocacao, kmRodado);
        this.arCondicionado = arCondicionado;
    }

    public boolean getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public double fatorCustoAlocacao() {
        double custo = this.getTempolocacao() * this.getKmrodado() * this.getNumeroMaximoPessoas(); 
        if (arCondicionado) {
            custo *= 1.2;
        }
        return custo;
    }
}