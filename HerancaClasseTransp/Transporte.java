public abstract class Transporte{

    private int codigo;
    private String nome;
    private float tempolocacao;
    private float kmrodado;

    public abstract double fatorCustoAlocacao();


    public Transporte(){

    }

    public Transporte(int codigo, String nome, float tempolocacao, float kmrodado){
        this.codigo = codigo;
        this.nome = nome;
        this.tempolocacao = tempolocacao;
        this.kmrodado = kmrodado;
    }

    // Getter e Setter para codigo
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    // Getter e Setter para tempolocacao
    public float getTempolocacao() {
        return tempolocacao;
    }

    public void setTempolocacao(float tempolocacao) {
        this.tempolocacao = tempolocacao;
    }

    // Getter e Setter para kmrodado
    public float getKmrodado() {
        return kmrodado;
    }

    public void setKmrodado(float kmrodado) {
        this.kmrodado = kmrodado;
    }


}