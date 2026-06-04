package it.corsojava;

public class Dipendente {

    private String nome;
    private String reparto;
    private double stipendio;

    public Dipendente(String nome, String reparto, double stipendio) {
        this.nome = nome;
        this.reparto = reparto;
        this.stipendio = stipendio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getReparto() {
        return reparto;
    }

    public void setReparto(String reparto) {
        this.reparto = reparto;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }
}