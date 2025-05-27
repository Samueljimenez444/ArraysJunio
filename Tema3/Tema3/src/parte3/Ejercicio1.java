package parte3;



public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos un array bidimensional entero llamado matriz que almacenara el
		// siguiente conjunto de numeros
		int[][] matriz = { { 0, 30, 2, 0, 0, 5 }, { 75, 0, 0, 8, 0, 0 }, { 0, 0, -2, 9, 0, 11 } };

		/*
		 * Creamos un bucle for anidado que recorrera el array por fila y columna y
		 * finalmente mostrara la tabla al usuario
		 */
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			// Print que realizara un salto de linea
			System.out.println();
		}
	}
}
