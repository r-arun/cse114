class SuperHero extends Person {

	String fictionalName;
	String superPower;
	
	public SuperHero(String originalName, int newAge, String nickName, String newSuperPower){
		name = originalName;
		age = newAge;
		fictionalName = nickName;
		superPower = newSuperPower;
	}

	public void save(){
		System.out.println(fictionalName+" "+superPower+" and saves the day!");
	}
	
	public void getInfo(){
		System.out.println("Ficitional Name: "+fictionalName+ " Super Power: "+superPower);
	}

}

