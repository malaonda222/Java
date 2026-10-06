package ClasseGenerica;

public class Coppia <A, B> {
	public A a;
	public B b;
	
	public Coppia(A a, B b) {
		this.a = a;
		this.b = b;
	}
	
	public A getA(){
		return a;
	}
	
	public B getB() {
		return b;
	}
	
	public void stampa() {
		System.out.println("Coppia A+B: " + a + " " + b);
	}
}
