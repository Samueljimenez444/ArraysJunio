package recuperacion;

import java.util.Random;
import java.util.Scanner;

public class ExamenHundirLaFlota {

	static Scanner lectura = new Scanner(System.in);

	static char[][] tableroi;

	static char[][] tableroJ1;

	static char[][] tableroJ2;

	static char[][] inicializaTablero(int columnas, int filas) {

		tableroi = new char[filas][columnas];

		for (int i = 0; i < tableroi.length; i++) {

			for (int j = 0; j < tableroi[0].length; j++) {
				tableroi[i][j] = '-';
			}
		}

		return tableroi;
	}

	static void crearTablero(int columnas, int filas) {
		tableroJ1 = new char[filas][columnas];
		tableroJ2 = new char[filas][columnas];

		for (int i = 0; i < tableroi.length; i++) {

			for (int j = 0; j < tableroi[0].length; j++) {
				tableroJ1[i][j] = 'A';
				tableroJ2[i][j] = 'A';
			}
		}
	}
	
	static void pintaTablero(char[][] tableroJ1) {
		
		
		System.out.print("  ");
		
		char letra='A';
		
		for (int i = 0; i < tableroJ1.length; i++) {

			System.out.print(letra + " ");

			letra++;
		}

		System.out.println();

		for (int i = 0; i < tableroi.length; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < tableroi[0].length; j++) {

				System.out.print(tableroJ1[i][j] + " ");

			}
			System.out.println();
		}
	}

	static void generaBarquitos(char[][] tablero, int numBarquitos) {

		Random rand = new Random();

		int posicionx;

		int colocados = 0;

		int posiciony;

		int longitud;

		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero[0].length; j++) {

				while (numBarquitos != colocados) {
					longitud = tablero.length;

					posicionx = rand.nextInt(0, longitud);

					longitud = tablero[0].length;

					posiciony = rand.nextInt(0, longitud);

					if (tablero[posicionx][posiciony] != 'B') {

						tablero[posicionx][posiciony] = 'B';

						colocados++;
					}

				}

			}

		}

	}

	public static void main(String[] args) {

		int filas;

		int columnas;

		char letra = 'A';

		int barcos;

		int numBarquitos;

		System.out.println("Introduce el numero de filas");
		filas = lectura.nextInt();

		System.out.println("Introduce el numero de columnas");
		columnas = lectura.nextInt();

		numBarquitos = (int) Math.sqrt(filas * columnas);

		inicializaTablero(columnas, filas);
		System.out.println("ုြျိူ်ုြျိ");
		crearTablero(columnas, filas);
		generaBarquitos(tableroJ1, numBarquitos);

		pintaTablero(tableroJ1);

	}

}
