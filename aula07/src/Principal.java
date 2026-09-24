public class Principal {
	public static void main(String[] args) {
		Deque objDeque = new Deque();
		new Produtor(objDeque).start();
		new Consumidor(objDeque).start();
	}
}