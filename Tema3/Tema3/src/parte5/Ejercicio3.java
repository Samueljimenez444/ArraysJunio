package parte5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
	//Creamos una funcion tipo matriz [][] con variable entera tipo matriz lista en la que desordenaremos una matriz
public static int[][] desordenar(int[][] lista) {
	//Creamos el objeto Random
	Random rand=new Random();
	//Creamos la variable entera posicionf que servira para almacenar la posicion de filas
	int posicionf;
	//Creamos la variable entera posicionc que servira para almacenar la posicion de columnas
	int posicionc;
	//Creamos la variable entera auxiliar que nos servira para no repetir numeros a la hora de desordenar el array
	int auxiliar;
	//Creamos un bucle for anidado que recorrera el array
	for (int i = 0; i < lista.length; i++) {
		for (int j = 0; j < lista[0].length; j++) {
			//Definimos la posicion c como un numero aleatorio entre 0 y la longitu del array en cuanto a columnnas
	posicionc=rand.nextInt(0,lista[0].length);
	//Definimos la posicion f como un numero aleatorio entre 0 y la longitu del array en cuanto a filas

	posicionf=rand.nextInt(0,lista.length);
	//Auxiliar tomara el valor de la lista en la posicion [i][j]
			auxiliar=lista[i][j];
			//La lista en i,j  sera igual a la lista en la posicion aleatoria
			lista[i][j]=lista[posicionf][posicionc];
			//
			lista[posicionf][posicionc]=auxiliar;
		}
	}
	return lista;
}
	public static void main(String[] args) {
		// Creamos la variable entera tabla que servira para almacenar valores
		int[][] tabla;
		// Creamos la variable entera longitud que servira para definir la longitud de
		// la tabla
		int filas;
		// Creamos la variable entera columnas que servira para definir las columnas de
		// la matriz
		int columnas;
		// Creamos la variable entera numero que servira para definir los valores de la
		// tabla
		int numero = 0;
		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Print
		System.out.println("Introduzca las filas de la tabla");
		// Definimos la variable longitud en funcion del input del usuario
		filas = lectura.nextInt();
		// Print
		System.out.println("Introduzca las columnas de la tabla");
		// Definimos las columnas de la tabla en fucion del input del usuario
		columnas = lectura.nextInt();
		// Definimos la longitud de la tabla en funcion de la variables filas y columnas
		tabla = new int[filas][columnas];
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				System.out.println("Define el valor en la posicion " + (i + 1)+" " + (j + 1));
				numero = lectura.nextInt();
				tabla[i][j] = numero;
			}
		}
		System.out.println("Esta es la tabla sin desordenar");
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				// Print del array en forma de matriz
				System.out.print(tabla[i][j] + "\t");

			}
			// Salto de linea
			System.out.println();
		}
		desordenar(tabla);
		System.out.println("Esta es la tabla desordenada");
		System.out.println(Arrays.deepToString(tabla));
		lectura.close();
	}

}
