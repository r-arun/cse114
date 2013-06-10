import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class CodeName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name = input.next();
		String code = "";
		int pos = 2;
		if(name.length() > pos){
			for(pos = 2; pos < ((name.length()< 5)?name.length(): 5); ++pos){
				code = code+name.charAt(pos);
			}
			System.out.println(code.toUpperCase());
		}
		else
			System.out.println("Input length is too small");
		
	}

}
