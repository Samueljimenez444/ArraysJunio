package parte4;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {
	//Creamos la funcion rellenaPares que servira para rellenar un array con numeros pares
	public static int[] rellenaPares(int longitud, int fin) {
		//Creamos la clase random para randomizar los distintos numeros del programa
		Random random = new Random();
		//Creamos la varaible entera array que tendra una longitud equivalente al entero longitud
		int[] array = new int[longitud];
		//Creamos un bucle for que recorrera el array y lo rellenara con los distintos numeros pares que genera el programa
		for (int i = 0; i < array.length; i++) {
			//Creamos la variable numero y la definimos como 2 + el proximo entero random
			int num = 2 + random.nextInt((fin / 2) - 1) * 2; // Genera números pares entre 2 y fin
			//Definimos cada posicion del array con un numero par aleatorio
			array[i] = num;
		}
		//Ordenamos el Array
		Arrays.sort(array); // Ordena el array
		//Devolvemos el Array
		return array;
	}
	
	public static void main(String[] args) {
		//Creamos la variable entera resultado que llamara a la funcion rellena pares donde el array tendra la longitud de la variable longitud y creara numeros pares hasta 20
		int[] resultado = rellenaPares(7, 20);
		//Print del Array Completo
		System.out.println(Arrays.toString(resultado));
	}

	
}
