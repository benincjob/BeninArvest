package theNewBoston;

public class IncrementAndAssignment {

	public static void main(String[] args) {
		int tesla = 99;
		int honda = 12;
		int toyota = 33;
		
		System.out.println(++tesla);  // pre increment operator
		System.out.println(tesla++);  // post increment operator
		System.out.println(tesla);
		System.out.println(honda+=26); // new honda = old honda + 26
		System.out.println(toyota*=3);
		
	}

}
