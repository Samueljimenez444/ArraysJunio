package parte4;

public class Ejercicio1 {
	// Función que recibe un array de enteros y devuelve la suma de sus elementos
	public static int sumarElementos(int[] array) {
		int suma = 0;
		for (int num : array) {
			suma += num;
		}
		return suma;
	}

// Método main para probar la función
	public static void main(String[] args) {
	//Creamos una tabla entera y la rellenamos con 5 valores
		int[] numeros = { 1, 2, 3, 4, 5 }; // Ejemplo de array
		int[]soremun = {5, 4 , 3 ,2 ,10};
		//Creamos la variable entera resultado y le damos el valor de la funcion sumarElementos
		int resultado = sumarElementos(soremun);
		//Print del resultado
		System.out.println("La suma de los elementos del array es: " + resultado);
	}
}
