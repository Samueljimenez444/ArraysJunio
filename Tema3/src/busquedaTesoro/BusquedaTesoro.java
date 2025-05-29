package busquedaTesoro;

import java.util.Arrays;
import java.util.Random;

public class BusquedaTesoro {

	public static char[][] tabla;

	
	public int posI;
	public int posJ;

	public int numObstaculos;

	public BusquedaTesoro(int x, int y) {

		tabla = new char[x][y];
		numObstaculos = (int) Math.sqrt(x * y) / 2;
	}
	
	
	public void inicializaTablero() {

		for (int i = 0; i < tabla.length; i++) {

			Arrays.fill(tabla[i], ' ');
		}

	}

	public void pintaTablero() {

		for (int j = 0; j < tabla[0].length; j++) {
			System.out.print("\t" + j);
		}

		System.out.println();

		for (int i = 0; i < tabla.length; i++) {

			System.out.print(i + "\t");

			for (int j = 0; j < tabla[i].length; j++) {

				if (tabla[i][j] == 'X') {
					System.out.print("\t");
				} else if (i == posI && j == posJ) {
					System.out.print("J\t");

				} else {
					System.out.print(tabla[i][j] + "\t");
				}
			}

			System.out.println();
		}
	}

	public void generaPosicionTesoro() {

		boolean colocado = false;

		Random rand=new Random();
		
		while (!colocado) {
			
			int posTesoroX = rand.nextInt(0, tabla.length);
			int posTesoroY = rand.nextInt(0, tabla[0].length);

			if (tabla[posTesoroX][posTesoroY] == ' ') {

				tabla[posTesoroX][posTesoroY] = 'X';

				colocado = true;
			}

		}

	}

	public void generaObstaculos() {

		int obstaculosColocados = 0;

		Random rand=new Random();
		
		int posObsX;
		int posObsY;

		while (numObstaculos > obstaculosColocados) {

			posObsY = rand.nextInt(0, tabla[0].length);

			posObsX = rand.nextInt(0, tabla.length);

			if (tabla[posObsX][posObsY] == ' ') {

				tabla[posObsX][posObsY] = '*';

				obstaculosColocados++;
			}

		}

	}

	public void generaPosicionJugador() {

		boolean colocado = false;

		Random rand=new Random();
		
		while (!colocado) {

			posI = rand.nextInt(0, tabla.length);
			posJ = rand.nextInt(0, tabla[0].length);

			if (tabla[posI][posJ] == ' ') {

				colocado = true;

			} else {

				posI = rand.nextInt(0, tabla.length);
				posJ = rand.nextInt(0, tabla[0].length);

			}

		}

	}

	public boolean mueveJugador(String movimiento) {

		boolean movimientoValido = true;
		
		switch (movimiento.toUpperCase()) {

		case "ARRIBA":

			if (posI - 1 >= 0 && tabla[posI - 1][posJ] != '*') {
				movimientoValido = true;
				posI--;
			}

			break;

		case "ABAJO":

			if (posI + 1 < tabla.length && tabla[posI + 1][posJ] != '*') {
				movimientoValido = true;
				posI++;
			}
			break;

		case "IZQUIERDA":

			if (posJ - 1 >= 0 && tabla[posI][posJ - 1] != '*') {
				movimientoValido = true;
				posJ--;
			}

			break;

		case "DERECHA":

			if (posJ + 1 < tabla[0].length && tabla[posI][posJ + 1] != '*') {
				movimientoValido = true;
				posJ++;
			}

			break;

		default:
			
			movimientoValido = false;
			
			break;
		}

		return movimientoValido;
	}

}
