import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class PalindromeStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = input.next();
		System.out.println("Done");
		int n = s.length();
		boolean palindrome = true;
		for(int i = 0; i <= (n-1)/2; ++i){
			int j = n-1-i;
			if(s.charAt(i) != s.charAt(j)){
				palindrome = false;
				break;
			}
			
		}
		if(palindrome)
			System.out.println(s+" is a palindrome");
		else
			System.out.println(s+" is a not palindrome");
		System.out.println("Done");
	}

}
