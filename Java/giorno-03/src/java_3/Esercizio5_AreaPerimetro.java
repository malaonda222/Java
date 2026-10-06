package java_3;

public class Esercizio5_AreaPerimetro {
	public static void main(String[] args) {
		double areaQuadrato = area(20.0);
		System.out.println("Area quadrato: " + areaQuadrato);
		
		double areaRettangolo = area(4.0, 6.0);
		System.out.println("Area rettangolo: " + areaRettangolo);
		
		double areaCerchio = areaCerchio(5.9);
		System.out.println("Area cerchio: " + areaCerchio);
		
		double perimetroQuadrato = perimetro(6.0);
		System.out.println("Perimetro quadrato: " + perimetroQuadrato);
		
		double perimetroRettangolo = perimetro(5.7, 8.9);
		System.out.println("Perimetro rettangolo: " + perimetroRettangolo);
	}
	
	public static double area(double lato) {
		return lato * lato;
	}
	
	public static double area(double base, double altezza) {
		return base * altezza;
	}
	
	public static double areaCerchio(double raggio) {
		return 3.14 * Math.pow(raggio, 2); 
	}
	
	public static double perimetro(double lato) {
		return lato * 4;
	}
	
	public static double perimetro(double base, double altezza) {
		return (base + altezza) * 2;
	}
	
}
