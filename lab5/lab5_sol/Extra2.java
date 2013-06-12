import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class Extra2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 1; i <= n; ++i){
			for(int j = 1; j <= n; ++j){
				if(j <= n-i)
					System.out.print(" ");
				else
					System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
