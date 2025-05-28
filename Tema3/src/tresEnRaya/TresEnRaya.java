package tresEnRaya;

import java.util.Arrays;
import java.util.Random;

public class TresEnRaya {

	public char[][] tablero = new char[3][3];

	public TresEnRaya() {

		for (int i = 0; i < tablero.length; i++) {

			Arrays.fill(tablero[i], '-');

		}
	}

	public void imprimeTablero() {

		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero.length; j++) {

				System.out.print(tablero[i][j] + "\t");

			}
			System.out.println();
		}

	}

	public int jugadorInicial() {
		Random rand = new Random();

		int aleatorio = rand.nextInt(0, 2);

		return aleatorio;
	}

	public void mueveFichaAleatoria() {

		Random rand = new Random();

		int posI;
		int posJ;

		do {

			posI = rand.nextInt(0, 3);
			posJ = rand.nextInt(0, 3);

		} while (tablero[posI][posJ] != '-');

		tablero[posI][posJ] = 'X';

	}

	public boolean usuarioMueveFicha(int posI, int posJ) {

		boolean colocada = true;

		if (posI >= 3) {
			posI = 2;
			
		} else if (posI < 0) {
			posI = 0;
			
		}

		if (posJ >= 3) {
			posJ = 2;
			
		} else if (posJ < 0) {
			posJ = 0;
		}

		if (tablero[posI][posJ] != '-') {
			colocada = false;
		} else {
			colocada = true;
			tablero[posI][posJ] = 'O';
		}

		return colocada;
	}

	public boolean esGanador(char caracter) {

		boolean ganador = false;
		
		int contador = 0;

		for (int i = 0; i < tablero.length; i++) {
			
			contador = 0;
			
			for (int j = 0; j < tablero[i].length; j++) {

				if (tablero[i][j] == caracter) {
					contador++;

				}

				if (contador == 3) {
					ganador = true;
				}

			}
		}

		for (int j = 0; j < tablero[0].length; j++) {
			
			contador = 0;

			for (int i = 0; i < tablero.length; i++) {
				
				if (tablero[i][j] == caracter) {
					contador++;

				}

				if (contador == 3) {
					ganador = true;
				}
			}
		}

		for (int i = 0; i < tablero.length; i++) {
			contador=0; 
			if (tablero[i][i] == caracter) {
				contador++;
			}
			
			if (contador == 3) {
				ganador = true;
			}
		}

		if(tablero[0][2]==caracter && tablero[1][1]==caracter && tablero[2][0]==caracter) {
			ganador=true;
		}

		return ganador;
	}

	public void reiniciaTablero() {

		for (int i = 0; i < tablero.length; i++) {

			Arrays.fill(tablero[i], '-');

		}
	}

}
