package questao2;

public class Main {
	public static void main(String[] args) {
		Thread t1 = new Thread(new CalculaRaizQuadrada());
		Thread t2 = new Thread(new CalculaRaizCubica());

		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			System.out.println("FIM");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
