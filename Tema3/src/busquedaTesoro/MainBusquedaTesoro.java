package busquedaTesoro;

import java.util.Arrays;
import java.util.Scanner;

public class MainBusquedaTesoro {

	public static void main(String[] args) {

		BusquedaTesoro tabla = null;

		String movimiento;

		int x;
		int y;

		Scanner lectura = new Scanner(System.in);

		System.out.println("Introduce el tamaño (x) del tablero");
		x = lectura.nextInt();

		System.out.println("Introduce el tamaño (y) del tablero");
		y = lectura.nextInt();

		tabla = new BusquedaTesoro(x, y);

		tabla.inicializaTablero();

		tabla.generaObstaculos();

		tabla.generaPosicionTesoro();

		tabla.generaPosicionJugador();

		tabla.pintaTablero();

		lectura.nextLine();

		System.out.println(tabla.posI + " " + tabla.posJ);

		do {
			movimiento = lectura.nextLine();

			if (tabla.mueveJugador(movimiento)) {
				
				System.out.println("Movimiento valido");
			} 
			else {
				System.out.println("Movimiento invalido");
			}

			tabla.pintaTablero();
			
			
		} while (tabla.tabla[tabla.posI][tabla.posJ] !='X');
		System.out.println("Has ganado");

		lectura.close();
	}

}
