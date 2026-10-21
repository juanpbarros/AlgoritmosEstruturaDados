
public class Arvore {
	// Propriedades da classe
	private No raiz = null;
	
	// Métodos da classe
	private No rotacionarEsquerda(No raizVelha) {
		No raizNova = raizVelha.getDireita();
		raizVelha.setDireita(raizNova.getEsquerda());
		raizNova.setEsquerda(raizVelha);
		raizNova.setVermelho(raizVelha.isVermelho());
		raizVelha.setVermelho(true);
		return raizNova;
	}
	private No rotacionarDireita (No raizVelha) {
		No raizNova = raizVelha.getEsquerda();
		raizVelha.setDireita(raizNova.getDireita());
		raizNova.setDireita(raizVelha);
		raizNova.setVermelho(raizVelha.isVermelho());
		raizVelha.setVermelho(true);
		return raizNova;
	}
	private void subirVermelho(No raiz) {
		raiz.setVermelho(true);
		raiz.getEsquerda().setVermelho(false);
		raiz.getDireita().setVermelho(false);
	}
	private boolean isVermelho(No raiz) {
		if(raiz == null) return false;
		return raiz.isVermelho();
	}
	
	
	public void inserir(int numero) {
		raiz = inserir(raiz, numero);
		
	}
	private No inserir(No raiz, int numero) {
		//Caso fácil: árvore vazia
		if (raiz == null) {
			return new No(numero, null, null, true);
		}
		//Cenário difícil: árvore não vazia
		if (numero < raiz.getNumero()) {
			raiz.setEsquerda(inserir(raiz.getEsquerda(), numero));
		} else {
			raiz.setDireita(inserir(raiz.getDireita(), numero));
		}
		
		// Correções de balanceamento da árvore
		
		// Caso1: Preto na esqueda e Vermelho na direita
		if((! isVermelho(raiz.getEsquerda())) && (isVermelho(raiz.getDireita()))) {
			raiz = rotacionarEsquerda(raiz);
		}
		
		// Caso2: Filho e Neto vermelhos:
		if((isVermelho(raiz.getEsquerda())) && (isVermelho(raiz.getEsquerda().getEsquerda()))) {
			raiz = rotacionarDireita(raiz);
		}
		
		// Caso3: Esquerda e Direita vermelha
		if((isVermelho(raiz.getEsquerda())) && (isVermelho(raiz.getDireita()))) {
			subirVermelho(raiz);
		}
		
		return raiz;
	}
	public void imprimir() {
		imprimir(raiz, "");
	}
	private void imprimir(No raiz, String indentacao) {
		if (raiz == null) return;
		
		System.out.println(indentacao + raiz.getNumero());
		imprimir(raiz.getEsquerda(), indentacao + "---");
		imprimir(raiz.getDireita(), indentacao + "---");
	}
	
}
