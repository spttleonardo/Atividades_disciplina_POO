public class Principal {
    public static void main(String[] args) {
        Bicicleta b = new Bicicleta(182, "Kaloi", 120.0f, 20, 7, true);
        Moto      m = new Moto(182, "Suzuki", 120.0f, 20, 7, 350);
        Automovel a = new Automovel(1, "Fiesta",  4f, 5,      100f, false);
        Onibus    o = new Onibus(2, "Mercedes",  40, 8f,     30, 2, 200f);
        Caminhao  c = new Caminhao(3, "Volvo",    5000f, 24f, 3,   500f);

        System.out.println("Codigo Bicicleta: "  + b.getCodigo() + " Nome: " + b.getNome() + " Capacidade em Kg: " + b.getCapacidadeKg()
        +" fator de custo da alocação: "+ b.fatorCustoAlocacao());
        System.out.println("Codigo Moto: " + m.getCodigo() + " Nome: " + m.getNome() + " Capacidade em Kg: " + m.getCapacidadeKg()
        + " fator de custo da alocação: " + m.fatorCustoAlocacao());
        System.out.println("Codigo Automóvel: " + a.getCodigo() + " Nome: " + a.getNome() + " Numero maximo de pessoa: " + a.getNumeroMaximoPessoas()
        + " fator de custo da alocação: " + a.fatorCustoAlocacao());
        System.out.println("Codigo Ônibus: "  + o.getCodigo() + " Nome: " + o.getNome() + " Numero maximo de pessoa: " + o.getNumeroMaximoPessoas()
        + " fator de custo da alocaçãoo: " + o.fatorCustoAlocacao());
        System.out.println("Caminhão: " +c.getCodigo()+ " Nome: " + c.getNome() + " Numero maximo de pessoa: " + c.getCapacidadeKg()
        + " fator de custo da alocação: " + c.fatorCustoAlocacao());
    }
}
