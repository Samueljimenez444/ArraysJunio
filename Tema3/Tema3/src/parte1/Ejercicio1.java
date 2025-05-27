package parte1;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos el objeto rand que actuara como un aleatorizador de numeros
		Random rand = new Random();
		// Creamos un array de longitud 10 que almacenara numeros enteros
		int numeros[] = new int[10];
		// Creamos la variable entera aleatorio que servira para almacenar numeros
		// aleatorios
		int aleatorio;
//Creamos un bucle for donde el bucle se repetira unas 10 veces para generar 10 numeros aleatorios
		for (int i = 0; i < 10; i++) {
			// Definimos aleatorio como un numero aleatorio entre 1 y 100 donde este numero
			// variara por cada iteracion del bucle
			aleatorio = rand.nextInt(1, 101);
			// Definimos cada seccion de la lista como un numero aleatorio
			numeros[i] = aleatorio;

		}
		// Print de cada uno de los numeros aleatorios
		System.out.println(Arrays.toString(numeros));
	}

}
