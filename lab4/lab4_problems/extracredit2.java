import java.util.Scanner;
public class extracredit2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int div = input.nextInt();
		switch(div){
		case 4:
			/*
			System.out.println(Integer.toBinaryString(num));
			System.out.println(Integer.toBinaryString(4));
			System.out.println(Integer.toBinaryString(3));
			System.out.println(Integer.toBinaryString(num & 3));
			*/
			if((num & 3) == 0)
				System.out.println("Divisible by 4");
			else
				System.out.println("Not divisible by 4");
			break;
		case 8:
			/*
			System.out.println(Integer.toBinaryString(num));
			System.out.println(Integer.toBinaryString(8));
			System.out.println(Integer.toBinaryString(7));
			System.out.println(Integer.toBinaryString(num & 7));
			*/
			if((num & 7) == 0)
				System.out.println("Divisible by 8");
			else
				System.out.println("Not divisible by 8");
			break;
		case 10:
			int quotient = num / 10;
			int rem = num - 10 * quotient;
			if(rem == 0)
				System.out.println("Divisible by 10");
			else
				System.out.println("Not divisible by 10");
		}

	}

}
