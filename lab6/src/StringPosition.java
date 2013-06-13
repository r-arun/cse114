import java.util.Scanner;

public class StringPosition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = input.next();
		System.out.println("Enter the character position:");
		int pos = input.nextInt();
		int length = s.length();
		char left = s.charAt(pos);
		//right most character is at length - 1 position
		char right = s.charAt(length - 1 - pos);
		System.out.print("Character at position 0 from left: ");
		System.out.println(left);
		System.out.print("Character at position 0 from right: ");
		System.out.println(right);
	}

}
