import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class HelloWorldLine {

	/**
	 * Warmup 2
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String text1 = input.next();
		int cnt1 = input.nextInt();
		int i = 0;
		while(i < cnt1){
			System.out.println(i+":"+text1);
			++i;
		}
		String text2 = input.next();
		int cnt2 = input.nextInt();
		int j = 1;
		while(j <= cnt2){
			System.out.println(j+":"+text2);
			++j;
		}
	}

}
