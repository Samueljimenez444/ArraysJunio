package tresEnRaya;

import java.util.Scanner;

public class MainTresEnRaya {

	public static void main(String[] args) {
		
		TresEnRaya tablero=new TresEnRaya();
		
		String jugar="Si";
		
		Scanner lectura=new Scanner(System.in);
		
	
	
		System.out.println("Bienvenidos a nuestro 3 en raya");
		System.out.println("Si elijes una posicion invalida (fuera de limite) se tomara la posicion al borde de este");
		
		int posI;
		int posJ;
		
		do {
			
		if(tablero.jugadorInicial()==1) {
			
			tablero.mueveFichaAleatoria();
			
			System.out.println();
			
			tablero.imprimeTablero();
			
			System.out.println();
			
			
			if(tablero.esGanador('X')) {
				
				lectura.nextLine();
				
				System.out.println("Ha ganado la maquina");
				
				System.out.println("Introduce si para jugar de nuevo");
				
				jugar=lectura.nextLine();
				
				tablero.reiniciaTablero();
				
			}
			
			System.out.println("Introduce la posicion (Eje x)");
			posI=lectura.nextInt();
			
			System.out.println("Introduce la posicion (Eje y)");
			posJ=lectura.nextInt();
			
			if(!tablero.usuarioMueveFicha(posI, posJ)) {
				
				System.out.println("Posicion invalida");
			}
			
			tablero.imprimeTablero();
			
			if(tablero.esGanador('O')) {
				
				lectura.nextLine();
				
				System.out.println("Ha ganado el jugador");
				
				System.out.println("Introduce si para jugar de nuevo");
				
				jugar=lectura.nextLine();
				
				tablero.reiniciaTablero();
				
			}
			
			
		}
		else {

			System.out.println("Introduce la posicion (Eje x)");
			posI=lectura.nextInt();
			
			System.out.println("Introduce la posicion (Eje y)");
			posJ=lectura.nextInt();
			
			
			
			if(!tablero.usuarioMueveFicha(posI, posJ)) {
				System.out.println("Posicion invalida");
			}
			
			tablero.imprimeTablero();
			
			if(tablero.esGanador('O')) {
				
				lectura.nextLine();
			
				System.out.println("Ha ganado el jugador");
				
				System.out.println("Introduce si para jugar de nuevo");
				
				jugar=lectura.nextLine();
				
				tablero.reiniciaTablero();
			
			}
			
			
			tablero.mueveFichaAleatoria();
			
			
			if(tablero.esGanador('X')) {
				
				lectura.nextLine();
			
				System.out.println("Ha ganado la maquina...");
				
				System.out.println("Introduce si para jugar de nuevo");
				
				jugar=lectura.nextLine();
				
				tablero.reiniciaTablero();
			
			}
			
			tablero.imprimeTablero();	
		}
		
		}while(jugar.equalsIgnoreCase("Si"));
		
		System.out.println("Saliendo...");
		lectura.close();
		
	
	}

}
