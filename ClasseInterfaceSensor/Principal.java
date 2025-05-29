public class Principal {
	
	public static void main(String args[]) throws InterruptedException {
		
		Dispositivo d1 = new MeuSensorR1();
		Dispositivo d2 = new MeuSensorR2("S2");
		Dispositivo d3 = new MeuSensorR3("S3");
		
		for (int i = 0; i < 10; i++) {
			Data d_1 = d1.getData();
			Data d_2= d2.getData();
			Data d_3 = d3.getData();
			System.out.println(d_1.toString());
			System.out.println(d_2.toString());
			System.out.println(d_3.toString());
			System.out.println();
			
			// espera 2 segundos
			Thread.sleep(2000);
		}
	}

}

