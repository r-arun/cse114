import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class CountPositive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		int pos = 0;
		int neg = 0;
		while(t-- > 0){
			int n = input.nextInt();
			if(n > 0)
				++pos;
			else if(n < 0)
				++neg;
		}
		System.out.println("Positive Numbers: "+pos);
		System.out.println("Negative Numbers: "+neg);
	}

}
