package questao1;

public class Main {

	public static void main(String[] args) {
		
		ThreadNome cls = new ThreadNome("nao consigo mais", 500);
		ThreadNome cls1 = new ThreadNome("quero acabar isso logo", 1000);
		ThreadNome cls2 = new ThreadNome("provinha dificil", 2000);
		Thread th1 = new Thread(cls);
		Thread th2 = new Thread(cls1);
		Thread th3 = new Thread(cls2);

		th1.start();
		th2.start();
		th3.start();

	}

}
