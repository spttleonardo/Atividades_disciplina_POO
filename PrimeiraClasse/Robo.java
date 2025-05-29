class Robo {

    // Atributos
    private int identificador;
    private float x;
    private float y;

    // setter and gatters
    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }

    public int getIdentificador(){
        return identificador;
    }

    public void setX(float x){
        this.x = x;
    }

    public float getX(){
        return x;
    }

    public void setY(float y){
        this.y = y;
    }

    public float getY(){
        return y;
    }

    // Metodo para mostrar o identificador e posição
    public void mostra(){
        System.out.println("Identificador: " + identificador + " Posição X: "+ x + " Posição: " + y );
    }
    
}
