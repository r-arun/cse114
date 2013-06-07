import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the operation (+, -, *, /) :" );
		String operation = input.next();
		System.out.println("Enter two integers:");
		int a = input.nextInt();
		int b = input.nextInt();
		int result = 0;
		switch(operation){
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
			result = a / b;
			break;
		default:
			System.out.println("Incorrect operator");
			return;
		}
		System.out.println("Result "+result);
	}

}
