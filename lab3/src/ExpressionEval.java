import java.util.Scanner;
public class ExpressionEval {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer as input");
		int a = input.nextInt();
		System.out.println("Enter a real number as input");
		double c = input.nextDouble();
		if(a == 4.0){
			System.out.println("a is 4.0");
		}
		double e = (4/3.0) * 3.0;
		if(e == 4){
			System.out.println("e is 4.0");
		}
		double d = (4/3.0 + 1.0 - 0.5 - c)*3.0;
		if(a == d){
			System.out.println("d is 4");
		}
		System.out.println("End of execution");
	}

}
