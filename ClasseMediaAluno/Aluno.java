
class Aluno{

    // Atributos
    private int matricula;
    private String nome;
    private float nota1;
    private float nota2;
    private float nota_prova;

    //Constructors
    public Aluno(){ 
        this.matricula = 0;
        this.nome = "Nome nao definido";
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota_prova = 0;
    }

    public Aluno(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota_prova = 0;
    }

    public Aluno(int matricula, String nome, float nota1, 
        float nota2, float nota_prova){
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota_prova = nota_prova;
    }
    
    //Setter and Gatters
    public void setMatricula(int matricula){
       this.matricula = matricula;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
     }
 
     public String getNome(){
         return nome;
     }

     public void setNota1(float nota1){
        this.nota1 = nota1;
     }
 
     public float getNota1(){
         return nota1;
     }

     public void setNota2(float nota2){
        this.nota2 = nota2;
     }
 
     public float getNota2(){
         return nota2;
     }

     public void setNotaprova(float nota_prova){
        this.nota_prova = nota_prova;
     }
 
     public float getNotaprova(){
         return nota_prova;
     }
   
 
     public float getMedia(){
         return  Calcmedia();
     }

 
     public float getNotaRec(){
         return  CalcRec();
     }

    // Metodos Calcula media, Converte para o formato de string e calcula rec

    public float Calcmedia(){
            float peso1 = 0.25f;
            float peso2 = 0.50f;

            float media = ((peso1 * this.nota1) + (peso1 * this.nota2) + (peso2 * this.nota_prova)); 
            return media; 
    }

    public String getCodigoString(){
        return String.format("%06d", this.matricula);
    }

    public float CalcRec(){  
        float media = this.getMedia();
        return media >= 6 ? 0 : ((6*2)-media);  
    }
  
   
}