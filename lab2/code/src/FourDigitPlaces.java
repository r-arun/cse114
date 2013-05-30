import java.util.Scanner;
public class FourDigitPlaces {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println("First digit = "+ num % 10);
		num = num / 10;
		System.out.println("Second digit = "+ num % 10);
		num = num / 10;
		System.out.println("Third digit = "+ num % 10);
		num = num / 10;
		System.out.println("Fourth digit = "+ num % 10);
	}

}
