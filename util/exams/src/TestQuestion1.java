public class TestQuestion1 extends Question1{
	public static boolean isEqual(double a[], double b[]){
		if(a == null || b == null) return false;
		if(a.length != b.length){
			return false;
		}
		for(int i = 0; i < b.length; ++i)
			if(a[i] != b[i]) return false;
		return true;
	}

	public static void doubleArrayContents1(double [] array){
		if(array == null) return;
		for(int i = 0; i < array.length; ++i){
			array[i] = 2* array[i];
		}
	}

	public static void main(String[] args){
		double[] testArrayA = {3.3, 9.99, 6.6, -7.7, 4.444};
		double[] testArrayB = {5.5, 9.9, -8.8, 1.1, 3.3, 2.2};
		double[] testArrayC = {5.0, 4.0, 3.0, 2.0, 1.0};
		double[] testArrayD = {5.5};
		double[] testArrayE = {5.5, 6.5};

		double[] testArrayA1 = {3.3, 9.99, 6.6, -7.7, 4.444};
		double[] testArrayB1 = {5.5, 9.9, -8.8, 1.1, 3.3, 2.2};
		double[] testArrayC1 = {5.0, 4.0, 3.0, 2.0, 1.0};
		double[] testArrayD1 = {5.5};
		double[] testArrayE1 = {5.5, 6.5};
		
		int points = 0;
		double median = 0.0;
		try{
			final double answer1 = 4.444;
			median = calculateMedian(testArrayA);
			if(median == answer1){
				++points;
			}
			else{
				System.out.println("Case 1: Failed \nReturned = "+median+"\nExpected = "+answer1);
			}
		}
		catch(Exception e){
			System.out.println("Case 1: Failed \nException");
		}
		
		try{
			final double answer2 = 2.75;
			median = calculateMedian(testArrayB);
			if(median == answer2){
				++points;
			}
			else{
				System.out.println("Case 2: Failed \nReturned = "+median+"\nExpected = "+answer2);
			}
		}
		catch(Exception e){
			System.out.println("Case 2: Failed \nException");
		}
				
		try{
			final double answer3 = 3.0;
			median = calculateMedian(testArrayC);
			if(median == answer3){
				++points;
			}
			else{
				System.out.println("Case 3: Failed \nReturned = "+median+"\nExpected = "+answer3);
			}
		}
		catch(Exception e){
			System.out.println("Case 3: Failed \nException");
		}

		try{
			final double answer4 = 5.5;
			median = calculateMedian(testArrayD);
			if(median == answer4){
				++points;
			}
			else{
				System.out.println("Case 4: Failed \nReturned = "+median+"\nExpected = "+answer4);
			}
		}
		catch(Exception e){
			System.out.println("Case 4: Failed \nException");
		}

		try{
			if(isEqual(testArrayA, testArrayA1)){
				++points;
			}
			else{
				System.out.println("Case 5: Failed \n");
				System.out.println("\nReturned = \n");
				printArray(testArrayA);
				System.out.println("\nExpected = \n");
				printArray(testArrayA1);
			}
		}
		catch(Exception e){
			System.out.println("Case 5: Failed \nThrew Exception");
			e.printStackTrace();
		}
		try{
			if(isEqual(testArrayB, testArrayB1)){
				++points;
			}
			else{
				System.out.println("Case 6: Failed \n");
				System.out.println("\nReturned = \n");
				printArray(testArrayB);
				System.out.println("\nExpected = \n");
				printArray(testArrayB1);
			}
		}
		catch(Exception e){
			System.out.println("Case 6: Failed \nThrew Exception");
			e.printStackTrace();
		}
		try{
			if(isEqual(testArrayC, testArrayC1)){
				++points;
			}
			else{
				System.out.println("Case 7: Failed \n");
				System.out.println("\nReturned = \n");
				printArray(testArrayC);
				System.out.println("\nExpected = \n");
				printArray(testArrayC1);
			}
		}
		catch(Exception e){
			System.out.println("Case 7: Failed \nThrew Exception");
			e.printStackTrace();
		}

		try{
			if(isEqual(testArrayD, testArrayD1)){
				++points;
			}
			else{
				System.out.println("Case 8: Failed \n");
				System.out.println("\nReturned = \n");
				printArray(testArrayD);
				System.out.println("\nExpected = \n");
				printArray(testArrayD1);
			}
		}
		catch(Exception e){
			System.out.println("Case 8: Failed \nThrew Exception");
			e.printStackTrace();
		}

	
		doubleArrayContents(testArrayA);
		doubleArrayContents1(testArrayA1);
		doubleArrayContents(testArrayB);
		doubleArrayContents1(testArrayB1);
		doubleArrayContents(testArrayC);
		doubleArrayContents1(testArrayC1);
		doubleArrayContents(testArrayD);
		doubleArrayContents1(testArrayD1);

		try{
			if(isEqual(testArrayA, testArrayA1)){
				++points;
			}
			else{
				System.out.println("Case 9: Failed \n");
				System.out.println("\nReturned = \n");
				printArray(testArrayA);
				System.out.println("\nExpected = \n");
				printArray(testArrayA1);
			}
		}
		catch(Exception e){
			System.out.println("Case 9: Failed \nThrew Exception");
			e.printStackTrace();
		}
		try{
			if(isEqual(testArrayB, testArrayB1)){
				++points;
			}
			else{
				System.out.println("Case 10: Failed \n");
				System.out.println("\nReturned = \n");
				printArray(testArrayB);
				System.out.println("\nExpected = \n");
				printArray(testArrayB1);
			}
		}
		catch(Exception e){
			System.out.println("Case 10: Failed \nThrew Exception");
			e.printStackTrace();
		}
		try{
			if(isEqual(testArrayC, testArrayC1)){
				++points;
			}
			else{
				System.out.println("Case 11: Failed \n");
				System.out.println("\nReturned = \n");
				printArray(testArrayC);
				System.out.println("\nExpected = \n");
				printArray(testArrayC1);
			}
		}
		catch(Exception e){
			System.out.println("Case 11: Failed \nThrew Exception");
			e.printStackTrace();
		}

		try{
			if(isEqual(testArrayD, testArrayD1)){
				++points;
			}
			else{
				System.out.println("Case 12: Failed \n");
				System.out.println("\nReturned = \n");
				printArray(testArrayD);
				System.out.println("\nExpected = \n");
				printArray(testArrayD1);
			}
		}
		catch(Exception e){
			System.out.println("Case 12: Failed \nThrew Exception");
			e.printStackTrace();
		}

		try{
			final double answer0 = 6.0;
			median = calculateMedian(testArrayE);
			if(median == answer0){
				++points;
			}
			else{
				System.out.println("Case 13: Failed \nReturned = "+median+"\nExpected = "+answer0);
			}
		}
		catch(Exception e){
			System.out.println("Case 13: Failed \nException");
		}

		System.out.println("Points "+points+" out of 13");
	}

	public static void printArray(double[] array) {
		if (array == null)
			System.out.print("ARRAY NOT CONSTRUCTED");
		else {
			System.out.print("[ ");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]);
				if (i < array.length - 1)
					System.out.print(", ");
			}
			System.out.print("]");
		}
	}
}
