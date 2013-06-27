
public class Inhertiance1 {


	public static void main(String[] args) {
		Person p1 = new Person("Harry Potter", 19);
		SuperHero h1 = new SuperHero("Peter Parker", 20, "Spiderman", "spins web");
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		System.out.println(h1.name);
		System.out.println(h1.age);
		System.out.println(h1.fictionalName);
		System.out.println(h1.superPower);
		
		//System.out.println(p1.superPower);
		
		h1.save();
		//p1.save();
		
		p1.getInfo();
		h1.getInfo();
	}

}
