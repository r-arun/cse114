import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int product = 1;
		while(n > 0){
			product *= n;
			--n;
		}
		System.out.println("Product = "+ product);
		input.close();
	}

}
