	public class Produtor extends Thread {
		//Propriedades da classe
		private Deque objDeque = null;
		//Método construtor cheio da classe
		public Produtor(Deque objDeque) {
			this.objDeque = objDeque;
		}
		//Método de execução paralela da classe
		public void run() {
			int contador = 0;
			while (true) {
				boolean sorteio = (((int) (10 * Math.random())) < 9);
				objDeque.entrar(sorteio, sorteio ? contador : (1000 * contador));
				try {sleep(500);} catch (Exception e) {}
				contador++;
			}
		}
}