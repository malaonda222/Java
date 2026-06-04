package Pratica;

public class Main {
	public static void main(String[] args) {
		Box<String> boxTesto = new Box<>("Java");
		Box<Integer> boxNumero = new Box<>(17);
		Box<Double> boxDecimale = new Box<>(3.14);

		System.out.println(boxTesto.getValore());
		System.out.println(boxNumero.getValore());
		System.out.println(boxDecimale.getValore());

		boxTesto.setValore("Spring Boot");
		System.out.println(boxTesto);

		Repository<String> repo = new Repository<>();
		repo.save("Java");
		repo.save("Spring Boot");
		System.out.println(repo.findAll());

		record Utente(String nome, String email) {
		}
		Repository<Utente> utenti = new Repository<>();
		utenti.save(new Utente("Anna", "anna@mail.it"));
	}
}
