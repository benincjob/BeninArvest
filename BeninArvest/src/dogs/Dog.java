package dogs;

public class Dog {
	private String name;
	private int age;
	private String gender;
	private String personalityType;
	
	public Dog() {
		name = "";
		age = 0;
		gender = "";
		personalityType = "";
	}
	public Dog(String name, int age, String gender, String personalityType) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.personalityType = personalityType;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPersonalityType() {
		return personalityType;
	}
	public void setPersonalityType(String personalityType) {
		this.personalityType = personalityType;
	}
	
	public void bark() {
		System.out.println("Dog is barking! ");
	}
	public void bark(String str) {
		System.out.println(str);
	}
	public void sit() {
		System.out.println("Dog is sitting! ");
	}

	public void stay() {
		System.out.println("Dog is staying! ");
	}

}
