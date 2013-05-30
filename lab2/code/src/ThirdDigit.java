import java.util.Scanner;
public class ThirdDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int quotient = num / 100; //The first 2 digits.
		int dorm = quotient % 10;
		System.out.println("Dorm "+dorm);
	}

}
