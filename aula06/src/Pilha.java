public class Pilha {
	// Propriedades da classe
	private No cabeca = null;
	// Métodos da classe
	public void push(int numero) {
		cabeca = new No(numero, cabeca); // Método de empilhar
	}
	public void pop() { // Desempilhar
		// Caso MUITO fácil: pilha vazia
		if (cabeca == null) {
			return;
		}
		// Caso fácil: pilha NÃO vazia
		System.out.println(cabeca.getNumero());
		cabeca = cabeca.getProximo();
	}
}