package parte1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos el array entero numeros que servira para ir almacenando los distintos
		// numeros del usuario
		int numeros[] = new int[8];
		// Creamos la variable entera usuario que servira para almacenar el numero
		// introducido por el usuario
		int usuario;
		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);

//Bucle for que iterara 10 veces e ira incrementado su valor por cada iteracion
		for (int i = 0; i < 8; i++) {
			// Print con las instrucciones
			System.out.println("Introduzca un numero");
			// El valor de usuario dependera del input
			usuario = lectura.nextInt();
			// Definimos cada seccion de la lista en funcion del numero del usuario
			numeros[i] = usuario;

		}
		// Creamos un bucle for each donde veremos que numero son pares o impares
		for (int valor : numeros) {
			// Si el numero del array entre dos tiene resto distinto a cero
			if (valor % 2 != 0) {
//Se le muestra al usuario que es impar
				System.out.println(valor + " Impar");
			}
			// Si por otra parte la division da resto cero
			else if (valor % 2 == 0) {
				// El numero sera par y se le mostrara al usuario
				System.out.println(valor + " Par");
			}
		}
		// Cierre Scanner
		lectura.close();
	}

}
