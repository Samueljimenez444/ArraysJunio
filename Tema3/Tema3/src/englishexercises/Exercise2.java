package englishexercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		//we create the integer variable list that will storage the arithmetic succesion
		int list[];
		//We create the integer variable initial that will be the number where the succesion will start
		int initial;
		//We create the variable sequence where the user will storage the value of increase 
		int sequence;
		//We create the variable lenght where we will storage the lenght of the array
		int lenght;
		//We create the variable sum were we will calculate the succesion
		int sum;
		//We create the scanner reader
		Scanner reader=new Scanner(System.in);
		
		//Print for the user
		System.out.println("Introduce the lenght of the array");
		//We define the variable in function of the user 
		lenght=reader.nextInt();
		list= new int[lenght];
		//Print for the user
		System.out.println("Introduce the initial value of the arithmethic succesion");
		//We define the variable in function of the user 
		initial=reader.nextInt();
		//Print to the user
		System.out.println("Introduce the number");
		//We define the variable in function of the user 
		sequence=reader.nextInt();
		//Sum equals to the initial number of the succesion so we can sum the numbers right
		sum=initial;
		//We create a loop 
		for(int i=0;i<lenght;i++){
			//We define each position of our list in fuction of the variable sum
			list[i]=sum;
			//We define the sum as a consecutive sumatory of the value sequence
			sum+=sequence;
			
		}
		//We show the array to the user
		System.out.println(Arrays.toString(list));
		//We finally close the scanner
		reader.close();
	}

}
