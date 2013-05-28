/**
 * 
 */
import java.util.Scanner;
/**
 * Test program for arithmetic
 *
 */
public class ArithmeticExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a, b;
		a = input.nextInt();
		b = input.nextInt();
		int sum = a + b;
		int diff = a - b;
		int mult = a * b;
		int div = a / b;
		int mod = a % b;
		System.out.println("Sum is " + sum);
		System.out.println("Difference is " + diff);
		System.out.println("Product is " + mult);
		System.out.println("Quotient is " + div);
		System.out.println("Modulo is " + mod);
		input.close();
	}

}
