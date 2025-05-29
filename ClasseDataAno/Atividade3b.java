public class Atividade3b {
    public static void main(String[] args) {

        // Criando e configurando data 1 vazia 
        System.out.println("Inserindo data vazia");
        Data data1 = new Data();
        System.out.println(data1);
        System.out.println();

        // Criando e configurando data 2 invalida
        System.out.println("Inserindo data invalida: 30/02/2023");
        Data data2 = new Data(30,02,2023);
        System.out.println(data2);
        System.out.println();

        // Criando e configurando data 2 valida
        System.out.println("Inserindo data valida");
        Data data3 = new Data(01,02,2024);
        System.out.println(data3);
        System.out.println();

        //Chamando getters
        System.out.println("Utilizando gatters");
        Data data4 = new Data();
        data4.setAno(2025);
        data4.setMes(05);
        data4.setDia(15);

        System.out.println("Ano: "+ data4.getAno() + " mes: " + data4.getMes() + " dia: " + data4.getDia());
        System.out.println("Mes por extenso: " + data4.getMesExtenso());
        System.out.println("Ultimos 2 digitos do ano: " + data4.getAno2Dig());
        System.out.println();

        //Apresentando ano bissexto
        System.out.println("Apresentando ano bissexto");
        Data data5 = new Data(29, 2,2024);
        System.out.println(data5);
        System.out.println("Ano é bissexto? " + data5.isBissexto());
        System.out.println();

        //Apresentando ano como string
        System.out.println("Apresentando ano como string");
        Data data6 = new Data(01, 7,2021);
        System.out.println(data6.toString());
        System.out.println();

        //Apresentando ano clonando
        System.out.println("Clonado data");
        Data data7 = new Data(17, 9,2019);
        System.out.println("Data original: "  + data7);
        System.out.println("Data clone: "  + data7.clone());
        System.out.println();

        //Utilizando data como string
        System.out.println("Passando data no formato de string");
        Data data8 = new Data("25/10/2016");
        System.out.println(data8);
        System.out.println();

        //Utilizando apenas o ano
        System.out.println("Passando apenas o Ano");
        Data data9 = new Data(2027);
        System.out.println(data9);
    }
}
