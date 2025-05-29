public class TesteCadastro {
    public static void main(String[] args) {
    CadastroPessoa cadastro = new CadastroPessoa(10);

    // cadastro cliente
    cadastro.cadastraPessoa(new Cliente( "João", new Data(1,1,1999), 182));

    // cadastro funcionario
    cadastro.cadastraPessoa(new Funcionario( "Leticia", new Data(3,12,2000), 1800.98f));

     // cadastro gerente
     cadastro.cadastraPessoa(new Funcionario( "Pedro", new Data(3,12,1990), 4000));

     cadastro.imprimeCadastro();

    }   
}
