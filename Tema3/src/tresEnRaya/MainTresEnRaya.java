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
		
		int inicial=tablero.jugadorInicial();
		
		do {
			
		if(inicial==1) {
			
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
				
				inicial=tablero.jugadorInicial();
			}
			
			System.out.println("Introduce la posicion (Eje x)");
			posI=lectura.nextInt();
			
			System.out.println("Introduce la posicion (Eje y)");
			posJ=lectura.nextInt();
			
			if(!tablero.usuarioMueveFicha(posI, posJ)) {
				while(!tablero.usuarioMueveFicha(posI, posJ)) {
				System.out.println("Posicion invalida, reintroduzca una posicion valida");
				
				System.out.println("Introduce la posicion (Eje x)");
				posI=lectura.nextInt();
				
				System.out.println("Introduce la posicion (Eje y)");
				posJ=lectura.nextInt();
				
				}
			}
			
			tablero.imprimeTablero();
			
			if(tablero.esGanador('O')) {
				
				lectura.nextLine();
				
				System.out.println("Ha ganado el jugador");
				
				System.out.println("Introduce si para jugar de nuevo");
				
				jugar=lectura.nextLine();
				
				tablero.reiniciaTablero();
				
				inicial=tablero.jugadorInicial();
				
			}
			
			
		}
		else {

			System.out.println("Introduce la posicion (Eje x)");
			posI=lectura.nextInt();
			
			System.out.println("Introduce la posicion (Eje y)");
			posJ=lectura.nextInt();
			
			
			
			if(!tablero.usuarioMueveFicha(posI, posJ)) {
				System.out.println("Posicion invalida, introduzca una posicion valida");
				
				while(!tablero.usuarioMueveFicha(posI, posJ)) {
					System.out.println("Posicion invalida, reintroduzca una posicion valida");
					
					System.out.println("Introduce la posicion (Eje x)");
					posI=lectura.nextInt();
					
					System.out.println("Introduce la posicion (Eje y)");
					posJ=lectura.nextInt();
					
					}
			}
			
			
			tablero.imprimeTablero();
			
			if(tablero.esGanador('O')) {
				
				lectura.nextLine();
			
				System.out.println("Ha ganado el jugador");
				
				System.out.println("Introduce si para jugar de nuevo");
				
				jugar=lectura.nextLine();
				
				tablero.reiniciaTablero();
				
				inicial=tablero.jugadorInicial();
			
			}
			
			
			tablero.mueveFichaAleatoria();
			
			
			if(tablero.esGanador('X')) {
				
				lectura.nextLine();
			
				System.out.println("Ha ganado la maquina...");
				
				System.out.println("Introduce si para jugar de nuevo");
				
				jugar=lectura.nextLine();
				
				tablero.reiniciaTablero();
				
				inicial=tablero.jugadorInicial();
			
			}
			
			tablero.imprimeTablero();	
		}
		
		}while(jugar.equalsIgnoreCase("Si"));
		
		System.out.println("Saliendo...");
		lectura.close();
		
	
	}

}
