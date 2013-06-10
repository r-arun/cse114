import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class AddDoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		System.out.println("Program to add upto 10 numbers on prompt");
		do{
			System.out.println("Press Y to continue");
			String response = input.next();
			if(response.charAt(0) != 'Y')
				break;
			int val = input.nextInt();
			sum+=val;
			count++;
		}while(count < 10);
		System.out.println("Sum of "+count+" numbers is "+sum);
	}

}
