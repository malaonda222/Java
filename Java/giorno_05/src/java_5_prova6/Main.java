package java_5_prova6;

public class Main {
	public static void main(String[] args) {
		
		Cerchio c = new Cerchio("rosso", "arancione", 5);
		Rettangolo r = new Rettangolo("blu", "azzurro", 4, 5);
		
		c.descrivi();
		r.descrivi();
		
		System.out.println("Area del cerchio: " + c.area());
		System.out.println("Area del rettangolo: " + r.area());
	}
}
