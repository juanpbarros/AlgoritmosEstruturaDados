public class Deque {
	//Propriedades da classe
	private No filaNormal = null;
	private No filaPreferencial = null;
	private int contador = 0;
	//Métodos da classe
	public void entrar(boolean tipo, int numero) {
		if (tipo) {
			filaNormal = new No(numero, filaNormal);
		} else {
			filaPreferencial = new No(numero, filaPreferencial);
		}
	}
	private No sair(No fila) {
		//Caso MUITO fácil: fila vazia
		if(fila == null) {
			return null;
		}
		//Caso fácil: fila só tem um único nó
		if (fila.getProximo() == null) {
			System.out.println(fila.getNumero());
			return null;
		}
		//Caso difícil: fila tem mais de um nó
		No penultimo = fila;
		while (penultimo.getProximo().getProximo() != null) {
			penultimo = penultimo.getProximo();
		}
		System.out.println(penultimo.getProximo().getNumero());
		penultimo.setProximo(null);
		return fila;
	}
	public void atender() {
		//Caso MUITO fácil: ambas filas vazias
		if ((filaNormal == null) && (filaPreferencial == null)) {
			contador = 0;
			return;
		}
		//Caso fácil: só tem preferencial
		if (filaNormal == null) {
			filaPreferencial = sair(filaPreferencial);
			contador = 0;
			return;
		}
		//Caso fácil: só tem normal
		if (filaPreferencial == null) {
			filaNormal = sair(filaNormal);
			contador = 0;
			return;
		}
		//Caso difícil: tem normal e prefencial
		if (contador < 3) {
			filaPreferencial = sair(filaPreferencial);
			contador++;
		} else {
			filaNormal = sair(filaNormal);
			contador = 0;
		}
	}
}