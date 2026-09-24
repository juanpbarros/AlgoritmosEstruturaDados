public class MatrizEsparsa {
	//propriedades da classe
	private Diretor cabeca = null;
	private int modulo = 0;
	//metodo construtor da classe
	public MatrizEsparsa(int modulo) {
		this.modulo = modulo;
	}
	//metodos da classe
	private Diretor procurarDiretor(int numero) {
		//procurar o diretor correto
		int resto = (numero % modulo);
		Diretor ponteiroDiretor = cabeca;
		while ((ponteiroDiretor != null) && (ponteiroDiretor.getResto() != resto)) {
			ponteiroDiretor = ponteiroDiretor.getProximoDiretor();
		}
		//cenario em que o direor foi encontrado
		if (ponteiroDiretor != null) {
			return ponteiroDiretor;
		}
		//cenario em que o diretor não existe, ou seja, tem de criar um novo
		cabeca = new Diretor(resto, cabeca, null);
		return cabeca;
	}
	public void inserir(int numero) {
		Diretor ponteiroDiretor = procurarDiretor(numero);
		ponteiroDiretor.setProximoNo(new No(numero,
				ponteiroDiretor.getProximoNo()));
	}
	public void excluir(int numero) {
		Diretor ponteiroDiretor = procurarDiretor(numero);
		//caso MUITO facil: lista vazia
		if (ponteiroDiretor.getProximoNo() == null) {
			return;
		}
		//caso facil: excluir o primeiro
		if (ponteiroDiretor.getProximoNo().getNumero() == numero) {
			ponteiroDiretor.setProximoNo(ponteiroDiretor.getProximoNo().getProximo
					());
			return;
		}
		//caso dificil: tem de procurar
		No ponteiroNo = ponteiroDiretor.getProximoNo();
		while ((ponteiroNo.getProximo() != null) &&
				(ponteiroNo.getProximo().getNumero() != numero)) {
			ponteiroNo = ponteiroNo.getProximo();
		}
		//caso do numero nao ser encontrado
		if (ponteiroNo.getProximo() == null) {
			return;
		}
		//caso do numero ter sido encontrao
		ponteiroNo.setProximo(ponteiroNo.getProximo().getProximo());
	}
	public void imprimir() {
		Diretor ponteiroDiretor = cabeca;
		System.out.println("Resto \t Números");
		while (ponteiroDiretor != null) {
			System.out.print(ponteiroDiretor.getResto() + "\t ");
			No ponteiroNo = ponteiroDiretor.getProximoNo();
			while (ponteiroNo != null) {
				System.out.print(ponteiroNo.getNumero() + ", ");
				ponteiroNo = ponteiroNo.getProximo();
			}
			System.out.println();
			ponteiroDiretor = ponteiroDiretor.getProximoDiretor();
		}
	}
}