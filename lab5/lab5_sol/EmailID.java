import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class EmailID {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String firstName = input.next();
		String lastName = input.next();
		String email = "";
		email += firstName.charAt(0);
		for(int pos = 0; pos < lastName.length() && pos < 3; ++pos)
			email += lastName.charAt(pos);
		System.out.println("Email  is: "+email+"@cse114.edu");
	}

}
