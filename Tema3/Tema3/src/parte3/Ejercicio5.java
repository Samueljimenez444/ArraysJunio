package parte3;

import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos la variable random para crear numero aleatorios
		Random rand = new Random();
		// Creamos la variabl entera tabla que sera un array bidimensional 4x5
		int tabla[][] = new int[4][5];
		// Creamos la variable entera aleatorio que servira para almacenar los numeros
		// aleatorios
		int aleatorio;
		// Creamos la variable suma que servira para realizar el calculo total de los
		// numeros por fila y columna
		int suma = 0;
		// Creamos una variable total que servira para calcular el total del sumatorio
		// de filas y columnas
		int total = 0;
		// Creamos un bucle for anidado que rellenara el array con numeros aleatorios
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				// Definimos aleatorio en funcion de un numero aleatorio entre 100 y 999
				aleatorio = rand.nextInt(100, 1000);
				// Rellenamos la posicion de la tabla con el valor
				tabla[i][j] = aleatorio;
			}
		}
		// Creamos un bucle for anidado que servira para recorrer el aray e imprimirlo
		for (int i = 0; i < tabla.length; i++) {
			suma = 0;
			
			for (int j = 0; j < tabla[i].length; j++) {
				// Se imprimira la posicion i,j del array con un espacio
				System.out.print(tabla[i][j] + "\t");
				suma += tabla[i][j];	
				total += suma;
				}
			// Salto de linea
			System.out.println( suma + "Σ");	
			
			
		}
		/*
		 * Repetimos el anterior bucle pero esta vez lo recorreremos de forma externa a
		 * interna es decir de columnas a filas por lo que esta vez el codigo realizara
		 * el sumatorio del valor de cada columna e ira reiniciando su valor por cada
		 * iteracion para volver a realizar la suma de la siguiente columna
		 */
		for (int j = 0; j < tabla[0].length; j++) {
			suma = 0;
			for (int i = 0; i < tabla.length; i++) {
				suma += tabla[i][j];
				total += suma;
			}
			/* Print finales del total y la suma de columnas */
			System.out.print(suma + "Σ"+ "\t");
			
		}
		System.out.print(total +"Σ");
		System.out.println();
		
	}
}
