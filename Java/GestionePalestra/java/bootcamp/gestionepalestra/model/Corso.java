package bootcamp.gestionepalestra.model;

import bootcamp.gestionepalestra.mapper.TipoCorso;

public class Corso {
	private Long id;
	private String nome;
	private String istruttore;
	private TipoCorso tipo;
	private int durataminuti;
	private double prezzo;
	private int orario;
	
	public Corso(Long id, String nome, String istruttore, TipoCorso tipo,
			int durataminuti, double prezzo, int orario) {
		this.id = id;
		if(nome==null) {
			throw new IllegalArgumentException("Nome obbligatorio");
		}
		this.nome = nome;
		if(istruttore==null) {
			throw new IllegalArgumentException("Istruttore obbligatorio");
		}
		this.istruttore = istruttore;
		this.tipo = tipo;
		if(durataminuti <= 0) {
			throw new IllegalArgumentException("Durata non valida");
		}
		this.durataminuti = durataminuti;
		if(prezzo < 0) {
			throw new IllegalArgumentException("Prezzo non valido");
		}
		this.prezzo = prezzo;
		this.orario = orario;
	}
	
	public Long getId() {return id;}
	public String getNome() {return nome;}
	public String getIstruttore() {return istruttore;}
	public TipoCorso getTipo() {return tipo;}
	public int getDurataMinuti() {return durataminuti;}
	public double getPrezzo() {return prezzo;}
	public int getOrario() {return orario;}
	
	public boolean isMattutino() {
		return orario < 12;
	}
	
	public String descrizioneBreve() {
		return tipo + " con " + istruttore + ", durata: " + durataminuti + ", prezzo: " + prezzo; 
	}
	
	@Override
	public String toString() {
		return descrizioneBreve();}
	;
	}
