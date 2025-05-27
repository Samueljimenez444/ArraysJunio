package parte2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos el objeto Random
		Random rand = new Random();
		// Cramos un array entero lista que tendra longitud de 30
		int lista[] = new int[30];
		// Creamos la variable entera numeros
		int numeros;
		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		//Creamos un bucle for donde i=0 iterara mientras i<30 e i incrementara su valor en 1 por cada iteracion del bucle
		for (int i = 0; i < 30; i++) {
			// Definimos el valor de numeros en funcion de un valor aleatorio
			numeros =rand.nextInt(1,10);
			lista[i]=numeros;
		}
		//Ordenamos los valores del array
		Arrays.sort(lista);
		//Prints que le indican al usuario que el array esta ordenado
		System.out.println("Aqui esta el array ordenado");
		System.out.println(Arrays.toString(lista));
		//Cierre Scanner
		lectura.close();
	}

}
