public class Funcionario extends Pessoa {
    private float salario;

    public Funcionario(String nome, Data nascimento, float salario){
        super(nome, nascimento);
        this.salario = salario;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }

    
    public float getSalario() {
        return salario;
    }

    public float calculaImposto(){
        return (this.salario*0.03f);
    }

    @Override
    public String imprimeDados() {
        Data nascimento = getNascimento();
        return String.format("Funcionario %s - %02d/%02d/%04d - tem salario %f e seu imposto é: %f", getNome(), nascimento.getDia(), 
        nascimento.getMes(), nascimento.getAno(), this.salario, calculaImposto());
        
    }
}
