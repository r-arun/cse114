import java.util.Scanner;
public class Even {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a positive interger as input");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int remainder = num % 2;
		if(remainder == 0){
			System.out.println(num+ " is an even number");
		}
		else{
			System.out.println(num+" is an odd number");
		}
		System.out.println("End of Processing");
	}

}
