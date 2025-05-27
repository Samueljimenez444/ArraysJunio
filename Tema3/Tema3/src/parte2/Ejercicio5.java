package parte2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos la lista entera lista que servira para almacenar 1000 numeros
		int lista[] = new int[1000];
		// Creamos el objeto random
		Random rand = new Random();
		// Creamos la variable entera aleatorio que servira para almacenar los numeros
		// aleatorios
		int aleatorio;
		// Creamos la variable entera numero que servira como el numero que introducira
		// el usuario y buscaremos dentro del array
		int numero;
		// Creacion del objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Creacion de un contador que determinara cuantas veces aparece el numero en la
		// lista
		int contador = 0;

		// Creamos un bucle for que se inicializa en uno itera 1000 veces ypor cada
		// iteracion el valor de i aumenta en 1
		for (int i = 0; i < 1000; i++) {
			// Definimos el valor de la variable en funcion de un numero random entre 0 y 99
			aleatorio = rand.nextInt(0, 100);
			// Definimos cada posicion del
			lista[i] = aleatorio;
		}
		// Creamos un bucle do-while donde
		do {
			// Mientras el usuario introduzca un numero incorrecto se le pedira que lo
			// vuelva a introducir
			System.out.println(
					"Introduce un numero entre el 1 y el 99 y te diremos si esta en el array y en que posiciones aparece");
			numero = lectura.nextInt();
		} while (numero < 0 || numero > 100);
		System.out.println("El numero aparece en las posiciones");
		// Creamos un bucle for incializado en 1 que iterara 1000 veces e ira
		// incrementando su valor en 1 donde
		for (int i = 0; i < 1000; i++) {

			// Si el numero que buscamos equivale al numero en ese punto de la lista
			if (numero == lista[i]) {
				// Se printea la posicion donde sale el numero
				System.out.print(i + " ");
				// Aumentamos en 1 el valor del contador
				contador++;
			}
		}

		//Print final de cuantas veces aparece el numero
		System.out.println("El numero aparece " + contador + " veces");
		// Cierre Scanner
		lectura.close();

	}

}
