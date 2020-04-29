package Plus_Minus_Mult_Divide_Calculator;
import java.util.Scanner;

public class Plus_Minus_Mult_Divide_Calculator_Main {
	
	public static void main(String[] args){
		
		Scanner userInput = new Scanner(System.in);
		
		int finalNumber;
		double finaldivision;
		
		System.out.println("Enter a number.");
		int firstNumber = userInput.nextInt();
		
		System.out.println("Enter a second number.");
		int secondNumber = userInput.nextInt();
		
		System.out.println("Type 1 if you would like to add those numbers.");
		System.out.println("Type 2 if you would like to subract those numbers.");
		System.out.println("Type 3 if you would like to multiply those numbers.");
		System.out.println("Type 4 if you would like to divide those numbers.");
		int action = userInput.nextInt();
		
		if (action == 1 ){
			finalNumber = firstNumber + secondNumber;
			System.out.println("The first number plus the second number is " + finalNumber);
		}
		
		if (action == 2 ){
			finalNumber = firstNumber - secondNumber;
			System.out.println("The first number minus the second number is " + finalNumber);
		}
		
		if (action == 3 ){
			finalNumber = firstNumber * secondNumber;
			System.out.println("The result of the first number multiplied by the second number is " + finalNumber);
		}
		if (action == 4 ){
			finaldivision = (double) firstNumber /(double) secondNumber;
			System.out.println("The result of the first number divided by the second number is " + finaldivision);
		}
		
	}
}
