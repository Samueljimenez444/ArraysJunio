package parte4;

import java.util.Arrays;

public class Ejercicio6 {
	public static int[] suma(int t[], int numElementos) {
		// Creamos la variable entera lista con una longitud igual a 3
		int[] lista = new int[3];
		// Creamos la variable entera suma
		int suma;
		// Creamos la variable entera inicio que servira para contabilizar la posicion
		// del array desde 0
		int inicio = 0;

		for (int i = 0; i < lista.length; i++) {
			lista[i] = t[i];
		}
		for (int j = 0; j < lista.length; j++) {
			suma = t[inicio] + t[++inicio] + t[numElementos++];
			lista[j] = suma;
			suma = 0;
		}
		return lista;
	}

	public static void main(String[] args) {
		int[] tabla = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(suma(tabla, 2)));

	}

}
