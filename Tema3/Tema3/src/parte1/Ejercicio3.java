package parte1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos la variable entera usuario que servira para almacenar los numeros del
		// usuario
		int usuario;
		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Creamos el array numero de tipo entero que tendra una longitud de 10
		int numeros[] = new int[10];

		// Creamos un bucle for que iterara 10 veces donde inicializamos la variable en
		// 10 e iremos a reverso
		for (int i = 0; i < 10; i++) {
			// Print que le indica al usuario que introduzca un numero
			System.out.println("Introduzca un numero");
			// Definimos la variable usuario en base al input del usuario
			usuario = lectura.nextInt();
			// Definimos las distintas secciones de la tabla en funcion del input del
			// usuario
			numeros[i] = usuario;
		}
		// Creamos un bucle for donde buscamos imprimir los numeros del array pero en
		// inverso
		for (int i = 9; i >= 0; i--) {
			// Print de loss numeros del array en inversa
			System.out.print(numeros[i] + " ");
		}
		// Cierre Scanner
		lectura.close();
	}

}
