package java_5_Esercizio2Veicolo;


public class Main {
	public static void main(String[] args) {
		
		Veicolo[] veicoli = {
				new Auto(
						"Fiat",
						"500",
						2022,
						5),
				new Moto(
						"Kawasaki",
						"KU99",
						2023,
						6)
		};
		
		for(Veicolo veicolo : veicoli) {
			System.out.println(veicolo.muoviti());
		}
		
	}
}
