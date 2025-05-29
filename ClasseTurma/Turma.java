public class Turma {
    private int codigoTurma;
    private String nomeTurma; 
    private Aluno[] aluno = new Aluno[50];

    // Construtor
    public Turma(int codigoTurma, String nomeTurma) {
        this.codigoTurma = codigoTurma;
        this.nomeTurma = nomeTurma;
    }

    public void setCodTurma(int codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public int getCodTurma() {
        return codigoTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public int getNumAluno() {
        return calculoNumAlunos(); 
    }


    // Demais metodos
    public void adicionaAluno(Aluno aluno) {
        for (int i = 0; i < this.aluno.length; i++) {
            if (this.aluno[i] == null) { 
                this.aluno[i] = aluno;
                return;
            }
        }
        System.out.println("Turma cheia! Não é possível adicionar mais alunos.");
    }


    private int calculoNumAlunos() {
        int numAlunos = 0;
        for (int i = 0; i < this.aluno.length; i++) {
            if (this.aluno[i] != null) { 
                numAlunos++;
            }
        }
        return numAlunos;
    }

    public void mostraAluno() {
        for (int i = 0; i < this.aluno.length; i++) {
            if (this.aluno[i] != null) { 
                System.out.println(aluno[i].getNome());
            }
        }
    }


    public void mostraAlunosAprovados() {
        for (int i = 0; i < this.aluno.length; i++) {
            if (this.aluno[i] != null && this.aluno[i].getMedia() >= 6) { // Só mostra alunos aprovados
                System.out.println(aluno[i].getNome());
            }
        }
    }
}
