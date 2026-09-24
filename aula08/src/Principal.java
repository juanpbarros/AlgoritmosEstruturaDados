import java.util.Scanner;
	public class Principal {
		public static void main(String[] args) {
			MatrizEsparsa objMatriz = new MatrizEsparsa(16);
			for (int i = 0 ; i < 100 ; i++) {
				objMatriz.inserir(i);
			}
			objMatriz.imprimir();
			while (true) {
				System.out.print("Digite um número para excluir: ");
				objMatriz.excluir(new Scanner(System.in).nextInt());
				objMatriz.imprimir();
			}
		}
}