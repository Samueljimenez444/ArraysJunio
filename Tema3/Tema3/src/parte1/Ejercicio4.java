package parte1;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos el array entero num que tendra una longitud de 12
		int num[] = new int[12];
		/*
		 * Definimos unas de las posiciones de la tabla tal y como se nos pide en el
		 * enunciado
		 */
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;

//Creamos un bucle for-each donde 
		for (int valor : num) {
			// Mostramos todos los numeros que estan introducidos en el array
			System.out.print(valor + " ");
		}
//Como podemos ver las secciones que no tienen elemento se les asigna automaticamente el valor 0
	}

}
