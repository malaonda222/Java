import java.util.List;

public class Stream {
	List<String> nomi =
			
		List.of("Anna","Luca","Alessia","Marco");
		
		List<String> risultato = 
		nomi.stream()
		.filter(nome -> nome.startsWith("A"))
		.map(String::toUpperCase)
		.toList();
	// [ANNA, ALESSIA]
}
