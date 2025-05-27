package parte2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos la variable entera puntuaciones para guardar el elo de los jugadores
		int puntuaciones;
		// Creamos la variable contador para mostrar en el bucle for que nº de jugador
		// es
		int contador = 0;
		// Creamos el array entero lista de longitud 8
		int lista[] = new int[8];
		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Creamos el bucle for donde i=0 iterara hasta que i>=8 e ira incrementando el
		// valor de i en 1
		for (int i = 0; i < 8; i++) {
			// Print del jugador
			System.out.println("Escribe del jugador " + ++contador);
			// Definimos la variable en funcion del input del usuario
			puntuaciones = lectura.nextInt();
			// Definimos la posicion del numero dentro del array
			lista[i] = puntuaciones;
		}
		// Ordenamos el array
		Arrays.sort(lista);
		// Print
		System.out.println("La puntuacion en orden descendente son ");
		// Bucle for que ira en reversa y mostraras las puntuaciones en orden
		// descendente
		for (int i = 7; i > 0; i--) {
			// Print del orden de las puntuaciones
			System.out.print(lista[i] + " ");
		}
		//Cierre Del Scanner
		lectura.close();
	}

}
