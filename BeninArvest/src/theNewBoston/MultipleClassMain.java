package theNewBoston;
import java.util.Scanner;


public class MultipleClassMain {

	public static void main(String[] args) {
		MultipleClassSub apples = new MultipleClassSub(); // creating an instance of an object in another class to use the methods available in that class.
		apples.tesla();
		
		
		Scanner ben = new Scanner(System.in);
		System.out.println("Enter you name: ");
		String name = ben.nextLine();
		apples.honda(name);
		

	}

}
