public class TestQuestion1 extends Question1{
	public static void main(String[] args){
		double[] testArrayA = {3.3, 9.99, 6.6, -7.7, 4.444};
		double[] testArrayB = {5.5, 9.9, -8.8, 1.1, 3.3, 2.2};
		double[] testArrayC = {5.0, 4.0, 3.0, 2.0, 1.0};
		double[] testArrayD = {5.5};
		//System.out.print("\nORIGINAL testArrayA: ");
		//printArray(testArrayA);
		
		//System.out.print("\nORIGINAL testArrayB: ");
		//printArray(testArrayB);
		
		double median = calculateMedian(testArrayA);
		System.out.print("\n\ntestArrayA median: ");
		System.out.print(median);
		
		median = calculateMedian(testArrayB);
		System.out.print("\ntestArrayB median: ");
		System.out.print(median);
		
		median = calculateMedian(testArrayC);
		System.out.print("\ntestArrayC median: ");
		System.out.print(median);

		median = calculateMedian(testArrayD);
		System.out.print("\ntestArrayD median: ");
		System.out.print(median);

		System.out.print("\n\nSHOULD BE UNCHANGED testArrayA: ");
		printArray(testArrayA);
		
		System.out.print("\nSHOULD BE UNCHANGED testArrayB: ");
		printArray(testArrayB);

		System.out.print("\n\nSHOULD BE UNCHANGED testArrayC: ");
		printArray(testArrayC);
		
		System.out.print("\nSHOULD BE UNCHANGED testArrayD: ");
		printArray(testArrayD);
		
		System.out.print("\n\nDouble contents of testArrayA: ");
		doubleArrayContents(testArrayA);
		printArray(testArrayA);

		System.out.print("\nDouble contents of testArrayB: ");
		doubleArrayContents(testArrayB);
		printArray(testArrayB);

		System.out.print("\n\nDouble contents of testArrayC: ");
		doubleArrayContents(testArrayC);
		printArray(testArrayC);

		System.out.print("\nDouble contents of testArrayD: ");
		doubleArrayContents(testArrayD);
		printArray(testArrayD);
	
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
