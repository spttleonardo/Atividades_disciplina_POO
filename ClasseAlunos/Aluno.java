public class Aluno {
    private int matricula;
    private String nome;
    private int anoEntrada;
    private float nota1;
    private float nota2;

    public Aluno(){

    }

    public Aluno(int matricula, String nome, int anoEntrada, float nota1, float nota2){
        this.matricula = matricula;
        this.nome = nome;
        this.anoEntrada = anoEntrada;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void getMatricula(int matricula){
        this.matricula = matricula;
    }

    public int getMatricula(){
        return matricula;
    }

    public void getNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void getAnoEntrada(int anoEntrada){
        this.anoEntrada = anoEntrada;
    }

    public int getAnoEntrada(){
        return anoEntrada;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    
    public float getNota1() {
        return nota1;
    }
    
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    
    public float getNota2() {
        return nota2;
    }
    

}
