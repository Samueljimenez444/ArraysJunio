package parte3;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos la tabla bidimensional entera tabla que servira para almacenar una
		// cantidad de informacion 11x11
		int tabla[][] = new int[11][11];
		// Creamos un bucle for anidado que servira para recorrer la tabla por filas y
		// columnas respectivametne
		for (int i = 1; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				// Rellena el array por filas y columnas de forma que imita el funcionamiento de
				// las tablas de muultiplicar
				tabla[i][j] = i * j;
			}
		}
		// Creamos otro bucle for anidado que servira para recorrer la tabla completa
		// por filas y columnas
		for (int i = 1; i < tabla.length; i++) {
			for (int j = 1; j < tabla[0].length; j++) {
				// Print de la tabla de forma que se muestre como matriz
				System.out.print(tabla[i][j] + "\t");
			}
			// Salto de linea
			System.out.println();
		}
	}

}
