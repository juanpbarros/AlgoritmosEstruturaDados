public class Fila {
	// Proprieddes da classe
	private No cabeca = null;
	// Métodos da classe
	public void entrar(int numero) {
		cabeca = new No(numero, cabeca);
	}
	public void sair() {
		// Caso MUITO fácil: fila vazia
		if (cabeca == null) {
	return;
		}
		// Caso fácil: só tem um único nó na fila
		if (cabeca.getProximo() == null) {
			System.out.println(cabeca.getNumero());
			cabeca = null;
			return;
		}
		// Caso difícil: tem mais de um nó na fila
		No penultimo = cabeca;
		while(penultimo.getProximo().getProximo() != null) {
			penultimo = penultimo.getProximo();
		}
		System.out.println(penultimo.getProximo().getNumero());
		penultimo.setProximo(null);
	}
}