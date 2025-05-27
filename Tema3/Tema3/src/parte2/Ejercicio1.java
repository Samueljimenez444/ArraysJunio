package parte2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos la lista entera total
		int total[];
		// Creamos el objeto scanner
		Scanner lectura = new Scanner(System.in);
		// Creamos la variable entera valor que servira para almacenar el numero que
		// quiera guardar el usuario
		int valor;
		// Creamos la variable entera tamaño que servira para almacenar la longitud del
		// array
		int tamaño;
		// Print de instrucciones para el usuario
		System.out.println("Introduce un tamaño");
		// Definimos tamaño en funcion del numero del usuario
		tamaño = lectura.nextInt();
		// Print de instrucciones para el usuario
		System.out.println("Introduce un valor");
		// Definimos valor en funcion del input del usuario
		valor = lectura.nextInt();
		// definimos el tamaño del array con una longitud igual al numero introducido
		// por el
		// usuario
		total = new int[tamaño];
		// Creamos un bucle for donde i=0, el bucle iterara mientras i< que el input del
		// usuario e i ira incrementando su valor en 1 por cada iteracion
		for (int i = 0; i < tamaño; i++) {
			// Definimos todas las posiciones del array en funcion del valor introducido por
			// el usuario
			total[i] = valor;
		}
		// Print del array
		System.out.println(Arrays.toString(total));
		// Cierre Scanner
		lectura.close();
	}

}
