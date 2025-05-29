public class Carta {
    private int numero;
    private String naipe;

    public Carta(int numero, String naipe){
        this.numero = numero;
        this.naipe = naipe;
    }

    public void Setnumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public void Setnaipe(String naipe){
        this.naipe = naipe;
    }

    public String getnaipe(){
        return this.naipe;
    }


}
