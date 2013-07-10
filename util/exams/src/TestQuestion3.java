public class TestQuestion3 extends Question3{    
	public static char[] generateLowerCaseAlphabet1() {
		char[] alphabet = null;
		
		final int NUM_LETTERS = 26;
		alphabet = new char[NUM_LETTERS];
		alphabet[0] = 'a';
		
		for(int i = 1; i < NUM_LETTERS; i++) {
			alphabet[i] = (char)((int)alphabet[i - 1] + 1);
		}
		
		return alphabet;
	}
	
	public static boolean hasMatchingPattern1(char[] a, char[] pattern) {
		boolean flag = false;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] == pattern[0]) {
				for(int j = 1; j < pattern.length; j++) {
					if(i + j > a.length) {
						return flag;
					} else if(a[i + j] != pattern[j]) {
						return flag;
					}
				}
				
				flag = true;
				break;
			}
		}
		
		return flag;
	}

	public static boolean isEquals(char [] returned, char [] expected){
		if(returned == null || expected == null) return false;
		if(returned.length != expected.length)
			return false;
		for(int i = 0; i < expected.length; ++i)
			if(returned[i] != expected[i])
				return false;
		return true;
	}

	public static void main(String[] args) {
		char[] testArray;
		testArray = generateLowerCaseAlphabet();
		char[] testArray1;
		testArray1 = generateLowerCaseAlphabet1();

		int points = 0;

		if(isEquals(testArray, testArray1))
			++points;
		else{
			System.out.println("Case 1: Failed");
			System.out.println("Returned: ");
			printArray(testArray);
			System.out.println();
			System.out.println("Expected: ");
			printArray(testArray1);
			System.out.println();
		}
			
		
		char[] testPatternA = {'s'};
		char[] testPatternB = {'x', 'y', 'z' };
		char[] testPatternC = {'a', 'a', 'a' };

		char[] testPatternA1 = {'s'};
		char[] testPatternB1 = {'x', 'y', 'z' };
		char[] testPatternC1 = {'a', 'a', 'a' };
		
		boolean expected = true;
		boolean result = hasMatchingPattern(testArray,testPatternA);
		expected = hasMatchingPattern1(testArray,testPatternA);
		if(result == expected)
			++points;	
		else{
			System.out.println("Case 2: Failed \nReturned: "+result+" \nExpected: "+expected);
		}
		
		result = hasMatchingPattern(testArray,testPatternB);
		expected = hasMatchingPattern1(testArray,testPatternB);
		if(result == expected)
			++points;	
		else{
			System.out.println("Case 3: Failed \nReturned: "+result+" \nExpected: "+expected);
		}

		
		result = hasMatchingPattern(testArray,testPatternC);
		expected = hasMatchingPattern1(testArray,testPatternC);
		if(result == expected)
			++points;	
		else{
			System.out.println("Case 4: Failed \nReturned: "+result+" \nExpected: "+expected);
		}
		
		if(isEquals(testPatternA, testPatternA1)){
			++points;
		}
		else{
			System.out.println("Case 5: Failed \nArray is changed");
		}

		if(isEquals(testPatternB, testPatternB1)){
			++points;
		}
		else{
			System.out.println("Case 6: Failed \nArray is changed");
		}

		if(isEquals(testPatternC, testPatternC1)){
			++points;
		}
		else{
			System.out.println("Case 7: Failed \nArray is changed");
		}

		char [] testPatternD = {'a'};
		result = hasMatchingPattern(testPatternC,testPatternD);
		expected = hasMatchingPattern1(testPatternC,testPatternD);
		if(result == expected)
			++points;	
		else{
			System.out.println("Case 8: Failed \nReturned: "+result+" \nExpected: "+expected);
		}

		result = hasMatchingPattern(testArray,testArray1);
		expected = hasMatchingPattern(testArray,testArray1);
		if(result == expected)
			++points;	
		else{
			System.out.println("Case 9: Failed \nReturned: "+result+" \nExpected: "+expected);
		}
		
		System.out.println("Points : "+points+" out of 9");
	}
	
	// DO NOT CHANGE THIS METHOD
	public static void printArray(char[] array) {
		if (array == null)
			System.out.print("ARRAY NOT CONSTRUCTED");
		else {
			System.out.print("[");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]);
				if (i < array.length - 1)
					System.out.print(",");
			}
			System.out.print("]\n");
		}
	}
}
