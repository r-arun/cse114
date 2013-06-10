import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class InputNumbers {

	//Warm Up
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		int t = input.nextInt();
		while(t > 0){
			System.out.println("Enter an integer to check for even/odd");
			int num = input.nextInt();
			if(num % 2 == 0)
				System.out.println(num+" is even");
			else
				System.out.println(num+" is odd");
			--t;
		}
	}

}
