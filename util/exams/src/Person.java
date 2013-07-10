public class Person {   
	private String name; 
	private int age;
	
	public Person(String initName) {
		age = 0;
		name = initName;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		if (newAge < 0) 
			age = 0;
		else
			age = newAge;
	}
	
	public String toString() {
		return name + ", age " + age;
	}
}