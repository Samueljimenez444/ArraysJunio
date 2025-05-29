package connect4;

import java.util.Scanner;

public class Conecta4Main {

	public static void main(String[] args) {

		Scanner lectura = new Scanner(System.in);

		String nombre;
		
		System.out.println("Introduce tu nombre");
		
		nombre=lectura.nextLine();
		
		Conecta4Jugador jugador1=new Conecta4Jugador(nombre);
		
		System.out.println(jugador1);

		int posI;
		int posJ;	
		
	

	}

}
