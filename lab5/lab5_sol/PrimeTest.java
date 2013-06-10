import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class PrimeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		boolean flag = false;
		for(int i = 2; i*i <= n; ++i){
			if(n % i == 0){
				flag = true;
				break;
			}
		}
		if(flag)	
			System.out.println(n+ " is not prime");
		else
			System.out.println(n+ " is prime");
	}

}
