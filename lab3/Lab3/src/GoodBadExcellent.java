import java.util.Scanner;
public class GoodBadExcellent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer as input");
		int a = input.nextInt();
		if( a % 2 == 0 && a % 3 == 0)
			System.out.println("Excellent Number");
		else if( a % 2 == 0 || a % 3 == 0)
			System.out.println("Good Number");
		else
			System.out.println("Bad Number");

	}

}
