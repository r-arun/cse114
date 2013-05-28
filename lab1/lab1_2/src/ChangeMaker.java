import java.util.Scanner;
public class ChangeMaker {

	/**
	 * The ChangeMaker Program in lecture.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int change, quarter, dime, nickel, penny;
		int rem;
		change = input.nextInt();
		quarter = change/25;
		rem = change % 25;
		dime = rem / 10;
		rem = rem % 10;
		nickel = rem / 5;
		penny = rem % 5;
		System.out.println("Quarter "+quarter);
		System.out.println("Dime "+dime);
		System.out.println("Nickel "+nickel);
		System.out.println("Penny "+penny);
		input.close();
	}

}
