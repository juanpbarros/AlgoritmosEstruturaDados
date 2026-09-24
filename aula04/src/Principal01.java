public class Principal01 {
	public static void main (String[] args) {
		Lista objLista = new Lista();
		// Primeiro teste
			objLista.imprimir();
			objLista.excluir(0);
			objLista.inserir(1);
			objLista.inserir(2);
			objLista.inserir(3);
			objLista.inserir(4);
			objLista.inserir(5);
			objLista.imprimir();
			objLista.excluir(1);
			objLista.excluir(3);
			objLista.excluir(5);
			objLista.imprimir();
			objLista.excluir(0);
			objLista.excluir(2);
			objLista.excluir(4);
			objLista.imprimir();
			// Segundo teste
			for (int i = 0 ; i < 100000000 ; i++) {
				objLista.inserir(i);
				System.out.println(i);
			}
		}
}