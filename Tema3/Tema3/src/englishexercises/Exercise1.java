package englishexercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// We create an integer variable that i will use to storage the numbers
		// introduced by the user
		int list[] = new int[10];
		// We create a java Scanenr to read the inputs
		Scanner reader = new Scanner(System.in);
		// We create a String type variable called user that will store the user inputs
		String user = "S";
		// We create the integer variable numbers that will be used to recieve the
		// numbers introduced by the user to later send that information to the variable
		// list
		int numbers=0;
		// We create a while loop where until the user variable equals "C" the lopp wil
		// continue
		int position;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce 10 numbers");
			// We define numbers in function of the user input
			numbers = reader.nextInt();
			list[i] = numbers;
		}
		//We create a do while loop where
		do {
			/*We print the menu to the user*/
			System.out.println("A. Show Values");
			System.out.println("B. Introduce Values");
			System.out.println("C. Exit the Program");
			//We define the variable user in fuction of the user input
			user=reader.next();
			if(user.equalsIgnoreCase("A")) {
				System.out.println(Arrays.toString(list));
			}
			else if(user.equalsIgnoreCase("B")){
			System.out.println("Introduce the position of the array u want to change (Remember 0 is the starting position)");
				position=reader.nextInt();
				System.out.println("Introduce the number you want in that position of the array");
				numbers=reader.nextInt();
				list[position]=numbers;
			}
			else
				System.out.println("Introduce a correct letter");
			//The loop will iterate until the user writes C
		}while (!user.equals("C")); 
		//We finally close the scanner
		reader.close();
	}
}
