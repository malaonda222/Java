package Pratica;

// T è un segnaposto, quando crei un'istanza, Java sostituisce con il tipo reale.
public class Box<T> {
	private T valore;
	
	public Box(T valore) {
		this.valore = valore;
	}
	
	public void setValore(T valore) {
		this.valore = valore;
	}
	
	public T getValore() {
		return valore;
	}
	
	@Override
	public String toString() {
		return "Box[" + valore + "]";
	}
	
	
}
