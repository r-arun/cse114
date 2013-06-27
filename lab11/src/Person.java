import java.util.Scanner;

/**
 * @author arun
 *
 */
class Person {
	/**
	 * Name of the person
	 */
	String name;
	/**
	 * Age of the person 
	 */
	int age;
	
	
	public Person(){
		name = "Unknown";
	}
	
	public Person(String newName, int newAge){
		name = newName;
		age = newAge;
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

	public void getInfo(){
		System.out.println("Name: "+ name+" age: "+age);
	}
	
}
