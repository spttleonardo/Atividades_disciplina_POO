
public class Soma implements  OperacoesMatematicas, MostraName, MostraSimbolo{

    private float a;
    private float b;


    public Soma(){

    }

    public Soma(float a, float b){
        this.a = a;
        this.b = b;
    }


    @Override
    public float calcula(){
        return a + b;
    }

    @Override
    public String MostraOpName() {
        return  "Soma";
    }

    @Override
    public String MostraOpSimbolo() {
        return "+";
    }


    
}
