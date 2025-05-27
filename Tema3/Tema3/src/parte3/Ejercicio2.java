package parte3;


import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos un array bidimensional entero notas con una longitud de 4x5
		int notas[][] = new int[4][5];
		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		int suma = 1;
		int notaMax = 0;
		int notaMin = 0;
		int media = 0;
		/*
		 * Creamos un bucle for anidado que ira rellenando el array por filas y columnas
		 * en funcion del input del usuario
		 */
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[0].length; j++) {
				System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
				notas[i][j] = lectura.nextInt();

			}
		}

		// Creamos un bucle for anidado que recorrera el array al completo
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[0].length; j++) {
				// Print del array en forma de matriz
				System.out.print(notas[i][j] + "\t");

			}
			// Salto de linea
			System.out.println();
		}
		for (int i = 0; i < notas.length; i++) {
			notaMax = notas[i][0];
			notaMin = notas[i][0];
			media = 0;
			for (int j = 0; j < notas[0].length; j++) {
				if (notas[i][j] > notaMax) {
					notaMax = notas[i][j];
				} else if (notas[i][j] < notaMin) {
					notaMin = notas[i][j];
				}
				media += notas[i][j] / 5;
			}
			/* Print de las notas maxima, minima y media de los alumnos */
			System.out.println("Alumno " + (i + suma) + " ");
			System.out.println("La nota Max del alumno es " + notaMax);
			System.out.println("La nota Min del alumno es " + notaMin);
			System.out.println("La media del alumno es " + media);
		}

		// Cierre Scanner
		lectura.close();

	}
}
