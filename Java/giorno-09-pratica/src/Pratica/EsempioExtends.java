package Pratica;


import java.util.List;

public class EsempioExtends {
	public static double somma(List<? extends Number> numeri) {
		double totale = 0;
		for(Number numero : numeri) {
			totale += numero.doubleValue();
		}
		return totale;
	}
	
	public static Number massimo(List<? extends Number> numeri){
		Number max = numeri.get(0);
		for(Number n : numeri) {
			if(n.doubleValue() > max.doubleValue()) {
				max = n;
			}
		}
		return max;
	}
}
