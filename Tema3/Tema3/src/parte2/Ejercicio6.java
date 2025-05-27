package parte2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos el objeto random
		Random rand = new Random();
		// Creamos la variable entera aleatorio que servira para almacenar los numeros
		// aleatorios entre 1 y 49
		int aleatorio;
		//Creamos la variable entera aciertos que indicara al usuari el numero de aciertos queha conseguido
		int aciertos=0;
		//Creamos la lista entera primitiva que servira para almacenar los datos del decimo del usuario
		int primitiva[]=new int[6];
		//Creamos la variable entera ganador que servira para crear una serie aleatorio que sera considerado ganador
		int ganador[]=new int[6];
		//Creamos un bucle for que se inicializara en 0 iterara 6 veces e ira incrementando su valor en 1
		for(int i=0;i<6;i++) {
			//Creamos un numero aletorio entre 1 y 49
			aleatorio=rand.nextInt(1,50);
			//Definimos el valor de la primitiva en funcion del anterior numero aleatorio
			primitiva[i]=aleatorio;
			//Creamos un numero aleatorio
			aleatorio=rand.nextInt(1,50);
			//definimos el valor de la lista ganador en la posicion i en base al valor aleatorio creado
			ganador[i]=aleatorio;
		}
		//Ordenamos de menor a mayor el array ganador
		Arrays.sort(ganador);
		//Creamos un bucle for para comparar todas las posiciones de los dos arrays
		for(int i=5;i>0;i--) {
			//Si el valor del array es igual 
		 if(ganador[i]==primitiva[i]) {
			 //Se aumentara la cantidad de aciertos
			 aciertos++;
		 }
		}
		//Si los dos arrays son iguales
		if(Arrays.equals(ganador, primitiva)){
			//Se le mostrara al usuario que ha ganado
			System.out.println("Has ganado la primitiva");
		}
		/*Print de arrays y demas instrucciones e informacion util para el usuario*/
		System.out.println("El conjunto de numeros ganadores de la primitiva es");
		System.out.println(Arrays.toString(ganador));
		System.out.println("Tu decimo era el siguiente");
		System.out.println(Arrays.toString(primitiva));
		System.out.println("Has tenido un total de " +aciertos +" aciertos");
	}

}
