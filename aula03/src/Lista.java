public class Lista {
	// Propriedades da classe
	private No cabeca = null;
	// Métodos da classe
	public void inserir(int numero) {
		// Cenário fácil: lista vazia
		if (cabeca == null) {
			cabeca = new No(numero, null);
			return;
		}
		// Cenário difícil: lista NÃO vazia
		No ultimo = cabeca;
		while (ultimo.getProximo() != null) {
			ultimo = ultimo.getProximo();
		}
		ultimo.setProximo(new No(numero, null));
	}
	public void excluir(int numero) {
		// Cenário MUITO fácil: lista vazia
		if (cabeca == null) {
			return;
		}
		// Cenário fácil: excluir o primeiro
		if (cabeca.getNumero() == numero) {
			cabeca = cabeca.getProximo();
			return;
		}
		// Navegação até o número anterior ao número a ser excluído
		No anterior = cabeca;
		while ((anterior.getProximo () != null) && // Condição para chegar ao final

				(anterior.getProximo().getNumero() != numero)) { // Condição de encontrar o número que eu quero

			anterior = anterior.getProximo();
		}
		// Cenário difícil: número a ser excluído NÃO foi encontrado
		if (anterior.getProximo() == null) {
			return;
		}
		// Cenário difícil: encontrei o número a ser excluído e estou no anterior

		anterior.setProximo(anterior.getProximo().getProximo());
	}
	public void imprimir() {
		No ponteiro = cabeca;

		while(ponteiro != null) {
			System.out.println(ponteiro.getNumero());
			ponteiro = ponteiro.getProximo();
		}
	}
}