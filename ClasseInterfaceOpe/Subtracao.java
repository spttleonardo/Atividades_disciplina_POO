public class Subtracao implements OperacoesMatematicas, MostraName, MostraSimbolo{

    private float a;
    private float b;

    public Subtracao(){

    }

    public Subtracao(float a, float b){
        this.a = a;
        this.b = b;
    }

    @Override
    public float calcula() {
        return a-b;
    }

    @Override
    public String MostraOpName() {
        return "Subtração";
    }

    @Override
    public String MostraOpSimbolo() {
        return "-";
    }


    
}
