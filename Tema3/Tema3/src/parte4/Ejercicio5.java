package parte4;

import java.util.Arrays;

public class Ejercicio5 {
	public static int[] buscarTodos(int t[], int valor) {
		//Creamos el entero tabla que servira para imprimir una tabla 
		int[] tabla;
		//Creamos la variable entera contador y la inicializamos a 0
		int contador=0;
		//Creamos un bucle for que recorrera toda la longitud de la tabla
		for(int i=0;i<t.length;i++){
			//Si el valor que buscamos es igual a la tabla en i
			if(valor==t[i]){
				//Aumentamos en 1 el valor del contador
				contador++;
			}
		}
		//Definimos la longitud de la tabla en funcion del contador
		tabla=new int[contador];
		//Reiniciamos la variable contador
		contador=0;
		//Creamos un for que recorrera la tabla t.len-nºelementos+1
		for(int i=0;i<t.length;i++){
			//Si t en funcion de i es igual al valor
			if(t[i]==valor) {
				//La tabla en valor del contador valdra i
			tabla[contador]=i;
			//El valor de contador aumenta en 1
			contador++;
			}
		}
		//Si el contador se ha quedado en cero 
		if(contador==0){
			//La tabla sera una tabla vacia
			tabla=new int[0];
		}
		//Devolvemos la tabla
		return tabla;
	}
	public static void main(String[] args) {
		//Creamos la variable entera tabla
		int[] tabla= {1,3,3,4,3};
		//Creamos la variable entera busqueda
		int busqueda;
		//Print del array 
		System.out.println(Arrays.toString(buscarTodos(tabla,3)));

	}

}
