import java.util.Scanner;
public class DivTestWithoutMod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to test:");
		int num = input.nextInt();
		System.out.println("Enter the divisor (2 or 5):");
		int div = input.nextInt();
		int quotient = (num/10);
		int lastDigit = num - (quotient * 10);
		switch(div){
		case 2:
			switch(lastDigit){
			//last digit is even
				case 0: case 2: case 4: case 6: case 8:
					System.out.println("Divisible by 2");
					break;
				default:
					System.out.println("Not Divisible by 2");
			}
			break;
		case 5:
			if(lastDigit == 0 || lastDigit == 5)
				System.out.println("Number is divisible by 5");
			else
				System.out.println("Number is not divisible by 5");
			break;	
		default:
			System.out.println("Enter the correct value of divisior");
		}

	}
}
