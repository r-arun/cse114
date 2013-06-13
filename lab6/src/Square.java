import java.util.Scanner;

public class Square {

	public static int square(int n){
		int ret = n * n;
		return ret;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer as input:");
		int n = input.nextInt();
		int result = square(n);
		System.out.println("Square of "+ n + " = "+result);
	}

}
