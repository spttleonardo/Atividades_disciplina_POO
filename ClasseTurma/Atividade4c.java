public class Atividade4c {
    public static void main(String[] args) {
        Turma turma = new Turma(25804, "Mecem");

        // Adiciona alunos à turma
        turma.adicionaAluno(new Aluno(20201428, "Leonardo", 8, 9, 5));
        turma.adicionaAluno(new Aluno(20201338, "Carlos", 2, 3, 5));
        turma.adicionaAluno(new Aluno(20201124, "Jose", 8, 9, 10));

        // Exibe nome e código da turma
        System.out.println("Turma: " + turma.getNomeTurma() + " (Código: " + turma.getCodTurma() + ")");
        System.out.println();
        
        // Exibe o número de alunos
        System.out.println("Número de alunos na turma: "+turma.getNomeTurma()+ " é:" + turma.getNumAluno());
        System.out.println();

        // Exibe os alunos
        System.out.println("Alunos na turma:");
        turma.mostraAluno();
        System.out.println();

        // Exibe os alunos aprovados
        System.out.println("Alunos aprovados (Média >= 6):");
        turma.mostraAlunosAprovados();
    }
}