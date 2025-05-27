package parte4_1;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {
	public static int[]busqueda(int[][] numeros){
		/*Definimos las funciones Min y Max value en funcion de los valores maximo y minimo que pueden tomar*/
	    int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //Creamos un for each que recorrera las columnas de la matriz e ira definiendo cada valor de la columna en funcion de la variable numeros
        for (int[] columna : numeros) {
        	//Creamos otro for each que realizara lo mismo que el anterior pero esta vez dara el valor de filas en funcion de columnas
            for (int filas: columna) {
            	//Si el numero es menor que el minimo entero
                if (filas < min) {
                	//El min sera el numero que era menor
                    min = filas;
                }
                //Si el numero es mayor que el max entero
                if (filas > max) {
                	//El max entero sera el numero anterior
                    max = filas;
                }
            }
        }
        //Devolvemos el min y el maximo
        return new int[]{min, max};
    }

	public static void main(String[] args) {
		//Creamos el objeto Random
		Random rand = new Random();
		//Creamos la variable entera aleatorio
		int aleatorio;
		//Creamos una matriz bidimensional de 6 filas por 10 columnas
		int[][] tabla = new int[6][10];
		//Creamos un for que rellene la matriz por fila y columna
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				//Definimos aleatorio como un numero aleatorios entre 0 y 1000
				aleatorio=rand.nextInt(0,1001);
				//Definimos el valor de la tabla en funcion del valor de i,j y  de aleatorio
				tabla[i][j]=aleatorio;
			}
		}
		//Print de la tabla
		System.out.println("Esta es la tabla creada aleatoriamente");
		//Salto de linea
		System.out.println();
		//Creamos otro for que muestre la tabla al usuario
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				// Print de la tabla de forma que se muestre como matriz
				System.out.print(tabla[i][j] + "\t");
			}
			// Salto de linea
			System.out.println();
		}
		//Salto de linea
		System.out.println();
		System.out.println("Estos son los valores maximos del array");
		//Print de los valores maximos de la tabla del array tras llamar a la funcion busqueda
		System.out.println(Arrays.toString(busqueda(tabla)));	
	}
}
