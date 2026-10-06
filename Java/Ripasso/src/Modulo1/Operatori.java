package Modulo1;

public class Operatori {
	int numero;
	public Operatori(int numero) {
		this.numero = numero;
	}
	
	public void analizza() {
		if(numero % 2 == 0) {
			System.out.println("Pari");
		}else if (numero > 0){
			System.out.println("Dispari positivo");
		}else{
			System.out.println("Dispari negativo o 0");
		}
	}
	
	public static void main(String[] args) {
		new Operatori(4).analizza();
		new Operatori(3).analizza();
		new Operatori(-3).analizza();
	}
}
