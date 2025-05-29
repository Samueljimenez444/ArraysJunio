package connect4;

import java.util.Arrays;
import java.util.Random;

public class Conecta4Jugador {
	
	String nombre;
	
	public char[][] tablero = new char[4][4];

	public Conecta4Jugador(String nombre) {
		this.nombre=nombre;
		inicializaTablero();
	}

	public void inicializaTablero() {
		for (int i = 0; i < tablero.length; i++) {
			Arrays.fill(tablero[i], '-');
		}
	}

	public int jugadorInicial() {

		Random rand = new Random();

		int inicia = rand.nextInt(0, 2);

		return inicia;

	}

	public boolean mueveFicha(int posI, int posJ, char jugador) {

		boolean movimientoValido;

		int contador = 0;

		if (tablero[posI][posJ] == '-') {

			tablero[posI][posJ] = jugador;

			movimientoValido = true;
		} else {
			movimientoValido = false;
		}

		return movimientoValido;
	}

	public void imprimeTablero() {
	
		for (int i = 0; i < tablero.length; i++) {
			System.out.print("\t"+i);
			for (int j = 0; j < tablero[i].length; j++) {
				
			}
		
		}
		
		System.out.println();

		for (int i = 0; i < tablero.length; i++) {
			System.out.print(i+"\t");
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j] + "\t");
			}
			System.out.println();
		}

		
	}
	//Innecesario
	public void limpiarTablero() {
		inicializaTablero();
	}

}
