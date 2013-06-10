import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class BinaryAddition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int bits = input.nextInt();
		String num1 = input.next();
		String num2 = input.next();
		String num3 = "";
		int sum=0, carry=0;
		for(int i = bits-1; i >= 0; --i){
			int b1 = num1.charAt(i) -'0';
			int b2 = num2.charAt(i) -'0';
			int result = b1+b2+carry;
			carry = (result & 2)>>1;
			sum = result & 1;
			String n = String.valueOf(sum);
			num3 = n + num3;
		}
		if(carry == 1)
			System.out.print(carry);
		System.out.println(num3);
	}

}
