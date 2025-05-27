package parte4;

import java.util.Arrays;

public class Ejercicio2 {
	// Creamos la funcion entera ordenarElementos que servira para ordenar un array
	// y buscar su valor mas alto
	public static int ordenarElementos(int[] array) {
		//Ordenamos el array que proviene del metodo main
		Arrays.sort(array);
		//Devolvemos la posicion 4 del array (la mas grande)
		return array[4];
	}

	public static void main(String[] args) {
		//Creamos el array entero lista que servira para almacenar varios elementos
		int lista[] = { 5, 4, 15, 10, 8 };
		//Print del resultado de la funcion usando lista
		System.out.println(ordenarElementos(lista));
	}

}
