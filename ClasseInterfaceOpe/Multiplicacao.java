public class Multiplicacao implements OperacoesMatematicas, MostraName, MostraSimbolo{

    private float a;
    private float b;

    public Multiplicacao(){

    }

    public Multiplicacao(float a, float b){
        this.a = a;
        this.b = b;
    }

    @Override
    public float calcula() {
        return a*b;
    }

    @Override
    public String MostraOpName() {
        return "Multiplicação";
    }

    @Override
    public String MostraOpSimbolo() {
        return "*";
    }
    
}
