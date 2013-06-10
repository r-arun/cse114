import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class SumofNumbers2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int test = input.nextInt();
		int sum = 0;
		while(--test > 0){
			int num = input.nextInt();
			sum += num;
		}
		System.out.println("Sum of numbers is "+ sum);
	}

}
