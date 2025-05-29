public class AlunoCursoCurto extends Aluno {
    private String mes;


    // Construtores
    public AlunoCursoCurto(){

    }

    public AlunoCursoCurto(int matricula, String nome, int anoEntrada,
     float nota1, float nota2, String mes){
        super(matricula, nome, anoEntrada, nota1, nota2);
        this.mes = mes;
    }

    //setters and getters
    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public float getMedia(){
        return CalcMedia();
    }

    // Metodos
    private float CalcMedia(){
        float media;

        media = (getNota1() + getNota2())/2;
        media = Math.round(media * 100) / 100f;
        return media;
    }

    public String VerificaAprovacao(){
        float media = getMedia();
        return media >=5? "Aprovado":"Não passou";
    }
}
