package parte5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
	public static int ordenar(int []lista) {
		// Creamos el objeto random para crear numeros aleatorios
				Random rand = new Random();

				// Creamos la variable entera posicion
				int pos;

				// Creamos la Variable entera auxiliar que servira para realizar la desordenacion de la tabla
				int auxiliar;
				//Creamos un bucle for anidado que recorrera la tabla
		for (int i = 0; i < lista.length; i++) {
			pos=rand.nextInt(0,lista.length);
			auxiliar=lista[i];
			lista[i]=lista[pos];
			lista[pos]=auxiliar;
		}
	
		return 0;
	}
	public static void main(String[] args) {
		//Creamos la variable entera tabla que servira para almacenar valores
		int[] tabla;
		//Creamos la variable entera longitud que servira para definir la longitud de la tabla
		int longitud;
		//Creamos la variable entera numero que servira para definir los valores de la tabla
		int numero=0;
		//Creamos la variable entera contador que servira para poder rellenar la tabla en funcion de su longitud
		int contador = 0;
		//Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		//Print
		System.out.println("Introduzca la longitud de la tabla");
		//Definimos la variable longitud en funcion del input del usuario
		longitud = lectura.nextInt();
		//Definimos la longitud de la tabla en funcion de la variable longitud
		tabla = new int[longitud];
		//Creacion bucle while para rellenar la tabla
		while (contador < longitud) {
			//Print
			System.out.println("Introduzca el valor para la posicion " + (contador + 1));
			//Definimos numero en funcion del input del usuario
			numero = lectura.nextInt();
			//El valor de la tabla en la posicion sera igual a numero
			tabla[contador] = numero;
			//Aumentamos el valor de contador en 1 por cada iteracion
			contador++;
		}
		/*Print de los resultados*/
		System.out.println(Arrays.toString(tabla));
		ordenar(tabla);
		System.out.println(Arrays.toString(tabla));
		lectura.close();
	}


}
