public class Lista {
	// Propriedades da clsse
	private No cabeca = null;
	// Métodos da classe
	public void inserir(int numero) {
		cabeca = new No(numero, null, cabeca);
		// A cabeça que está a direita representa o passado (anterior);
		// A cabeça na esquerda está representando o futuro (próximo);
		if (cabeca.getProximo() !=null) { // Caso já possuir números na lista
			cabeca.getProximo().setAnterior(cabeca);
		}
	}
	public void excluir(int numero) {
		// Cenário MUITO fácil: lista vazia
		if (cabeca == null) {
			return;
		}
		// Cenário fácil: excluir o primeiro
		if (cabeca.getNumero() == numero) {
			cabeca = cabeca.getProximo();
			if (cabeca != null) { // Cenário fácil: e não era o único
				cabeca.setAnterior(null);
			}
		}
		// Processo de procura pelo número
		No ponteiro = cabeca;
		while ((ponteiro != null) && (ponteiro.getNumero () != numero)){
			ponteiro = ponteiro.getProximo();
		}
		// Cenário pouco difícil: não foi encontrado
		if (ponteiro == null) {
			return;
		}
		// Cenário difícil: excluir o último
		ponteiro.getAnterior().setProximo(ponteiro.getProximo());
		// Cenário difícil: excluir no meio
		if (ponteiro.getProximo() != null) {
			ponteiro.getProximo().setAnterior(ponteiro.getAnterior());
		}
}

	public void imprimir() {
		No ponteiro = cabeca;
		while (ponteiro != null) {
			System.out.println(ponteiro.getNumero());
			ponteiro = ponteiro.getProximo();
		}
	}
}