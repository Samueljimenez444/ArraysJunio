package parte4;



public class Ejercicio4 {
	public static int buscar(int t[], int clave) {
		//Creamos la variable entera contador que servira para contabilizar las posiciones del array y que hay en esas posiciones
		int contador=0;
		//Creamos un bucle while que seguira iterando mientras el contador sea menor a la longitud del array y la clave sea distinta a la posicion del array en funcion del contador
		while(contador<t.length && clave!=t[contador] ){
			//Aumentamos el valor de contador en 1
			contador++;
			
		}
		//Si el contador tiene el mismo valor que la longitud del array
		if(contador==t.length){
			//Contador es igual a -1
			contador=-1;
		}
		//Devolvemos el contador
		return contador;
	}

	public static void main(String[] args) {
		//Creamos la variable entera tabla 
		int tabla[]= {1,2,1,1,3};
		//Print tras usar la tabla en nuestra funcion buscar
		System.out.println(buscar(tabla,3));
	}

}
