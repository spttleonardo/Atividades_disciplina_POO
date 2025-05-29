public class AlunoSemestral extends Aluno {
    private int semestre;
    private float nota3;

   //constructors 
   public AlunoSemestral(){

   }
   
   public AlunoSemestral(int matricula, String nome, int anoEntrada,float nota1, float nota2,
   int semestre, float nota3){
        super(matricula, nome, anoEntrada, nota1, nota2);
        this.semestre = semestre;
        this.nota3 = nota3;
   }

    // setters and getters
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    public int getSemestre() {
        return semestre;
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
    private  float CalcMedia(){
        float media;
        float peso1 = 0.25f;
        float peso2 = 0.25f;
        float peso3 = 0.50f;


        media = ((getNota1()*peso1) + (this.getNota2()*peso2) + (this.nota3*peso3));
        media = Math.round(media * 100) / 100f;
        return media;
    }

    public String VerificaAprovacao(){
        float media = getMedia();
        return media >= 6 ? "Aprovado": "Não passou";
    }
}
