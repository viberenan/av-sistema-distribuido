package questao1;

public class ThreadNome implements Runnable {
	
	
	private String nome;
	private long itempo;
	
	public ThreadNome(String nome, long itempo) {
		this.nome = nome;
		this.itempo = itempo;
	}
	

	@Override
	public void run() {
		for(char c: nome.toCharArray()) {
			System.out.println(c);
			try {
				Thread.sleep(itempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	

}
