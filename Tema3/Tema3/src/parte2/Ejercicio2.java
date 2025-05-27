package parte2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos el array entero con una longitud de 10 para almacenar los numeros del
		// usuario
		int arraya[] = new int[10];
		// Creamos otro array entero con una longitud de 10 para almacenar los numeros
		// del usuario
		int arrayb[] = new int[10];
		// Creamos la variable entera numeros que seran los numeros que vaya
		// introduciendo el usuario
		int numeros;
		// Creamos el objeto scanner
		Scanner lectura = new Scanner(System.in);
		// Print de las indicaciones para el usuario
		System.out.println("Introduce 10 numeros para el arrayA");
		// Creamos un bucle for donde i=0, iterara mientras i<10 y por cada iteracion el
		// valor de i aumentara en 1
		for (int i = 0; i < 10; i++) {
			// La variable numeros dependera del siguiente input del usuario
			numeros = lectura.nextInt();
			System.out.println("Introduce otro numero");
			// Definimos cada posicion del array en funcion de cada numero que introduzca el
			// usuario en orden

			arraya[i] = numeros;
		}
		// Creamos un bucle for donde i=0, iterara mientras i<10 y por cada iteracion el
		// valor de i aumentara en 1
		System.out.println("Introduce 10 numeros para el arrayB");
		for (int i = 0; i < 10; i++) {
			// Creamos un bucle for donde i=0, iterara mientras i<10 y por cada iteracion el
			// valor de i aumentara en 1
			numeros = lectura.nextInt();
			System.out.println("Introduce otro numero");
			// Creamos un bucle for donde i=0, iterara mientras i<10 y por cada iteracion el
			// valor de i aumentara en 1
			arrayb[i] = numeros;
		} // Si los arrays son iguales se le muestra al usuario true por el contrario se
			// mostrara false
		System.out.println(Arrays.equals(arraya, arrayb));
		// Cierr Scanner
		lectura.close();
	}

}
