import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class BinaryToDecimal {
	public static int convertToDecimal(String binary){
		int pos = binary.length();
		int decimal = 0;
		int i = 0;
		int digit;
		while(i < pos){
			System.out.println(i+" "+binary.charAt(pos-1-i));
			digit = binary.charAt(pos-1-i) == '0'? 0: 1;
			decimal += digit * Math.pow(2, i);
			++i;
		}
		return decimal;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String binary = input.next();
		int decimal = convertToDecimal(binary);
		System.out.println(decimal);
	}

}
