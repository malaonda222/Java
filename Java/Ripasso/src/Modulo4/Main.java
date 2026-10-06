package Modulo4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Animale> animali = new ArrayList<>();
		
		Gatto gatto1 = new Gatto("Mimi");
		Cane cane1 = new Cane("Fido"); 
		animali.add(gatto1);
		animali.add(cane1);
		
		gatto1.presentati();
		cane1.presentati();
		
		gatto1.verso();
		cane1.verso();
		
		for(Animale animale:animali) {
			animale.verso();
		}
		
		List<Calcolabile> lista = new ArrayList<>();
		Cerchio cerchio1 = new Cerchio(3.5);
		Quadrato quadrato1 = new Quadrato(4.6);
		lista.add(cerchio1);
		lista.add(quadrato1);
		
		for(Calcolabile forma : lista) {
			forma.calcolaValore();
		}
	}
}
