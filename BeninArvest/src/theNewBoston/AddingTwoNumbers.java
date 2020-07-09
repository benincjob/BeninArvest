package theNewBoston;
import java.util.Scanner;

public class AddingTwoNumbers {

	public static void main(String[] args) {
		
		double num1, num2, answer;
		Scanner tesla = new Scanner(System.in);
		System.out.println("Enter the first number");
		num1 = tesla.nextDouble();
		System.out.println("Enter the second number");
		num2 = tesla.nextDouble();
		answer = num1+num2;
		System.out.println("The answer is: " + answer);
	}


	

}
