public class AlunoAnual extends Aluno {
    private float nota3;
    private float nota4;

    //Contructors
    public AlunoAnual(){

    }

    public AlunoAnual(int matricula, String nome, int anoEntrada,
    float nota1, float nota2, float nota3, float nota4){
        super(matricula, nome, anoEntrada, nota1, nota2);
        this.nota3 = nota3;
        this.nota4 = nota4;
    }


    //setters and getters  
    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }
    
    public float getNota3() {
        return nota3;
    }
    
    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }
    
    public float getNota4() {
        return nota4;
    }

    public float getMedia(){
        return CalcMedia();
    }

    // Metodos
    private  float CalcMedia(){
        float media;
        float peso1 = 0.40f;
        float peso2 = 0.10f;

        media = ((getNota1()*peso2) + (getNota2()*peso1) + (this.nota3*peso2) + (this.nota4*peso1) );
        media = Math.round(media * 100) / 100f;
        return media;
    }

    public String VerificaAprovacao(){
        float media = getMedia();
        return media >= 7 ? "Aprovado": "Não passou";
    }
}


