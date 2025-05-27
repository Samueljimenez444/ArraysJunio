package test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        // Solicitar al usuario el número de filas y columnas
	        System.out.print("Ingrese el número de filas: ");
	        int filas = scanner.nextInt();
	        System.out.print("Ingrese el número de columnas: ");
	        int columnas = scanner.nextInt();

	        // Crear el array bidimensional
	        int[][] array = new int[filas][columnas];

	        // Rellenar el array con entradas del usuario
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
	                array[i][j] = scanner.nextInt();
	            }
	        }

	        // Mostrar el array
	        System.out.println("El array ingresado es:");
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println(); // Nueva línea después de cada fila
	        }

	        // Cerrar el escáner
	        scanner.close();
	    }
	
	
	}


