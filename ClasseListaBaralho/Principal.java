import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        String[] naipe = {"Ouro", "Paus", "Espada", "Copas"};
        List<Carta> baralho = new ArrayList<>();

       for (String n : naipe) {
            for(int i = 1; i<=12; i++){
                baralho.add(new Carta(i, n));
            }
    }


    System.out.println("Embaralhando...");

    Collections.shuffle(baralho);

    System.out.println("\nEmbaralhado. Retirando carta uma por uma...\n");

    for(Carta carta: baralho){
        System.out.println("Carta: " + carta.getNumero()+ " Naipe: "+ carta.getnaipe());
    }

  }
}