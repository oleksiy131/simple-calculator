
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number:");

		double firstNumber = scanner.nextDouble();

		System.out.println("Enter second number:");

		double secondNumber = scanner.nextDouble();

		System.out.println("Enter an operator (+, -, *, /): ");

		char operator = scanner.next().charAt(0);

		double result;

		// Switch Case

		switch (operator)

		{

		case '+':

			result = firstNumber + secondNumber;

			break;

		case '-':

			result = firstNumber - secondNumber;

			break;

		case '*':

			result = firstNumber * secondNumber;

			break;

		case '/':

			result = firstNumber / secondNumber;

			break;

		// If operator is none of the above

		default:

			System.out.println("You have entered wrong operator");

			return;
		}
		
		System.out.println("-------------------");
		System.out.println("Your result is: " + result);
	}
}
