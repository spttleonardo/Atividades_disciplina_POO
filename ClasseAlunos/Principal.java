public class Principal {
    public static void main(String[] args) {

        // Aplicação para Curso curto
        AlunoCursoCurto a1 = new AlunoCursoCurto(18189067, "João", 2023, 7.5f, 10, "Fevereiro" );
        AlunoCursoCurto a2 = new AlunoCursoCurto(18189402, "Carlos", 2023, 7.5f, 2,  "Fevereiro");
        
        System.out.println("A media do aluno: " + a1.getNome() + " é: " + a1.getMedia() + " Sendo assim: " 
        + a1.VerificaAprovacao());
        System.out.println("A media do aluno: " + a2.getNome() + " é: " + a2.getMedia() + " Sendo assim: " 
        + a2.VerificaAprovacao());

        System.out.println();
        
        // Aplicação para Curso Longo
        AlunoCursoLongo a3 = new AlunoCursoLongo(18189067, "Pedro", 2023, 7.5f, 10, 38, 4 );
        AlunoCursoLongo a4 = new AlunoCursoLongo(18189402, "Livia", 2023, 7.5f, 2, 38, 5);
        
        System.out.println("A media do aluno: " + a3.getNome() + " é: " + a3.getMedia() + " Sendo assim: " 
        + a3.VerificaAprovacao());
        System.out.println("A media do aluno: " + a4.getNome() + " é: " + a4.getMedia() + " Sendo assim: " 
        + a4.VerificaAprovacao());

        System.out.println();
        
        // Aplicação para Curso Anual
        AlunoAnual a5 = new AlunoAnual(20201789, "Leonardo", 2025, 4, 7.5f, 10, 8);
        AlunoAnual a6 = new AlunoAnual(20201543, "Flavia", 2025, 9, 5.5f, 7,5);
        
        System.out.println("O aluno: " + a5.getNome()+ " de matricula: " + a5.getMatricula() +  " tem media: " 
        + a5.getMedia() + " sendo assim: " + a5.VerificaAprovacao());
        System.out.println("O aluno: " + a6.getNome()+ " de matricula: " + a6.getMatricula() +  " tem media: "  
        + a6.getMedia() + " sendo assim: " + a6.VerificaAprovacao());

        System.out.println();

        //Aplicação para Curso Semestral
        AlunoSemestral a7 = new AlunoSemestral(10108765, "Jorge", 2021, 8, 9, 9, 10);
        AlunoSemestral a8 = new AlunoSemestral(19785623, "Fernando", 2021, 6, 7, 9, 6);
        
        System.out.println("O aluno: " + a7.getNome()+ " de matricula: " + a7.getMatricula() +  " tem media: " 
        + a7.getMedia() + " sendo assim: " + a7.VerificaAprovacao());
        System.out.println("O aluno: " + a8.getNome()+ " de matricula: " + a8.getMatricula() +  " tem media: "  
        + a8.getMedia() + " sendo assim: " + a8.VerificaAprovacao());

    
    }
}
