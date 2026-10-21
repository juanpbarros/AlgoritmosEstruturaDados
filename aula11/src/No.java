
public class No {
	//	Propriedades da classe
	private int numero = 0;
	private No esquerda = null;
	private No direita = null;
	private boolean vermelho = true;
	// Métodos construtores da classe
	public No() {
		super();
	}
	public No(int numero, No esquerda, No direita, boolean vermelho) {
		super();
		this.numero = numero;
		this.esquerda = esquerda;
		this.direita = direita;
		this.vermelho = vermelho;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public No getEsquerda() {
		return esquerda;
	}
	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}
	public No getDireita() {
		return direita;
	}
	public void setDireita(No direita) {
		this.direita = direita;
	}
	public boolean isVermelho() {
		return vermelho;
	}
	public void setVermelho(boolean vermelho) {
		this.vermelho = vermelho;
	}
}
