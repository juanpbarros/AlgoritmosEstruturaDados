import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		Arvore objArvore = new Arvore();	
		
		int tamanho = 100;
		for (int i = 0; i < tamanho; i++) {
			objArvore.inserir((int) (tamanho * Math.random()));
		}
		
		objArvore.exibirRaiz();
		System.out.println();
		
		//Realização de buscas
		int numero = 0;
		do {
			System.out.print("Digite um número: ");
			numero = leitor.nextInt();
			objArvore.procurar(numero);
		} while (numero != -99);
		leitor.close();
		
		// Impressão ordenada
		objArvore.navegarEmOrdem();
	}
}
