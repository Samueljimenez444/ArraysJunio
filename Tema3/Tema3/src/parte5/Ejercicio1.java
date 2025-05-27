package parte5;

import java.util.Scanner;

public class Ejercicio1 {
	// Creamos una funcion que devolvera una variable booleana con nombre busqueda y
	// que contara con las variables tabla y valor
	public static boolean busqueda(int[][] tabla, int valor) {
		// Creamos la variable booleana esta que se inicializara en false
		boolean esta = false;

		// Creamos una sucesion de bucles for anidados que recorreran la tabla y
		// comprobaran que el valor introducido por el usuario se encuentra en la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				if (tabla[i][j] == valor) {
					esta = true;
				}

			}
		}
		// Devolvemos el valor booleano
		return esta;
	}

	public static void main(String[] args) {
		// Creamos la variable entera lista que servira para crear una matriz
		int[][] lista;
		// Creamos la variable entera fila que servira para definir las filas de la
		// matriz
		int fila;
		// Creamos la variable entera fila que servira para definir las columnas de la
		// matriz
		int columna;
		// Creamos la variable entera que servira para definir el numero que buscaremos
		// en la matriz
		int numero;
		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Print
		System.out.println("Introduzca el valor que vamos a buscar en la matriz");
		// Numero es igual al input del usuario
		numero = lectura.nextInt();
		// Print
		System.out.println("Introduzca cuantas filas va a tener la matriz");
		// Fila es igual al input del usuario
		fila = lectura.nextInt();
		// Print
		System.out.println("Introduzca cuantas columnas va a tener la matriz");
		// Columna es igual al input del usuario
		columna = lectura.nextInt();
		// La longitud de lista es igual a los valores de columna y filas
		lista = new int[fila][columna];
		// Creamos un bucle for anidado que recorrera la matriz e ira preguntando al
		// usuario por posicion que numero quiere introducir para rellenarla
		for (int i = 0; i < lista.length; i++) {

			for (int j = 0; j < lista[0].length; j++) {
				System.out.println("Introduzca el valor en la posicion " + (i) + " " + (j));
				lista[i][j] = lectura.nextInt();
			}
		}
		// Print del return de la funcion
		System.out.println(busqueda(lista, numero));
		// Cierre Del Scanner
		lectura.close();
	}

}
