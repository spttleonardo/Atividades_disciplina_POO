public class Principal {
    public static void main(String[] args) {
        Soma som = new Soma(2,4);
        System.out.println("Tipo da operação: "+ som.MostraOpName() + ", simbolo: " + som.MostraOpSimbolo() + 
        ", resultado: " + som.calcula());

        Subtracao sub = new Subtracao(2,4);
        System.out.println("Tipo da operação: "+ sub.MostraOpName() + ", simbolo: " + sub.MostraOpSimbolo() + 
        ", resultado: " + sub.calcula());

        Multiplicacao multi = new Multiplicacao(2,2);
        System.out.println("Tipo da operação: "+ multi.MostraOpName() + ", simbolo: " + multi.MostraOpSimbolo() + 
        ", resultado: " + multi.calcula());

        Divisao div = new Divisao(2,2);
        System.out.println("Tipo da operação: "+ div.MostraOpName() + ", simbolo: " + div.MostraOpSimbolo() + 
        ", resultado: " + div.calcula());


        
    }
}
