import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class NameValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name = input.next();
		int sum = 0;
		for(int i = 0; i < name.length(); ++i){
			System.out.println("Value of "+name.charAt(i)+" = "+(int)name.charAt(i));
			sum += name.charAt(i);
		}
		System.out.println(sum);
	}

}
