import java.util.Scanner;
public class TwoscompRepresentation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int d3 = input.nextInt();
		int d2 = input.nextInt();
		int d1 = input.nextInt();
		int d0 = input.nextInt();
		int result = -d3 * (2 * 2 * 2)  + d2 *(2 * 2) + d1 * 2 + d0;
		System.out.println(result);
	}

}
