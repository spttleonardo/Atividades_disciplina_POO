public abstract class Pessoa {
    private String nome;
    private Data nascimento;

    public abstract String imprimeDados();

    public Pessoa(String nome, Data nascimento){
        this.nome = nome;
        this.nascimento = new Data(nascimento);
    }

     // getters e setters
     public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(Data nascimento){
        this.nascimento = nascimento;
    }

    public Data getNascimento(){
        return nascimento;
    }
    

}
