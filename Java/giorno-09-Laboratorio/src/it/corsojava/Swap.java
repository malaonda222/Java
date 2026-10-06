package it.corsojava;

import java.util.Arrays;

public class Swap <T>{
	// <T> definisce il tipo generico
	// T{[] array di quel tipo
	public static <T> void swap1(T[] array, Integer i, Integer j) {
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		System.out.println("Inversione avventuta: " + Arrays.toString(array));
	}
}
