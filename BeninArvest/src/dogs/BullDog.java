package dogs;

public class BullDog extends Dog {

	public BullDog(String name, int age, String gender, String personalityType) {
		super(name,age,gender,personalityType);
	}
	public void bark(int min) {
		System.out.println("Bulldog is barking for " +min +" minutes");
	}
	
	public void stay(int hours, int mins, int secs) {
		System.out.println("Bulldog is staying for "+ hours + " hours, " + mins + " minutes" + " and " + secs + " seconds");
	}
	
 
}
