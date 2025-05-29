public class Cliente extends Pessoa{
    private int cod;

    public Cliente(String nome, Data nascimento, int cod){
        super(nome, nascimento);
        this.cod = cod;
    }

    @Override
    public String imprimeDados() {
        Data nascimento = getNascimento();
        return String.format("Cliente %d = %s - %02d/%02d/%04d", this.cod, getNome(), nascimento.getDia(), 
        nascimento.getMes(), nascimento.getAno());
        
    }
}
