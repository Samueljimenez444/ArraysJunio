package parte1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos el objeto Scanner lectura
		Scanner lectura = new Scanner(System.in);
		// Creamos la variable tipo double usuario que servira para almacenar los
		// numeros introducidos por el usuario
		double numeroUsuario;
		// Creamos un array de tipo double de longitud 5 que nos servira para almacenar
		// los numeros introducidos por el usuario y mostrarlos por pantalla
		double numeros[] = new double[5];

		// Creamos un bucle que iterara 5 veces donde
		for (int i = 0; i < 5; i++) {
			// Print que le indica al usuario que introduzca un numero
			System.out.println("Introduce un numero");
			// Se define la variable en funcion del input del usuario
			numeroUsuario = lectura.nextDouble();
			// Se define cada una de las secciones del array en funcion del numero
			// introducido por el usuario
			numeros[i] = numeroUsuario;
		}
		// Creamos un bucle for-each donde
		for (double valor : numeros) {
			// Se mostraran todos los numeros almacenados en el array
			System.out.print(valor + " ");
		}
		// Cierre Scanner
		lectura.close();
	}

}
