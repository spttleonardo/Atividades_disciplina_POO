public class Divisao implements OperacoesMatematicas, MostraName, MostraSimbolo {

    private float a;
    private float b;

    public Divisao(){

    }

    public Divisao(float a, float b){
        this.a = a;
        this.b = b;
    }


    @Override
    public float calcula() {
        return a/b;
    }

    @Override
    public String MostraOpName() {
        return "Divisão";
    }

    @Override
    public String MostraOpSimbolo() {
        return "/";
    }
    
}
