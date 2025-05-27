package parte2;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Creamos una lista entera de longitud 55 
		int lista[]=new int[55];
		//Creamos la variable entera inicio y la inicializamos a 0
		int inicio=0;
		//Creamos un bucle for que se inicializa en 1 iterara 10 veces y el valor de i ira incrementado en 1 por cada iteracion
		for(int i=1;i<=10;i++){
			//Usamos la clase arrays.fill para rellenar el array lista desde inicio hasta inicio + 1 con el valor de i
	Arrays.fill(lista, inicio, inicio+i, i);
	//Sumamos al valor de inicio el valor de i
	inicio+=i;
	
		}
		//Mostramos el array
System.out.println(Arrays.toString(lista));
	}

}
