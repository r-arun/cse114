import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class AlternatWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0; i < n; ++i){
			if(i%2 == 0)
				System.out.println(i+" Hello Earth");
			else
				System.out.println(i+" Hello Mars");
		}
	}

}
