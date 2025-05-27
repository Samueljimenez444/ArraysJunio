package busquedaTesoro;

import java.util.Arrays;
import java.util.Random;

public class BusquedaTesoro {

	public static char[][] tabla;

	static Random rand = new Random();

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

		System.out.print(" ");
		for (int j = 0; j < tabla[0].length; j++) {
			System.out.print(j + " ");
		}
		System.out.println();

		for (int i = 0; i < tabla.length; i++) {

			System.out.print(i + "  ");

			for (int j = 0; j < tabla[i].length; j++) {

				if (tabla[i][j] == 'X') {
					System.out.print("  ");
				} else if (i == posI && j == posJ) {
					System.out.print("J ");

				} else {
					System.out.print(tabla[i][j] + " ");
				}
			}

			System.out.println();
		}
	}

	public void generaPosicionTesoro() {

		boolean colocado = false;

		int posTesoroX = rand.nextInt(0, tabla.length);
		int posTesoroY = rand.nextInt(0, tabla[0].length);

		while (!colocado) {

			if (tabla[posTesoroX][posTesoroY] == ' ') {

				tabla[posTesoroX][posTesoroY] = 'X';

				colocado = true;
			} else {

				posTesoroX = rand.nextInt(0, tabla.length);
				posTesoroY = rand.nextInt(0, tabla[0].length);

			}

		}

	}

	public void generaObstaculos() {

		int obstaculosColocados = 0;

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

		posI = rand.nextInt(0, tabla.length);
		posJ = rand.nextInt(0, tabla[0].length);

		boolean colocado = false;

		while (!colocado) {

			if (tabla[posI][posJ] == ' ') {

				colocado = true;

			} else {

				posI = rand.nextInt(0, tabla.length);
				posJ = rand.nextInt(0, tabla[0].length);

			}

		}

	}

	public boolean mueveJugador(String movimiento) {

		boolean movimientoValido;

		if(movimiento.equalsIgnoreCase("Izquierda") && posJ-1>=0 && tabla[posI][posJ-1]!='*') {
			movimientoValido=true;
			posJ--;
			
		}
		else if(movimiento.equalsIgnoreCase("Derecha") && posJ+1<tabla[0].length && tabla[posI][posJ+1]!='*'){
			movimientoValido=true;
			posJ++;
		}
		else if(movimiento.equalsIgnoreCase("Arriba") && posI-1>=0 && tabla[posI-1][posJ]!='*'){
			movimientoValido=true;
			posI--;
		}
		
		 else {
			movimientoValido = false;
		}

		return movimientoValido;
	}

}
