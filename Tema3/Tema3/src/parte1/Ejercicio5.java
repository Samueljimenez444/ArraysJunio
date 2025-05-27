package parte1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int suma = 0;
		int numeroMax = 0;
		int numeroMin = 0;
		// Creamos un array entero
		int numeros[] = new int[10];
		// Creamos la variable entera numeroUsuario que servira para almacenar los
		// numeros del usuario
		int numeroUsuario;
		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);

		// Creamos un bucle for donde inicializamos la variable en 0, se detendra cuando
		// i=12 y por cada iteracion el valor de i incrementara en uno
		for (int i = 0; i < 10; i++) {
			// Print que le
			System.out.println("Escribe un numero");
			numeroUsuario = lectura.nextInt();
			if (i == 0) {
				numeroUsuario = numeroMax;
				numeroUsuario = numeroMin;
				numeros[0] = numeroUsuario;
			}
			numeros[i] = numeroUsuario;
			if (numeroUsuario > numeroMax) {
				numeroMax = numeroUsuario;
			} else if (numeroUsuario < numeroMin) {
				numeroMin = numeroUsuario;
			}
		}
		// Creamos un for-each que recorra el array y calcule la suma de todos los
		// valores
		for (int valor : numeros) {
			System.out.print(valor + " ");
			suma += valor;

		}
		// Salto de linea
		System.out.println();
		// Print de la suma de todos los numeros
		System.out.println("La suma de los numeros es igual a " + suma);
		// Salto de linea
		lectura.close();
		/* Print del numero max y min */
		System.out.println("El numero mas grande ha sido el " + numeroMax);
		System.out.println("El numero mas pequeño introducido ha sido " + numeroMin);
	}
}
