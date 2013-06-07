import java.util.Scanner;

public class PowerPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if( 1000 <= num && num < 10000){
			int d0, d1, d2, d3;
			d0 = num % 10; //Get First digit
			num /= 10;
			d1= num % 10; //Get Second digit
			num /= 10;
			d2= num % 10; // Get Third digit
			num /= 10;
			d3 = num; //Fourth digit
			
			//[d0 must be square or square root of d3] and
			//[d1 must be square or square root of d2]
			//for input to be a palindrome.
			
			if((d0*d0 == d3 || d0 == d3*d3) &&
					(d1*d1 == d2 || d1 == d2*d2)){
				System.out.println("Input is a power palindrome");
			}
			else
				System.out.println("Input is not a power palindrome");
		}
		else
			System.out.println("Enter a valid 4 digit positive integer");

	}

}
