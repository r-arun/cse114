import java.util.Scanner;
public class extracredit1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature");
		int temp = input.nextInt();
		int quotient = temp / 10;
		switch(quotient){
		case 3:
			System.out.println("Y");
			break;
		case 2:
			System.out.println("G");
			break;
		case 1:
			System.out.println("B");
			break;
		default:
			if(quotient >= 4)
				System.out.println("R");
			else
				System.out.println("W");
		}

	}

}
