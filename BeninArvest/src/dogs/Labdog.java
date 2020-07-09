package dogs;

public class Labdog extends Dog {

	public Labdog() {
	}

	public Labdog(String name, int age, String gender, String personalityType) {
		super(name, age, gender, personalityType);

	}
	public void bark(int mins, int secs) {
		System.out.println("Labdog is barking for " +mins +" minutes" + " and " + secs + " seconds");
	}
	public void sit(int mins) {
		System.out.println("Labdog is sitting for " + mins + " minutes");
	}

}
