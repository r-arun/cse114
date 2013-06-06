import java.util.Scanner;
public class onescomplement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.print("Binary representaion of "+num+" is:");
		System.out.println(Integer.toBinaryString(num));
		int comp = ~num;
		System.out.print("1's complement of "+num+" is:");
		System.out.println(Integer.toBinaryString(comp));
		

	}

}
