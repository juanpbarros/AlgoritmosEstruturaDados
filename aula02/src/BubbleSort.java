import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		int[] vetor = new int[10];
		// Entrada de dados
		for (int i = 0 ; i < vetor.length ; i++) {
				System.out.print("Digite um valor para o índice " + i + ":");

				vetor[i] = leitor.nextInt();
		}
		leitor.close();
		// Processamento
		boolean continuar = true;
		while (continuar) {
			continuar = false;
			for (int i = 0 ; i < (vetor.length - 1) ; i++) {
				if (vetor[i] > vetor [i + 1]) {
					int temp = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = temp;
					continuar = true;
				}
			}
		}
		// Saída de dados
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.println(vetor[i]);
		}
	}
}