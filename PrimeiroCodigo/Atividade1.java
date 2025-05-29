
public class Atividade1 {
   
    public static void main(String[] args){
        
        //Declarando variaveis
        int[] A = {1, 3, 5, 6, 8, 9};
        int M[][] = new int[6][6];
        int soma_valores =0 , elementos = 0, total_soma = 0, a1 = 0, a2 = 0;
        float media = 0.0f;

        // Laco de repeticao para produzir os valores de cada elemento da matriz M
        for (int i = 0; i < M.length; i ++){
            a1 = A[i]; 
            for (int j = 0; j < M[i].length; j++){
                 a2 = A[j];
                M[i][j] = a1*a2;
                soma_valores = soma_valores + M[i][j];
                elementos = elementos + 1;
            }
        }

        // Calculando a media dos valores atraves do metodo obtendoMedia
        media = obtendoMedia(soma_valores, elementos);
        
        // Apresentando os valores do vetor A lado a lado
        System.out.print("Valores do vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(); // quebra de linha


        System.out.println("Valores da Matriz M: ");
        // Laço de repetição para apresentar todos os valores da matriz, como tambem, 
        // obter a soma de todos os elementos acima da media
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] > media){
                    total_soma = total_soma + M[i][j];
                }
                System.out.print(M[i][j] + "\t"); // "\t" para deixar espaçado
            }  
            System.out.println(); // quebra de linha a cada linha da matriz
        }

        // Apresentando a soma dos valores acima da media
        System.out.println("A soma de todos os valores acima da média é: "+ total_soma);  
    }

    // Metodo para calcular a media dos elementos de M 
    public static float obtendoMedia(int soma_valores, int elementos){
        return  soma_valores / elementos;
    }
    
}
