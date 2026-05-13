package java_6_Esercizio5Giorno;

public enum Giorno {
	LUNEDI, MARTEDI, MERCOLEDI, GIOVEDI, VENERDI, SABATO, DOMENICA;

	// Versione con if
	public String tipoGiorno() {
		if(this == SABATO || this == DOMENICA) {
			return "Weekend";
		}
		return "Giorno lavorativo";
	}
	
	// Versione con switch
	public String tipoGiorno1() {
		return switch (this) {
		case SABATO, DOMENICA -> "Weekend";
		default -> "Giorno lavorativo";
		};
	}
}

