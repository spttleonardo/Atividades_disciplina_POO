public class CadastroPessoa {
    private int qtdAtual;
    private Pessoa[] p;

    public CadastroPessoa(int capacidade){
        this.p = new Pessoa[capacidade];
        this.qtdAtual = 0;
    }

    public void cadastraPessoa(Pessoa pess){    
        if (this.qtdAtual >= this.p.length) {
            throw new RuntimeException("Cadastro cheio!");
        }
        this.p[this.qtdAtual] = pess;
        this.qtdAtual++;
    }

    public void imprimeCadastro() {
        if (qtdAtual == 0) {
            System.out.println("Nenhuma pessoa cadastrada.");
        }
        for (int i = 0; i < this.qtdAtual; i++) {
            System.out.println(this.p[i].imprimeDados());
        }
    }

}
