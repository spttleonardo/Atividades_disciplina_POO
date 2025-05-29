import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdConsumThread{
    static Scanner scanner = new Scanner(System.in);
    static Object mutex = new Object();
    static List<Integer> lista = new ArrayList<>();
    static int indice = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) { 
                    int numeroInteiro = scanner.nextInt();
                    synchronized (mutex) {
                        lista.add(numeroInteiro);
                        mutex.notify(); 
                    }
                }
            }
            
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) { 
                    int numeroRetirado ;
                    synchronized (mutex) {
                        while(lista.isEmpty()){
                            try {
                                mutex.wait();
                            } catch (InterruptedException ex) {
                                System.out.print(ex.getMessage());
                            }
                        }
                        numeroRetirado = lista.remove(0);
                    }
                    System.out.println("Removido: "+ numeroRetirado);
                }

            }
            
        });

        // inicia as threads
		t1.start();
		t2.start();
		
		// espera as threads acabarem 
		t1.join();
		t2.join();
	


    }
}
