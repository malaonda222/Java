package java_3;

public class Esercizio3_IndovinaBug {
	public class BugExample { 
	    public static void main(String[] args) { 
	        int risultato = somma(5, 10); 
	        System.out.println("Risultato: " + risultato); 
	    } 
	   
	    public static int somma(int a, int b) { 
	        int risultato = 0; 
	        for (int i = a; i <= b; i++) { 
	            risultato += i; 
	        } 
	        return risultato; 
	    } 
	} 
}
