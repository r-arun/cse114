import java.util.Scanner;
public class BigThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a, b, c;
		int biggest;
		System.out.print("Enter the first number: ");
		a = input.nextInt();
		System.out.print("Enter the second number: ");
		b = input.nextInt();
		System.out.print("Enter the third number: ");
		c = input.nextInt();
		if( a > b && a > c){
			biggest = a;
		}
		else if(b > a && b > c){
			biggest = b;
		}
		else{
			biggest = c;
		}
		System.out.println("Biggest number is "+biggest);
	}

}
