import java.util.Scanner;

/*The aim of the example is to
 * demonstrate how to get user
 * input from the console.
 */
public class InputExamples{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String name = input.next();
		int age = input.nextInt();
		float weight = input.nextFloat();
		System.out.println("My name is "+name);
		System.out.println("My age is "+age);
		System.out.println("My weight is "+weight);
		input.close();
	}
}