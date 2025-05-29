public class Data {

    //Atributos
    private int dia;
    private int mes;
    private int ano;

    // Contrutores
    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1;
    }

    // Construtor com validação de data
    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            this.toString();
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
            this.toString();
        }
    }

    // Construtor que recebe string
    public Data(String data){
        String[] partes = data.split("/");

        this.dia = Integer.parseInt(partes[0]);
        this.mes = Integer.parseInt(partes[1]);
        this.ano = Integer.parseInt(partes[2]);
    }

    // Construtor que recebe apenas o ano
    public Data(int ano){
        this.dia = 1;
        this.mes = 1;
        this.ano = ano;
        this.toString();
    }

    // Setters and Getters
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getDia(){
        return dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getMes(){
        return mes;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return ano;
    }

    public String getMesExtenso(){
        return VerificaMes();
    }

    public int getAno2Dig(){
        return Pega2Dig();
    }


    // Metodo para validar a data passada
    private boolean dataValida(int dia, int mes) {
        int[] diasPorMes = {31, isBissexto() ? 29 : 28, 31, 30, 31, 30, 
                            31, 31, 30, 31, 30, 31};
        
        return (mes >= 1 && mes <= 12) && (dia >= 1 && dia <= diasPorMes[mes - 1]);
    }

    // Metodo para verificar mes
    public String VerificaMes() {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                          "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    
        if (this.mes >= 1 && this.mes <= 12) {
            return meses[this.mes - 1]; 
        } else {
            return "Mês inválido"; 
        }
    }

    // Metodo que obtem os dois últimos dígitos do ano
    public int Pega2Dig(){
        return this.ano % 100; 
    }

    // O ano não é bissexto
    public boolean isBissexto() {
        return (this.ano % 4 == 0 && this.ano % 100 != 0) || (this.ano % 400 == 0); // O ano é bissexto
    }

    // Metodo para converter para string
    public String toString(){
        String diaFormatado = String.format("%02d", this.dia);
        String mesFormatado = String.format("%02d", this.mes);
        String anoFormatado = String.format("%04d", this.ano);
        return diaFormatado + "/" + mesFormatado + "/" + anoFormatado;
    }

    // Metodo para clonar 
    public Object clone() {
        Data clone = new Data(this.dia, this.mes, this.ano);
        return clone;
    }
}
