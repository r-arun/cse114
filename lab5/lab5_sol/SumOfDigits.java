import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class SumOfDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		int num1 = num;
		int sum = 0;
		while(num > 0){
			sum += (num % 10);
			num /= 10;
		}
		System.out.println("Sum of digits of "+num1+" is "+sum);
	}

}
