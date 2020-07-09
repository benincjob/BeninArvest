package dogs;

public class DogDriver {

	public static void main(String[] args) {
		Dog max = new Dog();
		max.bark();
		max.bark("wooof woof!...");
		
		BullDog duke = new BullDog("Duke", 3, "Male", "Loyal");
		System.out.println(duke.getPersonalityType());
		duke.bark(2);
		duke.stay(3,36,12);
		
		Labdog jack = new Labdog("Jack", 6, "Male", "Loving");
		System.out.println(jack.getAge());
		System.out.println(jack.getGender());
		jack.bark(12,9);
		jack.sit(9);
		
		
		
		

	}

}
