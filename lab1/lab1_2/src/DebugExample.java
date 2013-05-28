import java.util.Scanner;
/* Program for debug.
 * This piece of code has some bugs.
 * Other than bugs it has code written
 * in bad style. 
 * Correct the bugs and rewrite the code
 * in a good style.
 * Hint: Follow the squiggly lines
 */
public class DebugExample {
	public static void main(String args) {
		Scanner input = new Scanner(System.in);
		int a, b;
		int sum, Diff, mod;
		a = input.nextInt(); b = input.nextInt();
		sum = a+b;
		Diff = a-b;
		int mult = a* b;
		div = a /b;
		mod = a%b;
		System.out.println("Sum is ",sum);
		System.out.println("Difference is "+diff);
		System.out.println("Product is "+mult);
		System.out.println("Quotient is "+div);
		System.out.println("Modulo is "+mod);
		input.close();
	}
}