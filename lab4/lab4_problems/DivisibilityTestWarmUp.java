import java.util.Scanner;
public class DivisibilityTestWarmUp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Lets checks divisibility test by 10
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int lastDigit = num % 10;
		//if num is divisible by 10, the last
		//digit must be equal to 0.
		
		//Similarly for 5 the last digit is always 0 or 5.
		//Similarly for 2 the last digit is always even.
		
		if(lastDigit == 0)
			System.out.println(num+" is divisible by 10");
		else
			System.out.println(num+" is not divisible by 10");
	}

}
