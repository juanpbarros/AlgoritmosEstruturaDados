import java.util.Scanner;
public class BuscaExaustiva {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
	int[] vetor = new int[1000000000];
	int parametroPesquisa = 0;
	// Construção do vetor
	for (int i = 0 ; i < vetor.length ; i++) {
	vetor[i] = ((int) (vetor.length * Math.random()));
	}
	// Realização de pesquisas
	do {
		System.out.print("Digite um parâmetro de pesquisa: ");
		parametroPesquisa = leitor.nextInt();
		for (int i = 0 ; i < vetor.length ; i++) {
			if (parametroPesquisa == vetor[i]) {
				System.out.println("ACHEEEEEI !!! No índice " + i);
					break;
				}
			}
		} while (parametroPesquisa != -99);
		leitor.close();
	}
}