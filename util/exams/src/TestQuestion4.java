/*
Miraj Alam
108757323
CSE 114-01
*/
public class TestQuestion4 extends Question4 {   
	 
	public static void sortPeopleAlphabetically1(Person[] people) {
		///////////////////////////////////////
		// ADD YOUR CODE HERE FOR QUESTION 4 //
	    int j, k, min_index; 
		for (j = 0; j <=people.length-2; j++)
		    {
		      min_index = j;
		      for (k = j+1; k <= people.length-1; k++)
		        if (people[k].toString().compareToIgnoreCase
		        	(people[min_index].toString()) < 0)
		          min_index = k;
		      Person temp = people[j];
		      people[j] = people[min_index];
		      people[min_index] = temp;
		    }
		///////////////////////////////////////
	}

	public static Person[] getPeopleStartingWithALetter1(Person[] people, char letter) {
		Person[] peopleStartingWithLetter = null;
		///////////////////////////////////////
		// ADD YOUR CODE HERE FOR QUESTION 4 //
		int[] indices = new int[people.length];
		
		int count = 0;
		for(int i = 0; i < people.length; i++){
			if(people[i].toString().charAt(0) == letter){
				indices[count] = i;
				count++;	
			}
		}
		peopleStartingWithLetter = new Person[count];
		for(int i = 0; i < peopleStartingWithLetter.length; i++){
			peopleStartingWithLetter[i] = people[indices[i]];
		}
		///////////////////////////////////////
		return peopleStartingWithLetter;
	}

	public static boolean isEquals(Person [] returned, Person [] expected){
		expected = denullify(expected);
		if(expected == null && returned == null) return true;
		if(returned == null || expected == null || returned.length != expected.length){
			return false;	
		}
		for(int i = 0; i < returned.length; ++i){
			if(returned[i] == null || expected[i] == null) return false;
			if(!returned[i].toString().equals(expected[i].toString()))
				return false;
		}
		return true;
	}

	public static Person[] denullify(Person [] array){
		int cnt = 0;
		if(array == null) return null;
		for(int i = 0; i < array.length; ++i){
			if(array[i] != null)
				++cnt;
		}
		Person [] newArray = new Person[cnt];
		int pos = 0;
		for(int i = 0; i < array.length; ++i){
			if(array[i] != null)
				newArray[pos++] = array[i];
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		int points = 0;
		Person[] testPeople = {
				new Person("Johnson, Randy"),
				new Person("Matsui, Hideki"),
				new Person("Jeter, Derek"),
				new Person("Wang, Chien Ming"),
				new Person("Kevin, Peterson"),
				new Person("Mussina, Mike"),
				new Person("Arun, Rathakrishnan"),
				new Person("Nice, Murali"),
				new Person("Amit, Sahasarabuddhe"),
				new Person("Kevin, Peterson")
				};
		testPeople[6].setAge(19);

		Person[] testPeople1 = {
				new Person("Johnson, Randy"),
				new Person("Matsui, Hideki"),
				new Person("Jeter, Derek"),
				new Person("Wang, Chien Ming"),
				new Person("Kevin, Peterson"),
				new Person("Mussina, Mike"),
				new Person("Arun, Rathakrishnan"),
				new Person("Nice, Murali"),
				new Person("Amit, Sahasarabuddhe"),
				new Person("Kevin, Peterson")
				};

		testPeople1[6].setAge(19);

		sortPeopleAlphabetically(testPeople);
		sortPeopleAlphabetically1(testPeople1);
		if(isEquals(testPeople, testPeople1)){
			++points;
		}
		else{
			System.out.println("Case 1: Failed");
			System.out.println("Returned");
			printArray(testPeople);
			System.out.println("Expected");
			printArray(testPeople1);
		}
		
		Person[] jPeople = getPeopleStartingWithALetter(testPeople, 'J');
		Person[] jPeople1 = getPeopleStartingWithALetter1(testPeople1, 'J');
		if(isEquals(jPeople, jPeople1)){
			++points;
		}
		else{
			System.out.println("Case 2: Failed");
			System.out.println("Returned");
			printArray(jPeople);
			System.out.println("Expected");
			printArray(jPeople1);
		}

		Person[] mPeople = getPeopleStartingWithALetter(testPeople, 'M');
		Person[] mPeople1 = getPeopleStartingWithALetter1(testPeople1, 'M');
		if(isEquals(mPeople, mPeople1)){
			++points;
		}
		else{
			System.out.println("Case 3: Failed");
			System.out.println("Returned");
			printArray(mPeople);
			System.out.println("Expected");
			printArray(mPeople1);
		}
		System.out.println("Points "+points+" out of 3");
	}
	
	// DO NOT CHANGE THIS METHOD
	public static void printArray(Person[] array) {
		if (array == null)
			System.out.print("ARRAY NOT CONSTRUCTED");
		else {
			System.out.print("\n\t[\t");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]);
				if (i < array.length - 1)
					System.out.print(",\n\t\t");
			}
			System.out.print("\t]");
		}
	}
}
