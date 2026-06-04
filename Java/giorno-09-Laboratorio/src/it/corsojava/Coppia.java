package it.corsojava;

public class Coppia<A, B> {
	private A a;
	private B b; 
	
	public Coppia(A a, B b) {
		this.a = a;
		this.b = b;
	}
	
	public A getA() {
		return a;
	}
	
	public B getB() {
		return b;
	}
	
	@Override 
	public String toString() {
		return "Coppia[A= " + a + "B= " + b + "]";
	}
	
	
}


