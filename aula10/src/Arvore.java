
public class Arvore {
	//Propriedades da classe
	private No raiz = null;
	private int contador = 0;
	//Métodos da classe
	public void inserir(int numero) {
		raiz = inserir(raiz, numero);
	}
	
	private No inserir(No raiz, int numero) {
		
		//Caso fácil: Árvore vazia
		if (raiz == null) {
			return new No(numero, null, null);
		}
		
		//Caso difícil: Árvore NÃO vazia
		if (numero < raiz.getNumero()) {
			raiz.setEsquerda(inserir(raiz.getEsquerda(), numero));
		} else {
			raiz.setDireita(inserir(raiz.getDireita(), numero));
		}
		return raiz;
	}
	
	public void procurar(int numero) {
		procurar(raiz, numero);
	}
	
	private void procurar(No raiz, int numero){
		
		//Caso MUITO fácil: Árvore vazia
		if (raiz == null) {
			System.out.println("NÃO encontrei o número em " + contador + " tentativas!");
			contador = 0;
			return;
		}
		
		// Caso fácil: É a raiz
		if (raiz.getNumero() == numero) {
			System.out.println("Achei em " + contador + " tentativas!");
			contador = 0;
			return;
		}
		
		//Caso difícil: Procurar na esquerda ou na direita
		contador++;
		if (numero < raiz.getNumero()) {
			procurar(raiz.getEsquerda(), numero);
		} else {
			procurar(raiz.getDireita(), numero);
		}
	}
	
	public void navegarEmOrdem() {
		System.out.print("Em-Ordem: ");
		navegarEmOrdem(raiz);
		System.out.println();
	}
	
	private void navegarEmOrdem(No raiz) {
		if (raiz == null) return;
		
		navegarEmOrdem(raiz.getEsquerda());
		System.out.print(raiz.getNumero());
		navegarEmOrdem(raiz.getDireita());
	}
	
	public void exibirRaiz() {
	    if (raiz == null) {
	        System.out.println("A árvore está vazia, não possui raiz.");
	    } else {
	        System.out.println("A raiz da árvore é: " + raiz.getNumero());
	    }
	}
	
}
