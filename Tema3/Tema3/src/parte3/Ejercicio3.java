package parte3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos la variable entera filas que servira para almacenar el numero de
		// filas que tendra la tabla
		int filas;
		// Creamos la variable entera columnas que servira para almacenar el numero de
		// columnas que tendra la tabla
		int columnas;
		// Creamos la variable entera
		int tabla[][];
		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Pritn
		System.out.println("Introduzca el numero de filas ");
		// Filas es igual al input del usuario
		filas = lectura.nextInt();
		// Print de instrucciones
		System.out.println("Introduzca el numero de columnas");
		// Columnas es igual al input del usuario
		columnas = lectura.nextInt();
		// Definimos la longitud del array en funcion de los valores introducidos por el
		// usuario
		tabla = new int[filas][columnas];

		// Bucle for anidado que servira para recorrer el array completo desde filas a
		// columnas
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				// Definimos el valor de la tabla en ese punto (x,y) en funcion de esa
				// combinacion aritmetica
				tabla[i][j] = 10 * i + j;
			}
		}
		// Creamos un bucle for anidado que volvera a recorrer la tabla para leerla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				// Print de la tabla de forma que se muestre como matriz
				System.out.print(tabla[i][j] + "\t");
			}
			// Salto de linea
			System.out.println();
		}
		// Cierre Scanner
		lectura.close();
	}
}
