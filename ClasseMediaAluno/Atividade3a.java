public class Atividade3a {
    public static void main(String[] args) {

     //Criando e Configurando objeto do aluno 1
     Aluno aluno = new Aluno();
     aluno.setMatricula(2020);
     aluno.setNome("Leonardo");
     aluno.setNota1(7);
     aluno.setNota2(3);
     aluno.setNotaprova(6);

     System.out.println(aluno.getNome()+ "a sua media é: " + aluno.getMedia());

     // Condicional para verificar o valor da media   
     if(aluno.getMedia() < 6){
          System.out.println("Sua nota necessária para passar é: " + aluno.getNotaRec());
          System.out.println();
     }
     else{
          System.out.println("Você passou" );
          System.out.println();
     }
     
     // Criando e configurando objeto aluno 2
     Aluno aluno2 =new Aluno();

     System.out.println("Matricula: " +  aluno2.getCodigoString() + " Nome: " + aluno2.getNome()
     + " Nota 1: " + aluno2.getNota1());
     System.out.println();

     // Criando e configurando objeto aluno 3
     Aluno aluno3 =new Aluno(20201530, "Jose");
   
     System.out.println("Matricula: " +  aluno3.getMatricula() + " Nome: " + aluno3.getNome()
     + " Nota 1: " + aluno3.getNota1());
     System.out.println();


     // Criando e configurando objeto aluno 4          
     Aluno aluno4 =new Aluno(20201210, "Gustavo",8,7,5 );
    
     System.out.println("Matricula: " +  aluno4.getMatricula() + " Nome: " + aluno4.getNome()
     + " Nota 1: " + aluno4.getNota1() + " Nota Prova: " + aluno4.getNotaprova());
     System.out.println();
    }
}
