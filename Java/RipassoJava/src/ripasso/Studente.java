package ripasso;

public class Studente {
	
	private String nome;
	private int eta;
	private double mediaVoti;
	
	public Studente(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
		this.mediaVoti = 0.0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEta(int eta) {
		if (eta <= 0 || eta > 120 ) {
			System.out.println("Eta non valida");
		}else {
			this.eta = eta;
		}
	}
	
	public int getEta() {
		return eta;
	}
	
	public void setMediaVoti(double mediaVoti) {
		if (mediaVoti < 18 || mediaVoti > 30) {
			System.out.println("Media non valida");
		}else {
			this.mediaVoti = mediaVoti;
		}
	}
	
	public double getMediaVoti() {
		return mediaVoti;
	}

	public static void main(String[] args) {
		Studente s1 = new Studente("Marco", 20);
		Studente s2 = new Studente("Elisa", 23);
		
		s1.setEta(21);
		System.out.println("Eta: " + s1.getEta());   // 21

		s1.setEta(-5);

		s1.setMediaVoti(27.5);
		System.out.println("Media: " + s1.getMediaVoti());   // 27.5

		s1.setMediaVoti(35);
		
		System.out.println();
		
		System.out.println("Nome: " + s2.getNome());
		s2.setEta(29);
		System.out.println("Eta S2: " + s2.getEta());
		s2.setMediaVoti(30);
		System.out.println("Media voti: " + s2.getMediaVoti());
		}
		
	}
