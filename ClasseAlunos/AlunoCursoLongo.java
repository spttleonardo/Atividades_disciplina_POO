public class AlunoCursoLongo extends Aluno{
    private int meses;
    private float nota3;


    public AlunoCursoLongo(){

    }

    public AlunoCursoLongo(int matricula, String nome, int anoEntrada, float nota1, float nota2,
    int meses, float nota3){
        super(matricula, nome, anoEntrada, nota1, nota2);
        this.meses = meses;
        this.nota3 = nota3;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
    
    public int getMeses() {
        return meses;
    }
    
    
    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }
    
    public float getNota3() {
        return nota3;
    }

    public float getMedia(){
        return CalcMedia();
    }

    // Metodos
    private float CalcMedia(){
        float media;

        media = (getNota1() + getNota2() + this.nota3)/3;
        media = Math.round(media * 100) / 100f;
        return media;
    }

    public String VerificaAprovacao() {
        float media = getMedia();
    
        if (media >= 9.01f && media <= 10f) {
            return "Aprovado conceito A";
        } else if (media >= 7.01f && media <= 9f) {
            return "Aprovado conceito B";
        } else if (media >= 5.01f && media <= 7f) {
            return "Reprovado conceito C";
        } else {
            return "Reprovado conceito D";
        }
    }
    

    }

