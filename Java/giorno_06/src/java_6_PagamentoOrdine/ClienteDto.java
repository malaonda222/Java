package java_6_PagamentoOrdine;

public record ClienteDto(String nome, String email) {
	public ClienteDto{
		if(nome == null || nome.trim().isBlank()) {
			throw new IllegalArgumentException("Nome non valido");
		}
		
		if(email == null || email.trim().isBlank()) {
			throw new IllegalArgumentException("Email non valida");
		}
	}
}

