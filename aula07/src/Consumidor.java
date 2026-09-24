public class Consumidor extends Thread {
	//Propriedades da classe
	private Deque objDeque = null;
	//Método construtor cheio da classe
	public Consumidor(Deque objDeque) {
		this.objDeque = objDeque;
	}
	//Método de execução paralela da classe
	public void run() {
		while (true) {
			objDeque.atender();
			try {sleep(100);} catch (Exception e) {}
		}
	}
}