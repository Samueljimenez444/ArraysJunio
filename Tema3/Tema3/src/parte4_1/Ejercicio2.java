package parte4_1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	public static int[][] traspuesta(int[][] tabla , int filas, int columnas) {
		int[][] trasposicion=new int[columnas][filas];
		for(int i=0;i<trasposicion.length;i++){
			for(int j=0;j<trasposicion[0].length;j++){
				trasposicion[i][j]=tabla[j][i];
			}
		}
		return tabla;
	}

	public static void main(String[] args) {
		int filas;
		int columnas;
		Scanner lectura = new Scanner(System.in);
		System.out.println("Introduce el numero de filas");

		filas = lectura.nextInt();
		System.out.println("Introduce el numero de columnas de la matriz");

		columnas = lectura.nextInt();
		int[][] matriz = new int[filas][columnas];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print("Ingrese el valor para la posición [" + (i+1) + "][" + (j+1) + "]: ");
				matriz[i][j] = lectura.nextInt();

			}
		}
		System.out.println(Arrays.deepToString(traspuesta(matriz,columnas,filas)));	
		lectura.close();
	}

}
