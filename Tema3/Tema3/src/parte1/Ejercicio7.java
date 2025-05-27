package parte1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Creamos el array entero meses que servira para mantener la informacion de la
		// temperatura de los distintos meses
		int meses[] = new int[13];
		// Creamos la variable entera temperatura que servira para almacenar la media de
		// la temperatura
		int temperatura;
		// Creamos la variable año para mostrarle al usuario una tabla mas completa
		int año;
		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);

		// Print de instrucciones al usuario
		System.out.println("Introduce el año");
		// Definimos año en funcion del input del usuario
		año = lectura.nextInt();
		// Creamos un bucle for que se inicializa en 0, itera 12 veces e incrementa en 1
		// vez cada uno
		for (int i = 1; i < 13; i++) {
			System.out.println("Introduce la temperatura del mes " + i);
			temperatura = lectura.nextInt();
			meses[i] = temperatura;

		}
		System.out.println("El año elegido ha sido " + año);
		// Creamos un bucle for-each
		for (int valor : meses) {

			for (int i = 0; i < valor; i++) {
				System.out.print("*");
			}
			System.out.println();

		}
//Cierre Scanner
		lectura.close();
	}

}
