package assesment1;

import java.util.Scanner;

public class Odd_Even_With_UserInput {

	void EvenOrOdd() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number = scanner.nextInt();
		if(number%2==0) {
			System.out.println("Given Number "+number+" is Even");
		}
		else {
			System.out.println("Given Number "+number+" is Odd");
		}
	}
	
	public static void main(String[] args) {
		Odd_Even_With_UserInput even_With_UserInput=new Odd_Even_With_UserInput();
		even_With_UserInput.EvenOrOdd();
		
	}
}
