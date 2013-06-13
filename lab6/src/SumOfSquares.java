import java.util.Scanner;
/**
 * 
 */


public class SumOfSquares {
	public static int square(int n){
		return n * n ;
	}
	public static int sum_of_square(int n){
		int sum = 0;
		for(int i = 1; i <= n; ++i)
			sum += square(i);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println("Sum of squares of sum "+ sum_of_square(num));
	}

}
