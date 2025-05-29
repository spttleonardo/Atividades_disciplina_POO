    public class Data {
        private int dia;
        private int mes;
        private int ano;


        public Data(Data nascimentos){
            this.dia = nascimentos.dia;
            this.mes = nascimentos.mes;
            this.ano = nascimentos.ano;
        }

        public Data(int dia, int mes, int ano){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }

        // getter e setter para dia
        public int getDia() {
            return dia;
        }

        public void setDia(int dia) {
            this.dia = dia;
        }

        // getter e setter para mes
        public int getMes() {
            return mes;
        }

        public void setMes(int mes) {
            this.mes = mes;
        }

        // getter e setter para ano
        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }




    }
