package parte5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
	public static int[][] Torre(int[][] tabla, int fila, int columna) {

		return tabla;
	}

	public static void main(String[] args) {
		String[][] tablero = new String[8][8];
		int posFila;
		int posColumna;
		String pieza;
		Scanner lectura = new Scanner(System.in);
		System.out.println("Introduce la fila");
		posFila = lectura.nextInt();
		System.out.println("Introduce la columna");
		posColumna = lectura.nextInt();
		System.out.println("Introduce la inicial de la pieza que quieres ver");
		pieza = lectura.next();
		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero[0].length; j++) {
				tablero[i][j] = "O";
			}
		}
		tablero[posFila][posColumna] = pieza;
		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero[0].length; j++) {
				System.out.print(tablero[i][j]+" ");
			}
			System.out.println();
		}
		lectura.close();
	}

}
