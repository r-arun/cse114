import java.math.BigInteger;   

public class TestQuestion2 extends Question2 {
	public static void main(String[] args) {
		int points = 0;
		BigInteger[] testArrayA = {
				new BigInteger("1"),
				new BigInteger("123456789"),
				new BigInteger("2222222222222222222222222222222"),
				new BigInteger("999999999999999999") };		
		
		//System.out.print("\n\nThe testArrayA: ");
		//printArray(testArrayA);
		BigInteger answer1 = new BigInteger("2222222222222222222222222222222");
		BigInteger max = null;
		try{
			max = findLargestBigInteger(testArrayA);
			//System.out.print(max);
			if(max.equals(answer1)){
				++points;
			}
			else{
				System.out.println("Case 1: Failed Exception");
			}
		}
		catch(Exception e){
			System.out.println("Case 1: Failed \nException");
		}
		/*end of case 1*/
		BigInteger target = new BigInteger("123456789");
		int position = 0;
		try{
			position = searchBigInteger(testArrayA, target);

			if(position == 1){
				++points;
			}
			else{
				System.out.println("Case 2: Failed \nException");
			}
		}
		catch(Exception e){
			System.out.println("Case 2: Failed Exception");
		}
			
		/*end of case 2*/
		BigInteger[] testArrayB = {
				new BigInteger("9876543210123456789"),
				new BigInteger("5"),
				new BigInteger("11111111111111111111111111111111111"),
				new BigInteger("8989898989898989898989898989898989898989") };		
		
		//System.out.print("\n\nThe testArrayB: ");
		//printArray(testArrayB);
		BigInteger answer2 = new BigInteger("8989898989898989898989898989898989898989");		
		try{
			max = findLargestBigInteger(testArrayB);
			//System.out.print(max);
			if(max.equals(answer2)){
				++points;
			}
			else{
				System.out.println("Case 3: Failed \nReturned: "+max+"\nExpecting: "+answer2);
			}
		}
		catch(Exception e){
			System.out.println("Case 3: Failed \nException");
		}
		/*end of case 3*/
				
		try{
			target = new BigInteger("123456789");
			position = searchBigInteger(testArrayB, target);

			if(position < 0){
				++points;
			}
			else{
				System.out.println("Case 4: Failed \nReturned: "+position+"\nExpecting: "+-1);
			}
		}
		catch(Exception e){
			System.out.println("Case 4: Failed \nException");
		}
		/*end of case 4*/
		BigInteger[] testArrayC = {
				new BigInteger("0"),
				new BigInteger("111"),
				new BigInteger("111"),
				null,
				new BigInteger("5")
				};		
		
		//System.out.print("\n\nThe testArrayB: ");
		//printArray(testArrayB);
		BigInteger answer3 = new BigInteger("111");		
		try{
			max = findLargestBigInteger(testArrayC);
			//System.out.print(max);
			if(max.equals(answer3)){
				++points;
			}
			else{
				System.out.println("Case 5: Failed \nReturned: "+max+"\nExpecting: "+answer3);
			}
		}
		catch(Exception e){
			System.out.println("Case 5: Failed \nException");
		}
		/*end of case 5*/
				
		target = new BigInteger("5");
		try{
			position = searchBigInteger(testArrayC, target);
			final int case6 = 4;

			if(position == case6){
				++points;
			}
			else{
				System.out.println("Case 6: Failed \nReturned: "+position+"\nExpecting: "+case6);
			}
		}
		catch(Exception e){
			System.out.println("Case 6: Failed \nException");
		}
		/*end of case 6*/

		final int case7 = 0;
		try{
			target = new BigInteger("0");
			position = searchBigInteger(testArrayC, target);

			if(position == case7){
				++points;
			}
			else{
				System.out.println("Case 7: Failed \nReturned: "+position+"\nExpecting: "+case7);
			}
		}
		catch(Exception e){
			System.out.println("Case 7: Failed \nException");
		}
		/*end of case 7*/
		final int case8 = 1;
		target = new BigInteger("111");
		try{
			position = searchBigInteger(testArrayC, target);

			if(position == case8){
				++points;
			}
			else{
				System.out.println("Case 8: Failed \nReturned: "+position+"\nExpecting: "+case8);
			}
		}
		catch(Exception e){
			System.out.println("Case 8: Failed \nException");
		}
		/*end of case 8*/
		/*
		BigInteger[] testArrayD= new BigInteger[10];
		BigInteger answer4 = null;

		max = findLargestBigInteger(testArrayD);
		if(max == null){
			++points;
		}
		else{
			System.out.println("Case 9: Failed \nReturned: "+max+"\nExpecting: "+answer4);
		}
		
		*/
		System.out.println("Points "+points+" out of 8");

	}
	
	// DO NOT CHANGE THIS METHOD
	public static void printArray(BigInteger[] array) {
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
	
