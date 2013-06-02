import java.util.Scanner;
public class BigTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = input.nextInt();
		System.out.println("Enter the second number");
		int b = input.nextInt();
		if( a > b){
			System.out.println(a+" is bigger than "+b);
		}
		if( a < b){
			System.out.println(b+" is bigger than "+a);
		}
		if( a == b){
			System.out.println(a+" is equal to "+b);
		}

	}

}
