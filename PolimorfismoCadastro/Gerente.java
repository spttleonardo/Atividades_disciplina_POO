public class Gerente extends Funcionario {

    private String area;
    
    public Gerente(String nome, Data nascimento, float salario) {
        super(nome, nascimento, salario);
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    @Override
    public float calculaImposto(){
        return (getSalario()*0.05f);
    }

    @Override
    public String imprimeDados() {
        Data nascimento = getNascimento();
        return String.format("Gerente %s - %02d/%02d/%04d - tem salario %f e seu imposto é: %f", getNome(), nascimento.getDia(), 
        nascimento.getMes(), nascimento.getAno(), getSalario(), calculaImposto());
        
    }


}
