package parte1;


import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Creamos el objeto random para randomizar los valores del array
		Random rand = new Random();
		// Creamos un entero buscador que servira para almacenar el numero introducido
		// por el usuario
		int buscador;
		// Creamos el array entero numeros que servira para almacenar 100 numeros
		// aleatorios
		int numeros[] = new int[100];
//Creamos la variable aleatorio con la que definiremos el valor de cada una de las secciones del array
		int aleatorio;
//Creamos el objeto scanner
		Scanner lectura = new Scanner(System.in);
		//Print de indicaciones del usuario
		System.out.println("Di un numero y te digo en que posiciones del array aparece");
		//Creamos un bucle for donde inicializamos la variable i en 0, se repetira hasta que i>=100 e incrementara el valor de i en 1 por cada iteracion
		for (int i = 0; i < 100; i++) {
			//De
			aleatorio = rand.nextInt(1, 11);
			numeros[i] = aleatorio;

		}
		buscador = lectura.nextInt();
		System.out.println("El numero aparece en las posiciones");
		for(int i = 0; i < 100; i++) {
			if(buscador==numeros[i]) {
				System.out.print(i +" ");
			}
		}
		//cierre Scanner
		lectura.close();
		}
	}

	


