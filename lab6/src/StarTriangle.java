import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class StarTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 1; i <= n; i+=2){
			//ith line has (n-i)/2 spaces followed by i stars
			for(int spaces = 1; spaces <= (n-i)/2; ++spaces)
				System.out.print(" ");
			for(int stars = 1; stars <= i; ++stars)
				System.out.print("*");
			System.out.println();
		}
	}

}
