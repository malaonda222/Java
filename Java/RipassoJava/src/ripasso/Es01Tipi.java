package ripasso;

public class Es01Tipi {
	
	public static void main(String[] args) {
		String nome = "Anna";
		int eta = 30;
		double altezza = 1.65;
		char iniziale = 'A';
		boolean maggiorenne = true;
		long popolazione = 3000000000L;
		float temperatura = 36.6f;

		System.out.println("Nome: " + nome);
		System.out.println("Eta: " + eta);
		System.out.println("Altezza: " + altezza);
		System.out.println("Iniziale: " + iniziale);
		System.out.println("Maggiorenne: " + maggiorenne);
		System.out.println("Popolazione: " + popolazione);
		System.out.println("Temperatura: " + temperatura);

		System.out.println(nome + " ha " + eta + " anni ed è alta " + altezza + " metri.");
	}

}
