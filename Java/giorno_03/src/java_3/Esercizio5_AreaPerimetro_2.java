package java_3;

public class Esercizio5_AreaPerimetro_2 {
	public static void main(String[] args) {
		System.out.println(area(30.6));
		System.out.println(area(5, 4));
		System.out.println(areaCerchio(4.9));
		System.out.println(perimetro(3.4));
		System.out.println(perimetro(5.7, 8.0));
	}

	public static String area(double lato) {
		return ("Area cerchio: " + lato * lato);
	}
	
	public static String area(double base, double altezza) {
		return ("Area rettangolo: " + (base * altezza));
	}
	
	public static String areaCerchio(double raggio) {
		return ("Area cerchio: " + (3.14 * Math.pow(raggio, 2))); 
	}
	
	public static String perimetro(double lato) {
		return ("Perimetro quadrato: " + lato * 4);
	}
	
	public static String perimetro(double base, double altezza) {
		return ("Perimetro rettangolo: " + ((base + altezza) * 2));
	}
}
