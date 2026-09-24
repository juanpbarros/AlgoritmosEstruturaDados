import java.util.Scanner;
public class SelectionSort {
	public static void main(String [] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		int[] vetor = new int [10];
		//Entrada de dados
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print("Digite um valor para o índice " + i + ":");
			vetor[i] = leitor.nextInt();
		}
		leitor.close();
		//Processamento
		for (int i = 0 ; i < (vetor.length - 1) ; i++) { // Do primeiro ao último
			for (int j = (i + 1) ; j < vetor.length ; j++) { // Do próximo ao último
				if (vetor[i] > vetor[j]) {
					int temp = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = temp;
				}
			}
		}
		// Saída de dados
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.println(vetor[i]);
		}
	}
}