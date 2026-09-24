import java.util.Scanner;
public class BuscaBinaria {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		int[] vetor = new int [1000000000];
		int parametroPesquisa = 0;
		int inicio = 0;
		int meio = 0;
		int fim = 0;
		int contador = 0;
		// Construção do vetor
		for (int i = 0 ; i < vetor.length ; i++) {
			vetor[i] = i;
		}
		// Realização das pesquisas
		do {
			System.out.print("Digite o parânmetro de pesquisa: ");
			parametroPesquisa = leitor.nextInt();
			inicio = 0;
			fim = (vetor.length - 1);
			contador = 0;
			while (inicio <= fim) {
				meio = ((inicio + fim) / 2);
				contador++;
				if(parametroPesquisa == vetor[meio]) {
					System.out.println("ACHEEEEI !!! No índice " + meio + "depois de " + contador + "tentativas");
					break;
				} else if (parametroPesquisa < vetor[meio]) {
					fim = (meio - 1);
				} else {
					inicio = (meio + 1);
				}
			}
		} while (parametroPesquisa != 99);
		leitor.close();
	}
}