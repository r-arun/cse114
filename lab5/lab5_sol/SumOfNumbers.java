import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class SumOfNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0;
		int i = 1;
		while(i <= n){
			sum = sum + i;
			++i;
		}
		System.out.println("Sum of first "+n+" natural numbers is "+sum);
	}

}
