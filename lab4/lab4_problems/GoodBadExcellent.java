import java.util.Scanner;
public class GoodBadExcellent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if( num % 2 == 0 || ( num % 3 == 0 && num % 5 == 0))
			System.out.println(num+" is a good number");
		else if( num % 2 == 0 &&  num % 3 == 0 && num % 5 != 0)
			System.out.println(num+" is a good number");
		else
			System.out.println(num + " is a bad number");
	}

}
