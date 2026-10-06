package java_2;

public class Switch_esempio {
	public static void main(String[] args) {
		String livello = "JUNIOR";
		
		String descrizione = switch (livello) {
		case "JUNIOR" -> "Ha bisogno di guida";
		case "MID" -> "Autonomo su task ordinari";
		case "SENIOR" -> "Guida scelte tecniche";
		default -> "Livello non riconosciuto";
		};
		
		System.out.println(descrizione);
	}
}
