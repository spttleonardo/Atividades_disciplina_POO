public class Atividade2 {
    public static void main(String[] args) {
    
    // Criando e configurando o Robo1
    Robo robo1 = new Robo();
    robo1.setIdentificador(1);
    robo1.setX(32);
    robo1.setY(40);
    
    // Criando e configurando o Robo2
    Robo robo2 = new Robo();
    robo2.setIdentificador(2);
    robo2.setX(50);
    robo2.setY(15);
    
    // Exibi os dados na tela
    robo1.mostra();
    robo2.mostra();
    
    
    

    }
}
